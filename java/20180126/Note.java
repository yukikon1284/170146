import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Note {
	public static void main(String[] args) {
		byte[] buff = new byte[1024];
		InputStream inStr = null;
		OutputStream outStr = null;
		boolean cont = true;
		try{
			Socket serverSocket = new Socket(scanS(), Integer.parseInt(scanS()));
			inStr = serverSocket.getInputStream();
			outStr = serverSocket.getOutputStream();
			while (true) {
				System.out.println("送信");
				while(cont){
					int n = System.in.read(buff);
					if (buff[0] == '.') cont = false;
					outStr.write(buff, 0, n);
				}
				System.out.println("受信");
				cont = true;
				while(cont){
					int n = inStr.read(buff);
					if (buff[0] == '.') cont = false;
					System.out.write(buff, 0, n);
				}
				cont = true;
			}
		}catch (IOException e) {
			System.err.println("ネットワークエラー");
			System.out.println(e);
			System.exit(1);
		}
	}
	private static String scanS(){
		return new Scanner(System.in).nextLine();
	}
}
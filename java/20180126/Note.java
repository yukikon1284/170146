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
			Socket serverSocket = new Socket(scanS, Integer.parseInt(scanS()));
			inStr = serverSocket.getInputStream();
			outStr = serverSocket.getOutputStream();
		}catch (IOException e) {
			System.err.println("ネットワークエラー");
			System.out.println(e);
			System.exit(1)
		}
	}
	private static String scanS(){
		p(direction());
		return new Scanner(System.in).nextLine();
	}
}
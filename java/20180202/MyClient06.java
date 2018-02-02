import java.net.*;
import java.io.*;
import java.util.Scanner;
public class MyClient06 {
	public static void main(String[] args) {
		try{
			Socket serverSocket = new Socket("localhost", 3999);
			OutputStream out = serverSocket.getOutputStream();

			while(true){
				byte[] buff = scanS().getBytes();
				out.write(buff, 0, buff.length);
			}

		}catch(Exception e){
			System.out.println(e);
		}
	}
	private static String scanS(){
		System.out.print("input data >");
		return new Scanner(System.in).nextLine();
	}
}
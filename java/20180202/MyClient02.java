import java.net.*;
import java.io.*;
public class MyClient02 {
	public static void main(String[] args) {
		try{
			Socket serverSocket = new Socket("localhost", 5999);
			OutputStream out = serverSocket.getOutputStream();
			byte[] buff = "asd".getBytes();
			out.write(buff, 0, buff.length);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
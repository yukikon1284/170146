import java.io.*;
import java.net.*;
public class MyServer04 {
	public static void main(String[] args) {
		try{
			ServerSocket servsock = new ServerSocket(5000, 300);
			Socket sock = servsock.accept();
			OutputStream out = sock.getOutputStream();
			
			byte[] buff = "HELLO".getBytes();
			out.write(buff, 0, buff.length);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
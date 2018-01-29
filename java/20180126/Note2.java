import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Note2 {
	public static void main(String[] args) {
     	byte[] buff = new byte[1024];
	     InputStream inStr = null;
		 OutputStream outStr = null;
	     boolean cont = true;
	     try{
	     	ServerSocket servsock = new ServerSocket(7000, 300);
	     	Socket acceptSocket = servsock.accept();
	     	System.out.println(acceptSocket);
	     	inStr = acceptSocket.getInputStream();
	     	outStr = acceptSocket.getOutputStream();
	     	while (true) {
	     		System.out.println("受信");
				while(cont){
					int n = inStr.read(buff);
					if (buff[0] == '.') cont = false;
					System.out.write(buff, 0, n);
				}
				System.out.println("送信");
				cont = true;
				while(cont){
					int n = System.in.read(buff);
					if (buff[0] == '.') cont = false;
					outStr.write(buff, 0, n);
				}
				cont = true;
			}
	     }catch(IOException e){
	     	System.err.println("ネットワークエラー");
			System.out.println(e);
			System.exit(1);
	     }
	}
}
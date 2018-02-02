import java.io.*;
import java.net.*;
import java.util.*;
public class MyServer07 {
	public static void main(String[] args) {
		try{
			ServerSocket servsock = new ServerSocket(3999, 300);
			for (int i=0; i<10; i++) {
				Socket sock = servsock.accept();
				System.out.println(sock.getInetAddress());

				InputStream instr = sock.getInputStream();
				byte[] buff = new byte[1024];
				int n = instr.read(buff);
				System.out.write(buff, 0, n);

				OutputStream out = sock.getOutputStream();
				out.write(buff, 0, n);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
import java.io.*;
import java.net.*;
import java.util.*;
public class MyServer08 {
	public static void main(String[] args) {
		try{
			ServerSocket servsock = new ServerSocket(3999, 300);
			Socket sock = servsock.accept();
			System.out.println(sock.getInetAddress());
			for (int i=0; i<10; i++) {

				InputStream instr = sock.getInputStream();
				byte[] buff = new byte[1024];
				int n = instr.read(buff);
				System.out.write(buff, 0, n);
				System.out.println("");
				if (new String(buff, 0, n).equals("exit")) System.exit(1);
				OutputStream out = sock.getOutputStream();
				out.write(buff, 0, n);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
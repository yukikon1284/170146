import java.io.*;
import java.net.*;
import java.util.*;
public class MyServer05 {
	public static void main(String[] args) {
		try{
			ServerSocket servsock = new ServerSocket(4000, 300);
			Socket sock = servsock.accept();
			System.out.println(sock.getInetAddress());

			InputStream instr = sock.getInputStream();
			byte[] buff = new byte[1024];
			int n = instr.read(buff);
			System.out.write(buff, 0, n);

			OutputStream out = sock.getOutputStream();
			Date d = new Date();
			String[] str = {"yukikon\n",d.toString()};
			for (int i=0; i<str.length; i++) {
				buff = str[i].getBytes();
				out.write(buff, 0, buff.length);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
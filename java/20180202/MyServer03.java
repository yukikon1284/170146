import java.io.*;
import java.net.*;
public class MyServer03 {
	public static void main(String[] args) {
		try{
			ServerSocket servsock = new ServerSocket(5999, 300);
			Socket sock = servsock.accept();
			InputStream instr = sock.getInputStream();
			byte[] buff = new byte[1024];
			int n = instr.read(buff);
			System.out.write(buff, 0, n);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
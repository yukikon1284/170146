import java.net.*;
import java.io.*;
public class MyClient03 {
	public static void main(String[] args) {
		try{
			Socket serverSocket = new Socket("localhost", 5000);
			InputStream instr = serverSocket.getInputStream();
			byte[] buff = new byte[1024];
			int n = instr.read(buff);
			System.out.write(buff, 0, n);
			instr.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
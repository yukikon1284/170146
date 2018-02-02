import java.net.*;
import java.io.*;
public class MyClient05 {
	public static void main(String[] args) {
		try{
			Socket serverSocket = new Socket("localhost", 4000);
			OutputStream out = serverSocket.getOutputStream();
			byte[] buff = "170146".getBytes();
			out.write(buff, 0, buff.length);

			InputStream instr = serverSocket.getInputStream();
			buff = new byte[1024];
			for (int i=0; i<2; i++) {
				int n = instr.read(buff);
				System.out.write(buff, 0, n);
			}

		}catch(Exception e){
			System.out.println(e);
		}
	}
}
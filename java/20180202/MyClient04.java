import java.net.*;
import java.io.*;
public class MyClient04 {
	public static void main(String[] args) {
		try{
			Socket serverSocket = new Socket("172.16.21.56", 4999);
			OutputStream out = serverSocket.getOutputStream();
			String[] str = {"170146","yukikon1284","HELLO!"};
			for (int i=0; i<str.length; i++) {
				byte[] buff = str[i].getBytes();
				out.write(buff, 0, buff.length);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
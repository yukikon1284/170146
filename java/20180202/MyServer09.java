import java.io.*;
import java.net.*;
import java.util.*;
import java.io.*;
public class MyServer09 {
	public static void main(String[] args) {
		try{
			ServerSocket servsock = new ServerSocket(3999, 300);
			Socket sock = servsock.accept();
			bfwrite(""+sock.getInetAddress());
			for (int i=0; i<10; i++) {

				InputStream instr = sock.getInputStream();
				byte[] buff = new byte[1024];
				int n = instr.read(buff);
				System.out.write(buff, 0, n);
				System.out.println("");
				String str = new String(buff, 0, n);
				bfwrite(str);
				if (str.equals("exit")) System.exit(1);
				OutputStream out = sock.getOutputStream();
				out.write(buff, 0, n);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	private static void bfwrite(String str){
		try{
			BufferedWriter bf = new BufferedWriter(new FileWriter(new File("data.txt"), true));
			bf.write(str+"\n");
			bf.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
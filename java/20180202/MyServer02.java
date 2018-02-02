import java.net.*;
public class MyServer02 {
	public static void main(String[] args) {
		try{
			ServerSocket servsock = new ServerSocket(6000, 300);
			Socket sock = servsock.accept();
			System.out.println(sock.getInetAddress());
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
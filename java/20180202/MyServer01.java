import java.net.*;
public class MyServer01 {
	public static void main(String[] args) {
		try{
			ServerSocket servsock = new ServerSocket(6000, 300);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
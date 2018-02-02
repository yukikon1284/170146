import java.net.*;
public class MyClient01 {
	public static void main(String[] args) {
		try{
			Socket serverSocket = new Socket("localhost", 6000);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
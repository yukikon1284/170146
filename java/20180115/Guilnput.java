/*import java.io.*;
public class Guilnput {
	public static void main(String[] args) {
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("data.txt")));
			String[] data = {"山口弘展","東京","@hiro","O形"};
			bw.write(test(data, " "));
			bw.close();
		}catch(IOException e){
			System.out.println("asd");
		}
	}
	private static String test(String[] data, String space){
		String test = "";
		for (int i=0; i<data.length; i++) {
			test += data[i];
			if (i<=data.length) test += space;
		}
		return test;
	}
}*/

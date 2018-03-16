public class Test {
	public static void main(String[] args) {
		Boolean asd = true;
		while (asd) {
			System.out.println("動作停止しませんか？");
			try{
				asd = Tool.yesNo();
			}catch(Exception e){
				System.out.println(e);
			}	
		}
	}
}
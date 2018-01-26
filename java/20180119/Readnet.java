import java.io.*;
  import java.net.*;
  
  public class Readnet
  {

    /*public static void main(String[] args) {
      byte[] buff = new byte[1024];
      Socket readsock = null;
      InputStream instr = null;
      boolean cont = true;

      try{
        readsock = new Socket(args[0], Integer.parseInt(args[1]));
        instr = readsock.getInputStream();
      }catch(Exception e){
        System.err.println("net");
        System.exit(1);
      }
      while (cont) {
        try{
          int n = instr.read(buff);
          System.out.write(buff, 0, n);
        }catch (Exception e) {
          cont = false;
        }
      }
      try{
        instr.close();
      }catch (Exception e) {
        System.err.println("net")
        System.exit(1);
      }
    }*/
  	public static void main(String[] args)
  	{
      System.out.println("asd");
  		byte[]	buff	=	new	byte[1024];		// 読み取り用の配列(1kByte)
  		Socket	readsock	=	null;		// ソケット
  		InputStream	instr	=	null;		// ストリーム
  		boolean	cont	=	true;		// フラグ
  
  		// 指定のポートに接続し、ソケットを作成する。te
  		//	次に InputStream オブジェクトを生成する。
      /*String asd = new java.util.Scanner(System.in).nextLine();
      String asd2 = new java.util.Scanner(System.in).nextLine();*/
  		while (true) {
        try {
        //readsock  = new Socket(asd, Integer.parseInt(asd2));
       readsock  = new Socket("172.16.21.56", Integer.parseInt("6000"));
        instr = readsock.getInputStream();
      }
        catch (Exception  e)  {
        System.err.println("ネットワークエラーです。");
        System.exit(1);
      }
  
  
      }
  		// データ終了まで次の処理を繰り返す。
  	
  
  	}
  }
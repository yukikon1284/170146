import  java.io.*;
  import  java.net.*;
  import  java.util.*;
  
  class Netclock
  {
    public static void main(String[] args) {
     ServerSocket servsock = null;
     Socket sock;
     OutputStream out;
     String outstr;
     int i;
     try{
      servsock = new ServerSocket(7000, 300);
      while (true) {
        sock = servsock.accept();
        System.out.println(sock);
        outstr = "特にない";
        out = sock.getOutputStream();
        for (i = 0; i<outstr.length(); i++) {
          out.write((int) outstr.charAt(i));
          out.write('\n');
        }
      }
     }catch (Exception e) {
      System.out.println(e);
       System.exit(1);
     }
    }
    /*public static void  main(String[] args)
    {
      ServerSocket  servsock  = null;
      Socket  sock;
      OutputStream  out;          
      String  outstr;
      int i;
      Date  d;
  
      try {
          // サーバ用のsocketを生成する（ポート6000番）
        servsock = new  ServerSocket(6000,  300);
          // 繰り返し、接続を待つ　＆　メッセージを送る
        while(true)
        {
            // 接続してきたら、ソケットを生成する
          sock  = servsock.accept();    
            // 接続あり！メッセージを出力する
              System.out.println("キター！");
          // 日付のデータを取得する
          d = new Date();
            // 出力用メッセージ文字列をつくる
          outstr  = "\n"
          + "Hello, this is Netclock server."
          + "\n"  + d.toString()  + "\n"
          + "Thank you."  + "\n";
  
          // 出力（送信）ストリームをつくる
          out = sock.getOutputStream();
            // ストリームに、メッセージを書き込む
          for(i=0;  i<outstr.length();  i++)
            out.write((int) outstr.charAt(i));
          out.write('\n');
      
          // ソケットを閉じる（接続を切る）
          sock.close();
        }
      }
      catch (IOException  e)  {
        System.exit(1);
      }
    }*/
  }
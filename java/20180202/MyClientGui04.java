import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class MyClientGui04 extends JFrame implements ActionListener {
	JTextField jtf = new JTextField(10);
	public static void main(String[] args) {
		MyClientGui04 msg = new MyClientGui04();
		msg.setVisible(true);
	}
	MyClientGui04(){
		setTBD("MyClientGui04", new int[] {400,400,300,200});
		JButton jb = new JButton("click");
		jb.addActionListener(this);
		JPanel jp = new JPanel();
		jp.add(jb, BorderLayout.SOUTH);
		add(jp);
		jp.add(this.jtf);
	}
	private void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e1){
		try{
			Socket serverSocket = new Socket("172.16.21.56", 4999);
			OutputStream out = serverSocket.getOutputStream();
			String[] str = {"170146","yukikon1284",this.jtf.getText()};
			for (int i=0; i<str.length; i++) {
				byte[] buff = str[i].getBytes();
				out.write(buff, 0, buff.length);
			}
			serverSocket.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
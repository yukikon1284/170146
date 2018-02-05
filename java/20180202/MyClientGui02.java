import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class MyClientGui02 extends JFrame implements ActionListener {
	JTextField[] jtf = new JTextField[2];
	public static void main(String[] args) {
		MyClientGui02 msg = new MyClientGui02();
		msg.setVisible(true);
	}
	MyClientGui02(){
		setTBD("MyClientGui02", new int[] {400,400,300,200});
		JButton jb = new JButton("click");
		jb.addActionListener(this);
		JPanel jp = new JPanel();
		jp.add(jb, BorderLayout.SOUTH);
		add(jp);

	}
	private void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e1){
		try{
			Socket serverSocket = new Socket("localhost", 5999);
			OutputStream out = serverSocket.getOutputStream();
			byte[] buff = "asd".getBytes();
			out.write(buff, 0, buff.length);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
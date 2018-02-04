import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class MyServerGui04 extends JFrame implements ActionListener {
	public static void main(String[] args) {
		MyServerGui04 msg = new MyServerGui04();
		msg.setVisible(true);
	}
	MyServerGui04(){
		setTBD("MyServerGui04", new int[] {400,400,300,200});
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
			ServerSocket servsock = new ServerSocket(5000, 300);
			Socket sock = servsock.accept();
			OutputStream out = sock.getOutputStream();
			
			byte[] buff = "HELLO".getBytes();
			out.write(buff, 0, buff.length);
			out.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
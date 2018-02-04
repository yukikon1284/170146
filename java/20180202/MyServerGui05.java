import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import java.util.*;
public class MyServerGui05 extends JFrame implements ActionListener {
	JLabel jl = new JLabel();
	JTextField[] jtf = new JTextField[2];
	public static void main(String[] args) {
		MyServerGui05 msg = new MyServerGui05();
		msg.setVisible(true);
	}
	MyServerGui05(){
		setTBD("MyServerGui05", new int[] {400,400,300,200});
		JButton jb = new JButton("click");
		jb.addActionListener(this);
		JPanel jp = new JPanel();
		jp.add(jb, BorderLayout.SOUTH);
		add(jp);
		jp.add(this.jl);
		for (int i=0; i<this.jtf.length; i++) {
			this.jtf[i] = new JTextField(10);
			jp.add(this.jtf[i]);	
		}
	}
	private void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e1){
		try{
			ServerSocket servsock = new ServerSocket(4000, 300);
			Socket sock = servsock.accept();
			System.out.println(sock.getInetAddress());

			InputStream instr = sock.getInputStream();
			byte[] buff = new byte[1024];
			int n = instr.read(buff);
			System.out.write(buff, 0, n);

			this.jl.setText(new String(buff, 0, n));
			this.jl.setText(""+sock.getInetAddress());
			this.jtf[0].setText(new String(buff, 0, n));
			this.jtf[1].setText(""+sock.getInetAddress());

			OutputStream out = sock.getOutputStream();
			Date d = new Date();
			String[] str = {"yukikon\n",d.toString()};
			for (int i=0; i<str.length; i++) {
				buff = str[i].getBytes();
				out.write(buff, 0, buff.length);
			}
			out.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
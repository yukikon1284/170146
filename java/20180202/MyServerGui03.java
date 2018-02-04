import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class MyServerGui03 extends JFrame implements ActionListener {
	JLabel jl = new JLabel();
	JTextField jtf1 = new JTextField();
	JTextField[] jtf = new JTextField[2];
	public static void main(String[] args) {
		MyServerGui03 msg = new MyServerGui03();
		msg.setVisible(true);
	}
	MyServerGui03(){
		setTBD("MyServerGui03", new int[] {400,400,300,200});
		JButton jb = new JButton("click");
		jb.addActionListener(this);
		JPanel jp = new JPanel();
		jp.add(jb, BorderLayout.SOUTH);
		add(jp);
		jp.add(this.jl);
		jp.add(this.jtf1);
	}
	private void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e1){
		try{
			ServerSocket servsock = new ServerSocket(5999, 300);
			Socket sock = servsock.accept();
			InputStream instr = sock.getInputStream();
			byte[] buff = new byte[1024];
			int n = instr.read(buff);
			System.out.write(buff, 0, n);
			this.jl.setText(new String(buff, 0, n));
			this.jtf1.setText(""+sock.getInetAddress());
			instr.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
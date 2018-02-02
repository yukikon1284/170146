import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
public class MyServerGui02 extends JFrame implements ActionListener {
	JLabel jl = new JLabel();
	JTextField jtf1 = new JTextField(10);
	JTextField[] jtf = new JTextField[2];
	public static void main(String[] args) {
		MyServerGui02 msg = new MyServerGui02();
		msg.setVisible(true);
	}
	MyServerGui02(){
		setTBD("MyServerGui02", new int[] {400,400,300,200});
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
			ServerSocket servsock = new ServerSocket(6000, 300);
			Socket sock = servsock.accept();
			System.out.println(""+sock.getInetAddress());
			this.jl.setText(""+sock.getInetAddress());
			this.jtf1.setText(""+sock.getInetAddress());
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
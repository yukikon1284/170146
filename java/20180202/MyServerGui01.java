import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
public class MyServerGui01 extends JFrame implements ActionListener {
	JTextField[] jtf = new JTextField[2];
	public static void main(String[] args) {
		MyServerGui01 msg = new MyServerGui01();
		msg.setVisible(true);
	}
	MyServerGui01(){
		setTBD("MyServerGui01", new int[] {400,400,300,200});
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
			ServerSocket servsock = new ServerSocket(6000, 300);
			System.out.println("サーバー作成");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
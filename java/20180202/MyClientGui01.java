import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
public class MyClientGui01 extends JFrame implements ActionListener {
	JTextField[] jtf = new JTextField[2];
	public static void main(String[] args) {
		MyClientGui01 msg = new MyClientGui01();
		msg.setVisible(true);
	}
	MyClientGui01(){
		setTBD("MyClientGui01", new int[] {400,400,300,200});
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
			Socket serverSocket = new Socket("localhost", 6000);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
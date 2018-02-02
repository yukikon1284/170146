import java.io.*;
import java.net.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
public class Note extends JFrame{
	public static void main(String[] args) {
		Note no = new Note();
		no.setVisible(true);
	}
	Note(){
		setTBD("asd", new int[] {400,400,300,200});
		JPanel asd = new JPanel();
		asd.add(new JLabel("asdasd"));
		asd.add(new JLabel("asdwefa"));
		asd.setLayout(new GridLayout(1, 2));
		add(asd);
	}
	private void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/*private JButton setJB(String jbc){
		JButton jb = new JButton(jbc);
		jb.setActionCommand(jbc);
		return jb;
	}
	private JPanel setJP(){
		
	}
	private JPanel setJP(JTextField jtf){

	}
	private JPanel setJP(JPanel jp, int[] gridLayInt){
		return jp.setLayout(gridLayInt[0], gridLayInt[1]);
	}*/
}
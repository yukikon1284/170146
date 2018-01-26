/*import javax.swing.*;
import java.awt.*;
import java.io.*;
public class GuiInput extends JFrame {
	GuiInput(){
		setTBD("GuiInput", new int[] {400,400,300,200});
		JPanel jp = new JPanel();
		String str = readLine1("data.txt");
		jp.add(new JLabel(str));
		add(jp);
	}
	public static void main(String[] args) {
		GuiInput gi = new GuiInput();
		gi.setVisible(true);
	}
	void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public String readLine1(String name) {
		String str = "";
		try{
			BufferedReader bf = new BufferedReader(new FileReader(new File(name)));
			str = bf.readLine();
		}catch(IOException e){

		}
		return str;
	}
}*/

/*import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class GuiInput extends JFrame implements ActionListener{
	private JPanel jp;
	private CardLayout cl;
	public static void main(String[] args) {
		GuiInput gi = new GuiInput();
		gi.setVisible(true);
	}
	void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	GuiInput(){
		setTBD("GuiInput", new int[] {400,400,300,200});
		JPanel card = new JPanel();
		card.add(new JLabel("asd1"));
		card.add(new JButton("button"));

		JPanel card2 = new JPanel();
		card2.add(new JLabel("asd2"));

		this.jp = new JPanel();
		this.cl = new CardLayout();
		this.jp.setLayout(this.cl);

		this.jp.add(card, "asd1");
		this.jp.add(card2, "asd2");


		JButton jb = new JButton("asd1");
		jb.addActionListener(this);
		jb.setActionCommand("asd1");

		JButton jb2 = new JButton("asd2");
		jb2.addActionListener(this);
		jb2.setActionCommand("asd2");

		JPanel buttonjp = new JPanel();
		buttonjp.add(jb);
		buttonjp.add(jb2);
		getContentPane().add(this.jp);
		getContentPane().add(buttonjp, BorderLayout.PAGE_END);

	}
	public void actionPerformed(ActionEvent e){
		String cmd = e.getActionCommand();
		cl.show(this.jp,cmd);
	}
}*/


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class GuiInput extends JFrame implements ActionListener {
	JTextField[] jtf;
	GuiInput(){
		setTBD("GuiInput", new int[] {400,400,300,200});
		JPanel[] jp = new JPanel[2];
		for (int i=0; i<jp.length; i++) {
			jp[i] = new JPanel();
		}
		this.jtf = setJTF(6, 10);
		jp[0] = setJP1(new String[] {"名前","住所","生年月日","性別","好きなもの","特徴"});

		getContentPane().add(jp[0]);

		jp[1] = setJP2(new String[] {"Clear", "Ok"});
		getContentPane().add(jp[1], BorderLayout.SOUTH);

	}
	private JTextField[] setJTF(int number, int data){
		JTextField[] jtf = new JTextField[number];
		for (int i=0; i<jtf.length; i++) {
			jtf[i] = new JTextField(data);
		}
		return jtf;
	}
	private JPanel setJP1(String[] data){
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(data.length, 2));
		for (int i=0; i<data.length; i++) {
			jp.add(new JLabel(data[i]));
			if (i == 7) {
				
			}else {
				jp.add(this.jtf[i]);
			}
		}
		return jp;
	}
	private JPanel setJP2(String[] data){
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(1, 2));
		for (int i=0; i<data.length; i++) {
			JButton jb = new JButton(data[i]);
			jb.setActionCommand(data[i]);
			jp.add(jb);
		}
		return jp;
	}
	public static void main(String[] args) {
		GuiInput gi = new GuiInput();
		gi.setVisible(true);
	}
	private void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		String cmd = e.getActionCommand();
		if (cmd.equals("Clear")) {
			
		}else if (cmd.equals("Ok")) {
			
		}
	}
}
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Fukushu extends JFrame implements ActionListener{
	private JRadioButton[] radioButton;
	private JCheckBox[] checBox;
	private JLabel[][] label = {{new JLabel(), new JLabel(), new JLabel()},{new JLabel(), new JLabel(), new JLabel()}};
	public void actionPerformed(ActionEvent e){
		for (int i=0; i<radioButton.length; i++) this.label[0][i].setText(""+radioButton[i].isSelected());
		for (int i=0; i<checBox.length; i++) this.label[1][i].setText(""+this.checBox[i].isSelected());
	}
	Fukushu(){
		setTBD("Fukushu", new int[] {400,400,300,200});
		JMenuBar jMB = new JMenuBar();
		setJMenuBar(jMB);
		JMenu[] jM = {new JMenu("File"), new JMenu("Edit"), new JMenu("Help"),};
		for (int i=0; i<jM.length; i++) jMB.add(jM[i]);
		String[][] str = {{"new","open","close"},{"cut","copy","paste"},{"version","index"}};
		for (int i=0; i<str.length; i++) {
			JMenuItem[] jMI = setJMenuItem(str[i]);
			for (int n=0; n<jMI.length; n++) jM[i].add(jMI[n]);
		}
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(4, 3));
		String[] str2 = {"asd","qwe","zxc"};
		setRadioButton(str2);
		String[] str3 = {"jlk","uio","m,."};
		setCheckBox(str3);
		for (int i=0; i<this.radioButton.length; i++) 			jp.add(this.radioButton[i]);
		for (int i=0; i<this.label[0].length; i++) jp.add(this.label[0][i]);
		for (int i=0; i<this.radioButton.length; i++) jp.add(this.checBox[i]);
		for (int i=0; i<this.label[1].length; i++) jp.add(this.label[1][i]);
		JButton jb = new JButton("ok");
		jb.addActionListener(this);
		setButtonGroup();
		Container con = getContentPane();
		con.add(jp, BorderLayout.NORTH);
		con.add(new JPanel().add(jb));
	}
	void setButtonGroup(){
		ButtonGroup bG = new ButtonGroup();
		for (int i=0; i<this.radioButton.length; i++) bG.add(this.radioButton[i]);
	}
	void setRadioButton(String[] strArr){
		JRadioButton[] radioButton = new JRadioButton[strArr.length];
		for (int i=0; i<strArr.length; i++) radioButton[i] = new JRadioButton(strArr[i]);
		this.radioButton = radioButton;
	}
	void setCheckBox(String[] strArr){
		JCheckBox[] checBox = new JCheckBox[strArr.length];
		for (int i=0; i<strArr.length; i++) checBox[i] = new JCheckBox(strArr[i]);
		this.checBox = checBox;
	}
	private JMenuItem[] setJMenuItem(String[] str){
		JMenuItem[] jMI = new JMenuItem[str.length];
		for (int i=0; i<str.length; i++) jMI[i] = new JMenuItem(str[i]);
		return jMI;
	}
	void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Fukushu fu = new Fukushu();
		fu.setVisible(true);
	}
}
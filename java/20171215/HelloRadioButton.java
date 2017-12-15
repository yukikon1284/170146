import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class HelloRadioButton extends JFrame implements ActionListener{
	private JRadioButton[] radioButton = new JRadioButton[3];
	private JLabel jl;
	HelloRadioButton(){
		setTBD("ラジオボタン", new int[] {400,400,300,200});
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(5, 1));
		setRadioButton(new String[] {"asd","qwe","zxc"});
		for (int i=0; i<this.radioButton.length; i++) jp.add(this.radioButton[i]);
		setButtonGroup();
		JButton jb = new JButton("ok");
		jb.addActionListener(this);
		jp.add(jb);
		this.jl = new JLabel();
		jp.add(this.jl);
		Container con = getContentPane();
		con.add(jp);
	}
	void setButtonGroup(){
		ButtonGroup bG = new ButtonGroup();
		for (int i=0; i<this.radioButton.length; i++) bG.add(this.radioButton[i]);
	}
	void setRadioButton(String[] strArr){
		for (int i=0; i<this.radioButton.length; i++) this.radioButton[i] = new JRadioButton(strArr[i]);
	}
	void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		for (int i=0; i<this.radioButton.length; i++) if (this.radioButton[i].isSelected()) this.jl.setText(this.radioButton[i].getText()+"選択");
	}
	public static void main(String[] args) {
		HelloRadioButton hRB = new HelloRadioButton();
		hRB.setVisible(true);
	}
}
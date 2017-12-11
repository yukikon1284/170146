import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HelloJCheckBox extends JFrame implements ActionListener{
	private JCheckBox[] jcb = new JCheckBox[3];
	private Boolean[] text = new Boolean[3];
	private JLabel[] jl = new JLabel[3];
	HelloJCheckBox(){
		setTBD("HelloJCheckBox", new int[] {400,400,300,200});
		String[] str = {"Здравствуйте!","HEllo!","Guten Tag!"};
		Boolean[] bool = {false, true, true};
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(8, 1));
		jp.add(new JLabel("あなたが使う挨拶はどれ?"));
		for (int i=0; i<this.jcb.length; i++) {
			this.jcb[i] = new JCheckBox(str[i], bool[i]);
			jp.add(this.jcb[i]);
		}
		JButton jb = new JButton("ok");
		jb.addActionListener(this);
		jp.add(jb);
		for (int i=0; i<this.jl.length; i++) {
			jl[i] = new JLabel();
			jp.add(this.jl[i]);
		}
		Container con = getContentPane();
		con.add(jp);
	}
	void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		for (int i=0; i<jl.length; i++) this.jl[i].setText(""+jcb[i].isSelected());
	}
	public static void main(String[] args) {
		HelloJCheckBox hCB = new HelloJCheckBox();
		hCB.setVisible(true);
	}
}
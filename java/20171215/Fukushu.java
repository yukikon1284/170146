import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Fukushu extends JFrame implements ActionListener{
	private JCheckBox jcb;
	// private Boolean[] text = new Boolean[3];
	private JLabel jl;
	Fukushu(){
		setTBD("Fukushu", new int[] {400,400,300,200});
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(3, 1));
		this.jcb = new JCheckBox("aasd");
		jp.add(this.jcb);
		JButton jb = new JButton("ok");
		jb.addActionListener(this);
		jp.add(jb);
		this.jl = new JLabel();
		jp.add(this.jl);
		Container con = getContentPane();
		con.add(jp);
	}
	void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		jl.setText(""+jcb.isSelected());
	}
	public static void main(String[] args) {
		Fukushu hCB = new Fukushu();
		hCB.setVisible(true);
	}
}
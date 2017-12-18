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
import javax.swing.JTextField;
public class Guilnput extends JFrame implements ActionListener{
	private JTextField[] jTF = new JTextField[6];
	Guilnput(){
		setTBD("asd", new int[] {400,400,300,200});
		JPanel jP = new JPanel();
		jP.setLayout(new GridLayout(6, 2));
		setText();
		String[] str = {"1","2","3","4","5","6","7"};
		for (int i=0; i<6; i++) {
			jP.add(new JLabel(str[i]));
			jP.add(this.jTF[i]);
		}
		add(jP);
	}
	private void setText(){
		for (int i=0; i<this.jTF.length; i++) this.jTF[i] = new JTextField();
	}
	public static void main(String[] args) {
		Guilnput gu = new Guilnput();
		gu.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){

	}
	void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
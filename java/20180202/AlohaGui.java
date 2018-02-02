import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AlohaGui extends JFrame implements ActionListener {
	JLabel jl = new JLabel();
	JTextField jtf = new JTextField();
	public static void main(String[] args) {
		AlohaGui ag = new AlohaGui();
		ag.setVisible(true);
	}
	AlohaGui(){
		setTBD("AlohaGui", new int[] {400,400,300,200});
		JButton jb = new JButton("click");
		jb.addActionListener(this);
		JPanel jp = new JPanel();
		jp.add(this.jl);
		jp.add(this.jtf);
		jp.add(jb, BorderLayout.SOUTH);
		add(jp);

	}
	private void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("ALOHA");
		this.jl.setText("ALOHA");
		this.jtf.setText("ALOHA");
	}
}
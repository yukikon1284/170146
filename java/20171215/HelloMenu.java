import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class HelloMenu extends JFrame{
	HelloMenu(){
		setTBD("メニュー", new int[] {400,400,300,200});
		JMenuItem[] jMI = {new JMenuItem("asd"), new JMenuItem("qwe"), new JMenuItem("zxc")};
		JMenu jM = new JMenu("asdqwezxc");
		for (int i=0; i<jMI.length; i++) jM.add(jMI[i]);
		JMenuBar jMB = new JMenuBar();
		jMB.add(jM);
		setJMenuBar(jMB);
	}
	void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		HelloMenu hM = new HelloMenu();
		hM.setVisible(true);
	}
}
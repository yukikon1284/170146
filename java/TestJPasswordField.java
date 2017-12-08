import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JPanel;
class TestJPasswordField extends JFrame{
	public static void main(String[] args){
		TestJPasswordField te = new TestJPasswordField();
		te.setVisible(true);
	}
	TestJPasswordField(){
		setTBD("asda", new int[] {400,400,300,200});
		JPasswordField jpf = new JPasswordField("ad", 10);
		JPanel jp = new JPanel();
		jp.add(jpf);
		this.add(jp);
	}
	private  void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
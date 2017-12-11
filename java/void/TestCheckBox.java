import java.awt.*;
import javax.swing.*;
class TestCheckBox extends JFrame{
	public static void main(String[] args) {
		TestCheckBox te = new TestCheckBox();
		te.setVisible(true);
	}
	TestCheckBox(){
		setTBD("aad", new int[] {400,400,300,200});
		JPanel jp = new JPanel();
		String[] boxName = {"asd","qwe","zxc"};
		for (int i=0; i<boxName.length; i++) jp.add(new JCheckBox(boxName[i]));
		add(jp);
	}
	private void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
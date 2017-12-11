import javax.swing.*;
import java.awt.*;
public class Hello2{
	public static void main(String[] args) {
		int[] size = {400, 400, 300, 200};
		NoteFrame frame = new NoteFrame("asd", size, "HELLO");
		frame.setVisible(true);
	}
}
class NoteFrame extends JFrame{
	private JPanel panel;
	NoteFrame(String title, int[] size, String txt){
		setTBD(title, size);
		panel = new JPanel();
		panel.add(new JTextField(txt));
		add(panel);
	}
	void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
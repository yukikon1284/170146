import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Note{
	public static void main(String[] args) {
		int[] size = {400, 400, 300, 200};
		NoteFrame frame = new NoteFrame("asd", size, "Click Me!");
		frame.setVisible(true);
	}
}
class NoteFrame extends JFrame{
	private JButton button;
	private JPanel panel;

	NoteFrame(String title, int[] size, String buttonName){
		setTBD(title, size);
		panel = new JPanel();
		panel.add(new JButton(buttonName));
		add(panel);
	}
	void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

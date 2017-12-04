import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class TestGuiFrame extends JFrame{
	private JTextField field;
	private JPanel panel;
	private Container container;

	TestGuiFrame(String title, int[] size){
		setTBD(title, size);
		this.container = getContentPane();
		setPanel();
		this.field = new JTextField(10);
		this.panel.add(this.field, BorderLayout.NORTH);
	}
	void setPanel(){
		this.panel = new JPanel();
		this.container.add(this.panel, BorderLayout.NORTH);
	}
	void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
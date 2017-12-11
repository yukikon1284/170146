import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/*public class Note{
	public static void main(String[] args) {
		NoteFrame frame = new NoteFrame("asd");
		// JFrame frame = new JFrame();
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setLocation(400, 400);
		// frame.setSize(300, 200);
		// frame.setBounds(400, 400, 300, 200);
		 
			// 上 NORTH
			// 下 SOUTH
			// 右 EAST
			// 左 WEST
			// 中 CENTER
		
		JButton[] but = {new JButton("PUSH1"),new JButton("PUSH2"),new JButton("PUSH3")};
		JPanel panel = new JPanel();
		// but[0].addActionListener(new Case());
		panel.add(but[0]);
		panel.add(but[1]);
		panel.add(but[2]);
		frame.add(panel, BorderLayout.SOUTH);

		frame.setVisible(true);
	}
}*/

class TestGui{
	public static void main(String[] args) {
		int[] size = {400,400,300,200};
		TestGuiFrame testGuiFrame = new TestGuiFrame("asdTitle", size);
		testGuiFrame.setVisible(true);
	}
}


package bbbb;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

public class aaaaa extends JFrame {
		public aaaaa() {
				setTitle("�޸���");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Container c = getContentPane();
				
				JMenuBar mb = new JMenuBar();
				JMenu FileMenu = new JMenu("����(F)");
				JMenu EditMenu = new JMenu("����(E)");
				JMenu Formenu = new JMenu("����(O)");
				JMenu ViewMenu = new JMenu("����(V)");
				JMenu HelpMenu = new JMenu("����(H)");
				
				mb.add(FileMenu);
				mb.add(EditMenu);
				mb.add(Formenu);
				mb.add(ViewMenu);
				mb.add(HelpMenu);
				setJMenuBar(mb);
				
				c.setBackground(Color.BLUE);
				c.add(new JTextArea());
				
				
				setSize(300, 200);
				setVisible(true);
				
		}

	public static void main(String[] args) {
			new aaaaa();

	}

}

package bbbb;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

public class aaaaa extends JFrame {
		public aaaaa() {
				setTitle("메모장");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Container c = getContentPane();
				
				JMenuBar mb = new JMenuBar();
				JMenu FileMenu = new JMenu("파일(F)");
				JMenu EditMenu = new JMenu("편집(E)");
				JMenu Formenu = new JMenu("서식(O)");
				JMenu ViewMenu = new JMenu("보기(V)");
				JMenu HelpMenu = new JMenu("도움말(H)");
				
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

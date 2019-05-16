
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class aaa extends JFrame {
	public aaa() {
		setTitle("계산기 수행평가");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JButton c1 = new JButton("1");
		JButton c2 = new JButton("2");
		JButton c3 = new JButton("3");
		JButton c4 = new JButton("4");
		JButton c5 = new JButton("5");
		JButton c6 = new JButton("6");
		JButton c7 = new JButton("7");
		JButton c8 = new JButton("8");
		JButton c9 = new JButton("9");
		JButton c10 = new JButton("+");
		JButton c11 = new JButton("=");
		JButton c12 = new JButton("*");
		JButton c13 = new JButton("-");
		JButton c14 = new JButton("%");
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		add(c7);
		add(c8);
		add(c9);
		add(c10);
		add(c11);
		add(c12);
		add(c13);
		add(c14);
		
		JMenuBar mb = new JMenuBar();
		JMenu FileMenu = new JMenu("계산(F)");
		JMenu EditMenu = new JMenu("암산(E)");
		JMenu Formenu = new JMenu("계산기록(O)");
		JMenu ViewMenu = new JMenu("메모리(V)");
		JMenu HelpMenu = new JMenu("도움말(H)");
		JMenu FileMenu1 = new JMenu("수행평가 프로");
		
		mb.add(FileMenu);
		mb.add(EditMenu);
		mb.add(Formenu);
		mb.add(ViewMenu);
		mb.add(HelpMenu);
		mb.add(FileMenu1);
		setJMenuBar(mb);
		
		setBackground(Color.BLUE);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	public void abab() {
		
	}
	
	public void kans () {
		
	}
	
	public static void main(String[] args) {
			new aaa();

	}

}

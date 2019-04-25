import javax.swing.*;
import java.awt.*;

public class raphicsDrawImageEx3 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public raphicsDrawImageEx3() {
		setTitle("�̹��� �Ϻκ��� ũ�� �����Ͽ� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			
			g.drawImage(img, 20, 20, 250, 100, 100, 50, 200, 200, this);
		}
	}
	
	public static void main(String [] args) {
		new raphicsDrawImageEx3();
	}
} 
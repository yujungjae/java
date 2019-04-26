import javax.swing.*;
import java.awt.*;


public class GraphicsDrawRectEx extends JFrame {
	private Mypanel panel = new Mypanel();
	
		public GraphicsDrawRectEx () {
			setTitle("drawRect ¿¹Á¦");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setContentPane(panel);
			
			setSize(200, 170);
			setVisible(true);
		}
		
		class Mypanel extends JPanel {
				public void paintComponent (Graphics g) {
					super.paintComponent(g);
					g.setColor(Color.RED);
					g.drawRect(20,20,80,80);
				}
		}
		
	public static void main(String[] args) {
			new GraphicsDrawRectEx ();

	}

}

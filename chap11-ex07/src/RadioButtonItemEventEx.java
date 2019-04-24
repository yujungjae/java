import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButtonItemEventEx extends JFrame {
	private JRadioButton [] radio = new JRadioButton [3]; // ������ư �迭
	private String [] text = {"���", "��", "ü��"}; // ������ư�� ���ڿ�
	private ImageIcon [] image = { // �̹��� ��ü �迭
						new ImageIcon("images/apple.jpg"), 
						new ImageIcon("images/pear.jpg"),
						new ImageIcon("images/cherry.jpg")};
	private JLabel imageLabel = new JLabel(); // �̹����� ��µ� ���̺�
	
	public RadioButtonItemEventEx() {
		setTitle("������ư Item Event ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel(); // 3���� ������ư�� ������ �г�
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup(); // ��ư �׷� ��ü ����
		for(int i=0; i<radio.length; i++) { // 3���� ������ư�� ����
			radio[i] = new JRadioButton(text[i]); // ������ư ����
			g.add(radio[i]); // ��ư �׷쿡 ����
			radioPanel.add(radio[i]); // �гο� ����
			radio[i].addItemListener(new MyItemListener()); // ������ư�� Item ������ ���
		}
		
		radio[2].setSelected(true); // ü�� ������ư�� ���� ���·� ����
		c.add(radioPanel, BorderLayout.NORTH); // ����Ʈ���� NORTH�� �����г� ����
		c.add(imageLabel, BorderLayout.CENTER); // ����Ʈ���� CENTER�� �̹��� ���̺� ����
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER); // �̹����� �߾� ����
		
		setSize(250,200);
		setVisible(true);
	}
	
	// Item ������ �ۼ�
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)  
				return; // ������ ��� �׳� ����(��� ����)
			if(radio[0].isSelected()) // ����� ���õ� ���
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected()) // �谡 ���õ� ���
				imageLabel.setIcon(image[1]);
			else // ü���� ���õ� ���
				imageLabel.setIcon(image[2]);
		}
	}
	
	public static void main(String [] args) {
		new RadioButtonItemEventEx();
	}
}
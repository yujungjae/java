import java.awt.*;
import java.awt.event.*;
import java.awt.Container;

import javax.swing.*;

public class IndepClassListener extends JFrame{
public IndepClassListener(){
	setTitle("Action �̺�Ʈ ������ ����");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	JButton btn = new JButton("Action");
	btn.addActionListener(new MyActionListener()); // Action �̺�Ʈ ������ �ޱ�
	c.add(btn);
	
	setSize(350, 150);
	setVisible(true);
}
public static void main(String [] args){
	new IndepClassListener();
}
}
//������ Ŭ������ �̺�Ʈ ������ �ۼ�
class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		JButton b = (JButton)e.getSource(); //�̺�Ʈ �ҽ� ��ư �˾Ƴ���
		if(b.getText().equals("Action")) //��ư�� ���ڿ��� "Action"���� ��
			b.setText("�׼�"); //��ư�� ���ڿ��� "�׼�"���� ����
		else
			b.setText("Action"); // ��ư�� ���ڿ��� "Action"���� ����
	}
}
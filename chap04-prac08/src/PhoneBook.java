import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	public Phone(String name, String tel) {
		this.name = name; this.tel = tel;
	}
	public String getName() { return name; }
	public String getTel() { return tel; }
}

public class PhoneBook {
	private Scanner scanner;
	private Phone [] pArray;
	public PhoneBook() { 
		scanner = new Scanner(System.in);
	}
	
	void read() {
		System.out.print("�ο���>>");
		int n = scanner.nextInt();
		
		pArray = new Phone [n]; // n ���� ������ �迭 ����
		for(int i=0; i<pArray.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");			
			String name = scanner.next();
			String tel = scanner.next();
			pArray[i] = new Phone(name, tel);
		}
		
		System.out.println("����Ǿ����ϴ�...");		
	}
	
	String search(String name) {
		for(int i=0; i<pArray.length; i++) {
			if(pArray[i].getName().equals(name))
				return pArray[i].getTel();
		}
		return null;
	}
	
	void run() {
		read();
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String name = scanner.next();
			if(name.equals("�׸�"))
				break;
			String tel = search(name);
			if(tel == null)
				System.out.println(name + " �� �����ϴ�.");
			else
				System.out.println(name + "�� ��ȣ�� " + tel + " �Դϴ�.");				
		}	
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		new PhoneBook().run();
	}
}
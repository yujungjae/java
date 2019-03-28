
import java.util.Scanner;

class Dictionary{
	private static String [] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word){
		for(int i=0; i<kor.length; i++){
			if(kor[i].equals(word))
				return eng[i]; //�߰��ϰ� �ε��� i�� ����ܾ� ����
		}
		return null; // �߰��� �� ����
	}
}

public class DicApp {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true){
			System.out.print("�ѱ� �ܾ�?");
			String kor = scanner.next();
			if(kor.equals("�׸�")){
				break;
			}
			String eng = Dictionary.kor2Eng(kor);
			if(eng == null)
				System.out.println(kor + "�� ���� ������ �����ϴ�.");
			else{
				System.out.println(kor + "�� " + eng);
			}
		}
		
		scanner.close();

	}

}
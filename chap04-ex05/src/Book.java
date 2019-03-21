
public class Book {
	String title;
	String author;
	
	void show(){
		System.out.println(title+" " + author);
	}
	
	public Book() {
		this(" "," ");
		
	}
	
	public Book(String title){
		this(title, "���ڹ̻�");
		
	}
	
	public Book(String title, String author){
		this.title = title;
		this.author= author;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book littlePrince = new Book("���","������");
		Book lovestory = new Book("��������");
		Book emptyBook = new Book();
		littlePrince.show();
		lovestory.show();
		emptyBook.show();
	}

}

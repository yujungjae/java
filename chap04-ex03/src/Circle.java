
public class Circle {
	int redius;
	String name;

	public Circle() {
		redius = 1;
		name = "";
	}

	public Circle(int r, String n) {
		redius = r;
		name = n;

	}
	
	public double getArea() {
			return 3.14 * redius * redius;
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle pizza = new Circle(10, "å������");
		double area = pizza.getArea();
		System.out.println(area);
		
		Circle donut = new Circle();
		donut.name = "å������";
		area = donut.getArea();
		System.out.println(area);
	}

}

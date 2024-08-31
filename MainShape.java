package Week3;

class MainShape{
	public static void main(String[] args) {
		Shape cricle=new Cricle(7);
		System.out.println("The area of Cricle:"+cricle.calculateArea());
		Shape rectangle=new Rectangle(3,5);
		System.out.println("The area of Rectangle:"+rectangle.calculateArea());
		Shape triangle=new Triangle(7,9);
		System.out.println("The area of Triangle:"+triangle.calculateArea());
		
	}
}


package Week3;

abstract class Shape {
public abstract double calculateArea();
}
class Cricle extends Shape{
	double radius;
	public Cricle (double radius) {
		this.radius=radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI*
		Math.pow(radius, 2);
	}
}
class Rectangle extends Shape{
	double lenght;
	double width;
	public Rectangle (double lenght,double width) {
		this.lenght=lenght;
		this.width=width;
	}

	@Override
	public double calculateArea() {
		return lenght*width;
	}
}
class Triangle extends Shape{
	double base;
	double hight;
	public Triangle (double base,double hight) {
		this.base=base;
		this.hight=hight;
	}

	@Override
	public double calculateArea() {
		return base*hight;
	}
}

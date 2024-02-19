package entities;

public class Rectangle {

	double height, width;
	int hipotenusa, cateto1, cateto2;
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (width * 2) + (height * 2);
	}
}
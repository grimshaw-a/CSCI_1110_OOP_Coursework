//Date: 6.6.20
//Author: Adam Grimshaw
//Course: OOP
//Description: This defines the triangle class.

public class Triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
		super();
	}
	
	public Triangle(double a, double b, double c) {
		super();
		this.side1 = a;
		this.side2 = b;
		this.side3 = c;
	}
	
	public Triangle(double a, double b, double c, String color, boolean filled) {
		super(color, filled);
		this.side1 = a;
		this.side2 = b;
		this.side3 = c;
		}
	
	public double getSide1() {
		return this.side1;
	}
	
	public double getSide2() {
		return this.side2;
	}
	
	public double getSide3() {
		return this.side3;
	}
	
	public double getArea() {
		double s = (this.side1 + this.side2 + this.side3) / 2;
		return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
	}
	
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
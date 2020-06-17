//Date: 6.15.20
//Author: Adam Grimshaw
//Course: OOP
//Description: Defines the Octagon class

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>  {
	private double side = 1;
	
	public Octagon() {
	}
	
	public Octagon(double s) {
		this.side = s;
	}
	
	public Octagon(double s, String color, boolean filled) {
		this.side = s;
		setColor(color);
		setFilled(filled);
	}
	
	public double getSide() {
		return this.side;
	}
	
	public void setSide(double s) {
		this.side = s;
	}
	
	public double getPerimeter() {
		return this.side * 8;
	}
	
	public double getArea() {
		return (2 + (4 / Math.sqrt(2.0))) * side * side;
	}

/*
	@Override
	public int compareTo(Octagon o) {
		if (this.getArea() > o.getArea()) {
			return 1;
		} else if (this.getArea() < o.getArea()){
			return -1;
		} else {
			return 0;
		}
	}
	*/
	
	@Override
	public int compareTo(Octagon o) {
		return Double.compare(this.getArea(), o.getArea());
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e){
			return null;
		}
	}
}

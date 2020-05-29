class Rectangle {
	public double width = 1;
	public double height = 1;
	
	Rectangle() {
	}
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return width + width + height + height;
	}
	public void printStats() {
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimeter: " + this.getPerimeter());
	}
}

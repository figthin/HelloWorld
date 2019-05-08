package www.oracle.com;

public class Rectangle {

	private double width;
	private double height;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(double len) {
		width = len;
		height = len;
	}
	
	public Rectangle(double height, double width) {
		this.width = width;
		this.height = height;
	}
	
	
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double perimeter() {
		return (width + height) * 2;
	}
	
	public double area() {
		return width * height;
	}
	
}

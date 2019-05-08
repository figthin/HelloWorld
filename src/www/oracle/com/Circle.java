package www.oracle.com;

public class Circle {

	private double r;
	private final double PI = 3.1415926;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	
	
	@Override
	public String toString() {
		return "Circle [r=" + r + ", PI=" + PI + "]";
	}

	public double perimeter() {
		return 2 * PI * r;
	}
	
	public double area() {
		return PI * r * r;
	}
	
	
}

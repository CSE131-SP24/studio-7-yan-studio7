package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double len, double wid) {
		length = len;
		width = wid;
	}
	
	public Rectangle() {
		length = 1;
		width = 1;
	}
	
	public String toString() {
		String output = "This is a rectangle";
		return output;
	}
	
	public double getArea() {
		return length*width;
	}
	
	public double getPerimeter() {
		return 2*(length+width);
	}
	
	public boolean isSquare() {
		return (length==width);
	}
	
	public static boolean biggerRectangle(Rectangle a, Rectangle b) {
		return (a.getArea() > b.getArea());
	}
	
	
public static void main(String[] args) {
	Rectangle a = new Rectangle(4,3);
	Rectangle b = new Rectangle(2,1);
	
	System.out.println(biggerRectangle(a, b));
	
	
}
	
	
	
}

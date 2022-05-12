import static java.lang.Math.*;

public class Circle extends Shape {

	//attributes
	
	double radius;
		
	public Circle(String name, String colour, double x, double y, double radius) {
		super(name, colour, x, y);
		this.radius = radius;
		}
		
	public String toString() {
		return  "Name : " + super.getName() + " , Colour : " + super.getColour() +
				" , x : " + super.getX() + " , y : " + super.getY() + 
				" and radius: " + this.radius;
	}	

		
	public double getArea() {
			
		return this.radius * this.radius * PI;
	}
	
	// taking x, y to be the origin of the cyclic square that fits inside the circle
	public Point getCenterPoint() {
		
		double x1 = this.radius/sqrt(2) + super.getX();
		double x2 = this.radius/sqrt(2) + super.getY();
		
		Point p = new Point(x1 , x2 );
		
		return p;
	}
}

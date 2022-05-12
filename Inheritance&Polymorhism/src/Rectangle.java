
public class Rectangle extends Shape{
	
	//attributes
	
	double height;
	double width;
	
	public Rectangle(String name, String colour, double x, double y, double height, double width) {
		super(name, colour, x, y);
		this.height = height;
		this.width = width;
	}
	
	public String toString() {
		return  "Name : " + super.getName() + " , Colour : " + super.getColour() +
				" , x : " + super.getX() + " , y : " + super.getY() + 
				" , width : " + this.width + " and height: " + this.height;
	}
	
	public boolean isSquare() {
		
		if (this.height == this.width) {
			return true;
		}
		else {
			return false;
		}
	
	};
	

	public double getArea() {
		
		return this.height * this.width;
	}

	//taking x and y points given to be origin (bottom left corner of shape)
	public Point getCenterPoint() {
		
		double x1 = super.getX() + this.width / 2;
		double y1 = super.getY() + this.height / 2;
		Point p = new Point(x1, y1);
		
		return p;
	}

	
	
	
}


public class Point {
	
	private double x;
	private double y;
	
	//Constructor
	public Point(double x, double y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	//Getters
	public double getX() {
		return this.x;
	} 
	
	public double getY() {
		return this.y;
	}
	
	//Setters
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	//To a String
	public String toString() {
		return "x : " + this.x + " and y : " + this.y;
	}
	
	
}


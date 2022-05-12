
public abstract class Shape {
	
	private double x;
	private double y;
	private String name;
	private String colour;

	//Constructor
	public Shape(String name, String  colour, double x, double y) {
			
			this.x = x;
			this.y = y;
			this.name = name;
			this.colour = colour;
			
		}
	

	//Getters
	public double getX() {
		return this.x;
	} 
		
	public double getY() {
		return this.y;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	
	//Setters
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	//To a String
	public String toString() {
		return  "Name : " + this.name + " , Colour : " + this.colour +
				" , x : " + this.x + " and y : " + this.y;
	}
	
	
	//Abstract Methods
	
	public abstract double getArea();
	
	public abstract Point getCenterPoint();
}


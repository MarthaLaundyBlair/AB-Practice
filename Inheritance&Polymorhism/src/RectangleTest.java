
public class RectangleTest {
		
	public static void main(String[] args){
		   
		Rectangle r1 = new Rectangle("r1", "blue", 0, 0, 4, 6);
		System.out.println(r1.toString());
		System.out.println(r1.isSquare());
		System.out.println(r1.getArea());
		System.out.println(r1.getCenterPoint());
		
		Rectangle r2 = new Rectangle("r2", "red", 0, 0, 4.7, 6.9);
		System.out.println(r2.toString());
		System.out.println(r2.isSquare());
		System.out.println(r2.getArea());
		System.out.println(r2.getCenterPoint());
	}
}

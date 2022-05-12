
public class CircleTest {
		
	public static void main(String[] args){
		   
		Circle c1 = new Circle("c1", "blue", 0, 0, 3);
		System.out.println(c1.toString());
		System.out.println(c1.getArea());
		System.out.println(c1.getCenterPoint());
	
		Circle c2 = new Circle("c2", "red", 3, 4, 4);
		System.out.println(c2.toString());
		System.out.println(c2.getArea());
		System.out.println(c2.getCenterPoint());
	
	}
}
  	
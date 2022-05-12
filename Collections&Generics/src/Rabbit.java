
public class Rabbit extends Animal {

	public Rabbit(String name, int age) {
		super(name, age);
	}

	@Override
	public String sayHello() {
		return "Squeak";
	}

	@Override
	public String move() {
		return "hops";
	}

	
}
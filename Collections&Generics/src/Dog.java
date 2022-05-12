
public class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public String sayHello() {
		return "Woof";
	}

	@Override
	public String move() {
		return "runs";
	}

	
}
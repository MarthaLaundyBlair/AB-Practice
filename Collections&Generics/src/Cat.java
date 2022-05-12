
public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public String sayHello() {
		return "Meow";
	}

	@Override
	public String move() {
		return "walks";
	}


	
}

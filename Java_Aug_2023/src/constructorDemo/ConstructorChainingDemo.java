package constructorDemo;

class Student {

	String name;
	int rollNo, std;

	public Student(String name) {
		this(2);
		this.name = name;
	}

	public Student(int std) {
		this.std = std;
	}

	public Student(String name, int rollNo, int std) {
		this("DEV School");
		this.name = name;
		this.rollNo = rollNo;
		this.std = std;
	}

	void dis() {
		System.out.println("Name:" + name);
		System.out.println("Roll no:" + rollNo);
		System.out.println("Std:" + std);
	}

}

public class ConstructorChainingDemo extends Student {

	ConstructorChainingDemo() {
		super("suf", 6, 858);
	}

	ConstructorChainingDemo(String name) {
		this();
	}

	public static void main(String[] args) {
		
		ConstructorChainingDemo c = new ConstructorChainingDemo("DSP");
		c.dis();

	}

}
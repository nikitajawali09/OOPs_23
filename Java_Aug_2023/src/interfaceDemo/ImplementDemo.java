package interfaceDemo;

interface i1 {

	public static final int age = 25;

	void dis();

	static void test() {
		System.out.println("Inside static method");
	}

	default void def() {
		System.out.println("Inside default method");
	}

	double mesg(String name);

}

public class ImplementDemo implements i1 {

	@Override
	public void dis() {
		System.out.println("Inside dis :: method");
	}

	void show() {
		System.out.println("Inside show ::method");
	}

	public static void main(String[] args) {

		ImplementDemo i = new ImplementDemo();
		i.def();
		i.dis();
		i1.test();
		System.out.println(i.mesg("Niki"));
		i1 i2 = new ImplementDemo();
		// i2.show();

	}

	@Override
	public double mesg(String name) {
		String d = name;
		System.out.println("Name:" + d);
		return 9.5;
	}

}

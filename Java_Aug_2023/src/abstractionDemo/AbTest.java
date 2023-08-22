package abstractionDemo;

abstract class AbstractClass {

	int x = 10;

	public AbstractClass() {
		System.out.println("Inside AbstractClass constructor:: ");
	}

	final void m1() {
		System.out.println("Inside final method ::m1");
	}

	void m2() {
		System.out.println("Inside m2 method ::");
	}

	abstract void mesg();
}

public class AbTest extends AbstractClass {

	AbTest() {
		super();
		System.out.println("Inside AbTest constructor ::");
	}

	public static void main(String[] args) {

		AbTest t = new AbTest();
		t.m1();
		t.m2();
		t.mesg();
		System.out.println(t.x);

	}

	@Override
	void mesg() {
		System.out.println("Inside AbTest ::mesg ");
	}

}

package interfaceDemo;

interface A {
	void show();
}

interface B {
	public abstract void print();
}

public class Extended implements A, B {

	@Override
	public void print() {
		System.out.println("Inside Extended ::print");
	}

	@Override
	public void show() {
		System.out.println("Inside Extended ::show");
	}

	public static void main(String[] args) {
		Extended e = new Extended();
		e.print();
		e.show();

	}

}

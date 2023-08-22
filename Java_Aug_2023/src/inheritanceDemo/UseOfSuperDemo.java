package inheritanceDemo;

class Sub {
	
	int a = 10;
	
	public Sub() {
		System.out.println("Inside Sub constructor");
	}
	
	public Sub(int a) {
		System.out.println("Inside Sub constructor --> a");
		System.out.println("Int a :"+a);
	}
	
	public void parentMethod() {
		System.out.println("Inside parent method");
	}
	
	public void parentMethod(int a) {
		System.out.println("Inside parent method --> a");
	}

}

public class UseOfSuperDemo extends Sub {
	
	int a = 90;
	
	public UseOfSuperDemo(int a) {
		super(a);
		System.out.println("Inside Sub constructor --> a");
	}
	
	public UseOfSuperDemo() {
		super();
		System.out.println("Inside Super constructor");
	}

	
	
	public void childMethod(int a) {
		
		super.parentMethod(super.a);
		System.out.println("Inside child method --> a");
		System.out.println("A"+a);
	}

	public void childMethod() {
		super.parentMethod();
		System.out.println("Inside child method");
		System.out.println("Child :" + a);
		System.out.println("Parent :" + super.a);
		
	}

	public static void main(String[] args) {

		UseOfSuperDemo u = new UseOfSuperDemo();
		System.out.println();
		u.childMethod();
		System.out.println();
		u.parentMethod();
		System.out.println("****************************");
		UseOfSuperDemo u1 = new UseOfSuperDemo(10);
		System.out.println();
		u1.childMethod(70);
		System.out.println();
		u1.parentMethod(20);
	}

}

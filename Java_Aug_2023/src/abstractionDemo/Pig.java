package abstractionDemo;

abstract class Animal{
	
	public abstract void sleep();
	
	public void show() {
		System.out.println("Inside Animal :: show");
	}
	
}

public class Pig extends Animal{

	@Override
	public void sleep() {
		System.out.println("Inside Pig :: sleep");
	}

	public static void main(String[] args) {
		Pig p = new Pig();
		p.show();
		p.sleep();
		
	}
	
}

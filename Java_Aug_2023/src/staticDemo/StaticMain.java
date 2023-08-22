package staticDemo;

class Test {
	
	{
		System.out.println("Test :: Instance");
	}
	
	static {
		System.out.println("Test :: static");
	}

	public Test() {
		System.out.println("Test ::constructor");
	}

	static int max = 10;

	int multiply(int a, int b) {
		{
			System.out.println("Multiply :: Instance");
		}
		return a * b;
	}

	static int add(int a, int b) {
		return (a + b);
	}

}

public class StaticMain extends Test {

	static int max = 20;

	public StaticMain() {
		System.out.println("StaticMain ::constructor");//It will call
		//parent constructor first without super also
	}

	static int add(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {

		StaticMain s = new StaticMain();
		System.out.println(s.multiply(20, 10));
		System.out.println(StaticMain.add(20, 10));
		System.out.println(StaticMain.max);

	}

}

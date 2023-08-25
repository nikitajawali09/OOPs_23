package constructorDemo;

class Demo{
	
	
}

public class Test extends Demo{

	public static void main(String[] args) {
		
		Test test = null;
		if(test instanceof Demo) {
			System.out.println("Test instanceof");
		}else System.out.println("Test is not instanceof");
		
		System.out.println();
		Demo t = null;
		if(t instanceof Demo) {
			System.out.println("Test instanceof");
		}else System.out.println("Test is not instanceof");
		
		System.out.println();
		Demo t1 = new Test();		
		if(t1 instanceof Demo) {
			System.out.println("Test instanceof");
		}else System.out.println("Test is not instanceof");
	}
}

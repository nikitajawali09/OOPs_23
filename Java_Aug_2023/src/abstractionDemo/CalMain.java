package abstractionDemo;

abstract class MyTest{
	
	public abstract void calculate(int x,int y);
	
}

class Addition extends MyTest{

	@Override
	public void calculate(int x, int y) {
	System.out.println("Addition :"+(x+y));
	}
}

class Substraction extends MyTest{

	@Override
	public void calculate(int x, int y) {
	System.out.println("Substraction :"+(x-y));
	}
}

public class CalMain {

	
	public static void main(String[] args) {
		
		Substraction s = new Substraction();
		s.calculate(20, 10);
		Addition a = new Addition();
		a.calculate(20, 10);
		
	}
}

package inheritanceDemo;

class Calculation {

	int x = 10;
	protected int y = 20;
	public int z = 30;
	private int b = 40;

	public void add(int x, int y) {
		int z = x + y;
		System.out.println("Addition --> Calculation :" + z + b);
	}

}

public class MyCal extends Calculation {

	public void add(int x, int y) {
		super.add(x, y);
		int z = x + y;
		System.out.println("Addition --> MyCal :" + z);
	}

	public static void main(String[] args) {
		MyCal m = new MyCal();
		m.add(20, 10);
		Calculation m1 = new MyCal();
		m1.add(10, 20);

	}

}

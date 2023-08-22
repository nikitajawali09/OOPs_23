package interfaceDemo;

interface Color {

	interface Red {
		void colorRed();
	}

	interface Yellow {
		void colorYellow();
	}

}

public class Nested implements Color.Red,Color.Yellow{

	public static void main(String[] args) {

		Nested n = new Nested();
		n.colorRed();
		n.colorYellow();
	}

	@Override
	public void colorYellow() {
		System.out.println("Color is yellow");
	}

	@Override
	public void colorRed() {
		System.out.println("Color is red");
	}


}

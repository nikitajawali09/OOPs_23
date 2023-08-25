package constructorDemo;

public class CopyConstructor {

	int a = 20;
	int b = 20;

	public CopyConstructor() {

	}

	CopyConstructor(CopyConstructor n) {
		a = n.a;
		b = n.b;
	}

	public static void main(String[] args) {

		System.out.println("Original values ****");
		CopyConstructor d = new CopyConstructor();
		System.out.println("Value of a & b:"+d.a + " "+d.b);
		System.out.println("After updating ****");
		d.a=70;
		d.b=70;
		System.out.println("Value of a & b:"+d.a + " "+d.b);
		CopyConstructor d1 = new CopyConstructor();
		System.out.println("Not updating ****");
		System.out.println("Value of a & b :"+d1.a +" "+d1.b);
		CopyConstructor d2 = new CopyConstructor(d);
		System.out.println("copy constructor  ****");
		System.out.println("Value of a & b :"+d2.a +" "+d2.b);
		
	}

}

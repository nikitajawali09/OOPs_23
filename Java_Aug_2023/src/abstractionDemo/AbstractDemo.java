package abstractionDemo;

abstract class EmployeeTest2 {

	public String name, address, number;

	public EmployeeTest2() {
		System.out.println("Inside EmployeeTest2 constructo ::");
	}

	public EmployeeTest2(String name, String address, String number) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public void mailCheck() {
		System.out.println("Mailing a check to :" + this.name + " " + this.address);
	}

	public abstract void location();
	
	public abstract double salary();
}

public class AbstractDemo extends EmployeeTest2{
	
	public double salary() {
		double salary=45000;
		double hra,da;
		da = salary*15/100;
		hra=salary*10/100;
		double grossSalary=salary+da+hra;
		return grossSalary;
	}
	

	public AbstractDemo() {
		super();
	}

	public AbstractDemo(String name, String address, String number) {
		super(name, address, number);
		System.out.println("name:"+name);
		System.out.println("address:"+address);
		System.out.println("number:"+number);
	}

	public static void main(String[] args) {
		
		AbstractDemo a = new AbstractDemo("Niki","Thane","9822026123");
		System.out.println("Salary:"+a.salary());

	}

	@Override
	public void location() {
		System.out.println("Locations : Mumbai|Pune");
	}


	

}

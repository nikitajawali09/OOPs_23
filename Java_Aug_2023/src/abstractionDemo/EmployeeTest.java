package abstractionDemo;

abstract class Emp {

	abstract String getPosition();

}

class FullTime extends Emp {

	private double annualSalary;
	private String name, number;

	public FullTime(double annualSalary, String name, String number) {
		super();
		this.annualSalary = annualSalary;
		this.name = name;
		this.number = number;
	}
	
	public void FullTimeMethod() {
		System.out.println("Annual salary :"+annualSalary);
		System.out.println("Name:"+name);
		System.out.println("Number:"+number);
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	String getPosition() {
		return "Full-Time Employee";
	}

}

class PartTime extends Emp {

	public double salary;
	public String number;
	public String name;
	public int trainingPeriod;

	public PartTime(double salary, String number, String name, int trainingPeriod) {
		super();
		this.salary = salary;
		this.number = number;
		this.name = name;
		this.trainingPeriod = trainingPeriod;
	}

	public void PartTimeMethod() {
		System.out.println("Salary:"+salary);
		System.out.println("Number:"+number);
		System.out.println("Name:"+name);
		System.out.println("Training period:"+trainingPeriod);
	}
	
	@Override
	String getPosition() {
		return "Part-Time";
	}

}

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("Full-Time ********");
		FullTime f = new FullTime(50000.0, "Niki", "9822027125");
		f.FullTimeMethod();
		System.out.println("Full-Time Position :"+f.getPosition());
		System.out.println("Part-Time ********");
		PartTime p = new PartTime(10000.0, "9822027122", "Nikku", 10);
		p.PartTimeMethod();
		System.out.println("Part-Time Position :"+p.getPosition());
	}
}

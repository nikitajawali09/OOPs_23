package inheritanceDemo;

class Employee{
	
	String joining_Date;
	String gender;
	float salary;
	String position;
	
	void emp() {
		System.out.println("Joining Date :"+joining_Date);
		System.out.println("Gender :"+gender);
		System.out.println("Salary :"+salary);
		System.out.println("Position :"+position);
	}
	
	
}

public class Programmer extends Employee{
	
	String band;
	
	void emp() {
		super.emp();
		System.out.println("Band :"+band);	
	}

	
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.salary=9000;
		p.band="U5";
		p.gender="Male";
		p.position="BA";
		p.joining_Date="20/07/2023";
		p.emp();
	
		
		
	}

}

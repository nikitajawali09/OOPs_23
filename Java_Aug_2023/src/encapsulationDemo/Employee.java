package encapsulationDemo;

public class Employee {

	private String empName;
	private double empSalary;
	private String empLocation;
	private int staffNo = 2;

	public void display() {
		System.out.println("Employee name:" + empName);
		System.out.println("Employee salary:" + empSalary);
		System.out.println("Employee location:" + empLocation);
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public Employee(String empName, double empSalary, String empLocation, int staffNo) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empLocation = empLocation;
		this.staffNo = staffNo;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setEmpLocation("Mumbai");
		e.setEmpName("Nikita");
		e.setEmpSalary(70000);
		e.display();
		System.out.println("Staff No:" + e.staffNo);
		System.out.println("**********************");
		Employee e1 = new Employee("Nik", 50000.0, "Pune", 10);
		e1.display();
		System.out.println("Staff No:" + e1.staffNo);

	}

	public int getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}

}

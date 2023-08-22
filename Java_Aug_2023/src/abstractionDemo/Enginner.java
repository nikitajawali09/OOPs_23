package abstractionDemo;

abstract class Employee{
	
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void m1() {
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);
	}
	
	public abstract double salary();
	
}

public class Enginner extends Employee{
	private String position;

	public Enginner(String name, int id,String position) {
		super(name, id);
		this.position=position;
	}

	@Override
	public double salary() {
		return 9.6;
	}
	
	public static void main(String[] args) {
		Enginner e = new Enginner("Nikita", 10, "BA");
		e.m1();
		System.out.println("Salary :"+e.salary());
		
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}

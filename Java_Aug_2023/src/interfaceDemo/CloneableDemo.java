package interfaceDemo;

public class CloneableDemo implements Cloneable{
	
	int id;
	String name,address;
	
	public CloneableDemo(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		CloneableDemo c = new CloneableDemo(366, "Niki", "Thane");
		
		CloneableDemo c1 =(CloneableDemo)c.clone();
		System.out.println(c1.id + " "+c1.name+ " "+c1.address);
	}

}

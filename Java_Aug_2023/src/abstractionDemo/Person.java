package abstractionDemo;

abstract class Identity{
	
	abstract void getName(String name);
	
	abstract void getGender(String gender);
	
	abstract void getCity(String city);
	
}

public class Person extends Identity {

	@Override
	void getName(String name) {
		System.out.println("Get name:"+name);
	}

	@Override
	void getGender(String gender) {
		System.out.println("Get gender:"+gender);
	}

	@Override
	void getCity(String city) {
		System.out.println("Get city:"+city);
	}

	public static void main(String[] args) {
		
		Identity i = new Person();
		i.getCity("Thane");
		i.getName("Niki");
		i.getGender("Female");
		
	}
	
}

package constructorDemo;

public class College {

	public int id;
	public String name;

	public College() {
		super();
		id=797997;
		name="IBM";
	}

	public College(int id, String name) {
		this(name);
	}

	public College(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		College c = new College(6969, "IDG");
		System.out.println(c);
		System.out.println();
		College c1 = new College();
		System.out.println(c1);
	}

}

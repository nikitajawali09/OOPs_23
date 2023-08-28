package javabasics;

import java.util.Objects;

public class Basics {

	int a;

	@Override
	public int hashCode() {
		return Objects.hash(a);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Basics other = (Basics) obj;
		return a == other.a;
	}

	public Basics(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		int firstNumber = 8;
		int secondNumber = 9;

		System.out.println(firstNumber == secondNumber);
		System.out.println("**************************");
		String a = "yes";
		String b = "yes";
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println("**************************");
		Basics b1 = new Basics(50);
		Basics b2 = new Basics(50);

		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));

	}

}

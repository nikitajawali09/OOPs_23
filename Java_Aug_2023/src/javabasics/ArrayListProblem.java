package javabasics;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class ArrayListProblem extends Thread {

	static CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();

	public void run() {
		courses.add("Kubernates");
	}

	
	public static void main(String[] args) throws InterruptedException {

		ArrayListProblem b = new ArrayListProblem();
		b.start();
		courses.add("Java");
		courses.add("Junit");

		Iterator<String> i = courses.iterator();
		while (i.hasNext()) {
			Thread.sleep(3000);
			String course = i.next();
			System.out.println(course);

		}
	}
}

package javabasics;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentDemo {

	//to avoid issues after iteration add/remove elements
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> c = new CopyOnWriteArrayList<>();
		c.add("Java");
		c.add("Spring");
		c.add("AWS");
		System.out.println("Before delete:"+c.toString());
		Iterator<String> iterator = c.iterator();
		while (iterator.hasNext()) {
			String course = iterator.next();
			if(course.equals("AWS")) {
				c.remove(course);
			}
			
		}
		System.out.println("After delete:"+c.toString());
		
	}

}

package root;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.Student;

public class Main {
	public static void main(String []args) {
		
		List<Student> std = new ArrayList<Student>();
		
		std.add(new Student("Iqbal", 1));
		std.add(new Student("Amit", 2));
		std.add(new Student("durjoy", 3));
		
		Iterator<Student> itr = std.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getId());
		}
	}

}

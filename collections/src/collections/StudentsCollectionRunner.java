package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner
{
	public static void main(String[] args)
	{
		// List.of는 Java 9 이후 문법 
		/*List<Student> students = List.of(new Student(1, "Takityaki"),
				new Student(100, "Adam"),
				new Student(2, "Eve"));
		
		List<Student> studentsAl = new ArrayList<>(students);*/
		
		// Java 8
		List<Student> studentsAl = Arrays.asList(new Student(1, "Takityaki"),
				new Student(100, "Adam"),
				new Student(2, "Eve"));
		
		System.out.println(studentsAl);
		
		// Comparable interface 직접 구현 필요
		Collections.sort(studentsAl);
		
	}

}

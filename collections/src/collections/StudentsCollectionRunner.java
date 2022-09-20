package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student>
{

	@Override
	public int compare(Student student1, Student student2)
	{
		return Integer.compare(student2.getId(), student1.getId());
	}
	
}

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
		// ascending order
		Collections.sort(studentsAl);
		System.out.println("Asc " + studentsAl);
		
		// Collections.sort(studentsAl, new DescendingStudentComparator());
		// System.out.println("DescendingStudentComparator " + studentsAl);
		
		// sort 직접 사용 시, Comparator 객체 필요
		studentsAl.sort(new DescendingStudentComparator());
		System.out.println("DescendingStudentComparator " + studentsAl);
	}

}

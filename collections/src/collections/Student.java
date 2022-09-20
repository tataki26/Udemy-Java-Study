package collections;

public class Student implements Comparable<Student>
{
	private int id;
	private String name;
	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return id + " " + name;
	}

	// 학생끼리 비교
	// this: 현재 객체 / that: 비교 객체
	@Override
	public int compareTo(Student that)
	{
		return Integer.compare(this.id, that.id);
		// return Integer.compare(that.id, this.id); // reverse
	}
}

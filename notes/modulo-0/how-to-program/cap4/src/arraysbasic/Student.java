package arraysbasic;

public class Student {
	private String name;
	private String course;
	private int age;
	
	public Student(String name, String course, int age) {
		this.name = name;
		this.course = course;
		this.age = age;
	}
	
	public void profileReport() {
		System.out.println("NOME COMPLETO: " + this.getName());
		System.out.println("CURSO: " + this.getCourse());
		System.out.println("IDADE: " + this.getAge());
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student) {
			Student std = (Student) obj;
			return std.getName().equals(this.getName());	
		}
		
		return false;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
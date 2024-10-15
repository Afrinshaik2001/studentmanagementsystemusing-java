package javaproject;

public class Student {
	private String name;
	private int age;
	private int id;
	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0 && age<=120) {
			this.age=age;
		}
		else {
			throw new IllegalArgumentException("Age must be between 0 and 120");
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student Name: "+name+" ID: "+id+" Age: "+age;
		
	}
	

}

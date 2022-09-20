package collection;

public class Student {
	private String name;
	private int age;
	private boolean isMale;
	private int rollNumber;
	
	public Student(String name,int age,boolean isMale,int rollNumber) {
		this.name=name;
		this.age=age;
		this.isMale=isMale;
		this.rollNumber=rollNumber;
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
		this.age = age;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String toString() {
		return name+" "+age+" "+rollNumber+" "+isMale;
	}
}

package example20180331;

public class Student extends Human{
	String major;

	public Student(String name, int age, String major) {
		this.setMajor(major);
		super.setName(name);
		super.setAge(age);
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return this.major;
	}
	public static void main(String[] args) {
		Student Peter = new Student("Peter",19,"Programming");

	}

}

package example20180331;

public class Human {
	String name;
	int age;
	
	public Human() {
	}
	public Human(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

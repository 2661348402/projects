package summer_day09;

public class Student {
	private int age;
	private String name;
	
	Student (){}
	Student(String name,int age){
		this.age=age;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}

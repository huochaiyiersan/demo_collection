package hui.java.demo.a;

public class Student {
	private String username="张三";
	private int age=76;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String username,int age) {
		this.username = username;
		this.age = age;
	}
	
	public Student(){
		super();
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", age=" + age + "]";
	}
	
	
}

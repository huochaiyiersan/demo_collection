package hui.com.exception.ParseException;

import java.util.Date;

public class St {
	
	private String username;
	private String passwrod;
	private int age;
	private Date begin;
	private Date end;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswrod() {
		return passwrod;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBegin() {
		return begin;
	}
	public void setBegin(Date begin) {
		this.begin = begin;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "St [username=" + username + ", passwrod=" + passwrod + ", age=" + age + ", begin=" + begin + ", end="
				+ end + "]";
	}
	
	
	
	
	
	
	

}

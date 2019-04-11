package hui.java.demo.a;

public class School {
	private String schName="第一中学";
	
	private int schAge = 9;
	private int schstunum = 900;
	public String getSchName() {
		return schName;
	}
	public void setSchName(String schName) {
		this.schName = schName;
	}
	public int getSchAge() {
		return schAge;
	}
	public void setSchAge(int schAge) {
		this.schAge = schAge;
	}
	public int getSchstunum() {
		return schstunum;
	}
	public void setSchstunum(int schstunum) {
		this.schstunum = schstunum;
	}
	@Override
	public String toString() {
		return "School [schName=" + schName + ", schAge=" + schAge + ", schstunum=" + schstunum + "]";
	}
	
	

}

package hui.com.exception.ParseException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestMain {

	public static void main(String[] args) {
		St s = new St();
		
		try {
			setSt(s);
			System.out.println("oooooo"+s.toString());
		} catch (ParseException e) {
			System.out.println(s.toString());
			e.printStackTrace();
		}
		
		
		
		
		// TODO Auto-generated method stub

	}
	
	
	
	public static St setSt (St s) throws ParseException{
		
		String tr = "2018-02-01";
		String ts = "2010-01-25";
		
		s.setPasswrod("111111111");
		s.setUsername("sdfjkslfjsdlka");
		s.setAge(12);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		s.setBegin(sdf.parse(tr));
		
		s.setEnd(sdf.parse(ts));
		
		
		
		return s;
	}

}

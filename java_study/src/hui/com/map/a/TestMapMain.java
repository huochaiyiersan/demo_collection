package hui.com.map.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hui.java.demo.a.School;
import hui.java.demo.a.Student;

public class TestMapMain {

	public static void main(String[] args) {
		
		
		
		

		Map<String,Object> map = new HashMap<String,Object>();
		
		List<Student> stulist =  teststu();
		
		 List<School> schlist =  testsch();
		 
		// map.put("stu", stulist);
		 map.put("sch", schlist);
		 
		Object objstu =  map.get("stu");
		List<Student> slist =  (List<Student>) map.get("stu");
		
		if(slist!=null&&slist.size()>0){
			System.out.println("1111111111111");
		}
		if(objstu!=null){
			List<Student> studlist = (List<Student>)objstu;
			
			for(Student st:studlist ){

				System.out.println(st.toString());
			}
		}
		
		
		Object objsch = map.get("sch");
		

		if(objsch!=null){
			List<School> scholist = (List<School>)objsch;
			
			for(School sc:scholist ){

				System.out.println(sc.toString());
			}
		}
		
		
		
		
		
		
		
		
		
	}

	public static List<Student> teststu() {
		Student stu = new Student();
		List<Student> stulist = new ArrayList<Student>();
		stulist.add(stu);
		
		return stulist;
	}
	
	
	public static List<School> testsch() {
		School sch = new School();
		List<School> schlist = new ArrayList<School>();
		schlist.add(sch);
		
		return schlist;
	}

}

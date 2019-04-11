package hui.java.demo.a;

import java.util.ArrayList;
import java.util.List;

public class ManyOjbect {

	public static void main(String[] args) {
		List<Object> objList = new ArrayList<Object>();
		
		
		Student stu = new Student();
		
		System.out.println(stu.getAge()+stu.getUsername());
		
		objList.add(stu);
		School sch = new School();
		
		System.out.println(sch.getSchAge()+sch.getSchName()+sch.getSchstunum());
		objList.add(sch);
		
		objList.remove(0);
		objList.add(0, sch);
		
		objList.add(0, "SUCCESS");
		/*
		Student stus = (Student)objList.get(0);
		System.out.println(stus.getAge()+stus.getUsername());*/
		School schs1 = (School)objList.get(0);
		System.out.println(schs1.getSchAge()+schs1.getSchName()+schs1.getSchstunum());
		
		School schs = (School)objList.get(1);
		System.out.println(schs.getSchAge()+schs.getSchName()+schs.getSchstunum());

	}

}

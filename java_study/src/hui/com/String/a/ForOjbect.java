package hui.com.String.a;

import java.awt.List;
import java.util.ArrayList;

public class ForOjbect {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("123");
		list.add("456");
		list.add("789");
		
		ArrayList<String> li = new ArrayList<String>();
		
		for(int i=0;i<3;i++){
			String str = list.get(i);
			for(int j=0;j<3;j++){
				li.add(str);
				break;
			}
		}
		
		
		for(String s:li){
			System.out.println(s);
		}
		

	}

}

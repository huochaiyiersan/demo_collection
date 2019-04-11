package hui.com.String.a;

public class TestMain {

	public static void main(String[] args) {
		String usernam = "shangxiang.xls.jdfkf";
		
		String[] names = usernam.split(".");
		
		for(String name:names){
			System.out.println(name);
		}

	}																	

}

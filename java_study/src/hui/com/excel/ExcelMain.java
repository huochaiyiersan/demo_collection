package hui.com.excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import hui.com.excel.demo.ReadExcel;
import jxl.read.biff.BiffException;

public class ExcelMain {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		String filePath = "D:\\学习资源\\";
		String fileName = "练习文档.xls";
		
		//ReadExcel.readExcel(filePath, fileName);
		gg();
	}
	
	
	public static String gg(){
		List arraylist = new ArrayList<String[]>();
		
		for(int i=0;i<3;i++){
			String[] str = new String[3];
			str[0]="张三";
			str[1]="25";
			str[2]="女";
			
			arraylist.add(str);
		}
		
		for(int i=0;i<3;i++){
			String[] str = new String[3];
			str[0]="lisi";
			str[1]="24";
			str[2]="nan";
			
			arraylist.add(str);
		}
		
		for(int i=0;i<3;i++){
			String[] str = new String[3];
			str[0]="张三";
			str[1]="25";
			str[2]="女";
			
			arraylist.add(str);
		}
		
		for(int i=0;i<3;i++){
			String[] str = new String[3];
			str[0]="赵六";
			str[1]="25";
			str[2]="女";
			
			arraylist.add(str);
		}
		for(int i=0;i<3;i++){
			String[] str = new String[3];
			str[0]="张三";
			str[1]="25";
			str[2]="女";
			
			arraylist.add(str);
		}
		
		for(int i=0;i<arraylist.size();i++){
			String[] array = new String[3];
			array = (String[])arraylist.get(i);
			
			System.out.println(array[0]+"   "+array[1]+"   "+array[2]);
		}
		
	System.out.println(".........................................................................");	
		List list = new ArrayList<String[]>();
		for(int i=0;i<arraylist.size();i++){
			String[] array = new String[3];
			String[] arr = new String[3];
			int size = arraylist.size();
			array = (String[])arraylist.get(i);
			
			for(int j=i+1;j<size;j++){
				arr = (String[])arraylist.get(j);
					if((array[0].equals(arr[0]))&&(array[1].equals(arr[1]))&&(array[2].equals(arr[2]))){
						list.add(j);
						System.out.println("j的值是"+j);
					}
			}
			System.out.println("arraylist的值"+arraylist.size());
			System.out.println("list的值"+list.size());
			for(int y=list.size()-1;y>=0;y--){
				int g = (int)list.get(y);
				arraylist.remove(g);
				System.out.println("g移除成功"+g);
			}
			
		}
		
		for(int i=0;i<arraylist.size();i++){
			String[] array = new String[3];
			array = (String[])arraylist.get(i);
			
			System.out.println(array[0]+"   "+array[1]+"   "+array[2]);
		}
		
		return "";
	}

}

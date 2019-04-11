package hui.com.excel;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import hui.com.excel.demo.ReadExcel;
import jxl.read.biff.BiffException;

public class ExcelMain {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		String filePath = "D:\\学习资源\\";
		String fileName = "练习文档.xls";
		
		//ReadExcel.readExcel(filePath, fileName);
		//test();
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, +3);
		Date date = calendar.getTime();
		System.out.println(date);
		
		Date date1 = new Date();
		
		Random random = new Random();
        int hhh =  random.nextInt(10000000);
        
        
		System.out.println(hhh);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		

	}
	
	
	
	public static void test(){
		List<String[]> list = new ArrayList<String[]>();
		//String[] str;
		for(int i=0;i<10;i++){
			String[] str = new String[3];
			str[0]=i+"";
			str[1]=i+"hj";
			str[2]=i+"hhhhh";
			System.out.println();
			list.add(str);
			
		}
		
		for(String[] s:list){
			System.out.println("thissi   "+s[0]+"   fdfdfdfd    "+s[1]+"   "+s[2]);
		}
		
		
	}

}

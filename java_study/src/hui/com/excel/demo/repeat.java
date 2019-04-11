package hui.com.excel.demo;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class repeat {

	public static void main(String[] args) throws  Exception{

		String filePath = "D:\\";
		String fileName = "测试餐食.xls";

		readExcel(filePath, fileName);
	}
	public static String readExcel(String filePath,String fileName) throws BiffException, IOException{
		
		int i;
		Sheet sheet;
		Workbook wbook;
		Cell cell;
		
		wbook = Workbook.getWorkbook(new File(filePath+fileName));
		
		Sheet[] sheets = wbook.getSheets();//以数组的形式获取文档中的所有的sheet
		sheet = sheets[0];//通过上边的数组获取sheet
		
		//sheet = wbook.getSheet(0);//直接指定获取第一个sheet
		//sheet = wbook.getSheet("人工");//直接指定获取已名为“人工”的sheet
		String sheetName = sheet.getName();//获取sheet的名称
		int columns = sheet.getColumns();//获取列数
		int rows = sheet.getRows();//获取行数
		System.out.println("sheet名为"+sheetName+"    列数"+columns+"    行数"+rows);
		getServicelist(sheet,columns,rows);
		wbook.close();		
		return "";
	}




/**
 * 
 * @param sheet
 * @param columns
 * @param rows
 * @return 去重
 */
	public static Object getServicelist(Sheet sheet,int columns,int rows){

		List serArList = new ArrayList<String[]>();
		String[] serArray;
		Cell cell;
		String[] arr;
		String[] str_s;
		String[]  str_l;
		for(int row=1;row<rows;row++){
			serArray =new String[3];
			for(int column=1;column<4;column++){
				cell = sheet.getCell(column,row);
				System.out.print(cell.getContents());
				serArray[column-1] = cell.getContents();
			}
			serArList.add(serArray);
			System.out.println();
		}

		for(int i=0;i<serArList.size();i++){
				arr = (String[])serArList.get(i);
				for(int j =0;j<arr.length;j++){
					System.out.print(arr[j]);
					System.out.print("       ");
				}
			System.out.println();
		}

		List<String[]> list = new ArrayList<String[]>();

		list.add((String[])serArList.get(0));
	
		for(int i=0;i<serArList.size();i++){
			str_s = (String[])serArList.get(i);
			boolean buff = true;
			for(int j=0;j<list.size();j++){
				System.out.println(list.size());
				str_l = (String[])list.get(j);
				if((str_l[0].equals(str_s[0]))&&(str_l[1].equals(str_s[1]))&&(str_l[2].equals(str_s[2]))){
					buff=false;
					break;
				}
			}
			if(buff){
				list.add((String[])serArList.get(i));
			}
		}

		for(int i=0;i<list.size();i++){
			arr = (String[])list.get(i);
			for(int j =0;j<arr.length;j++){
				System.out.print(arr[j]);
				System.out.print("       ");
			}
			System.out.println();
		}

		return "";
	}

}


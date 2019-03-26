package hui.com.excel.demo;


import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {
	
	public static String readExcel(String filePath,String fileName) throws BiffException, IOException{
		
		int i;
		Sheet sheet;
		Workbook wbook;
		Cell cell;
		
		wbook = Workbook.getWorkbook(new File(filePath+fileName));
		
		Sheet[] sheets = wbook.getSheets();//以数组的形式获取文档中的所有的sheet
		sheet = sheets[1];//通过上边的数组获取sheet
		
		//sheet = wbook.getSheet(0);//直接指定获取第一个sheet
		//sheet = wbook.getSheet("人工");//直接指定获取已名为“人工”的sheet
		String sheetName = sheet.getName();//获取sheet的名称
		int columns = sheet.getColumns();//获取列数
		int rows = sheet.getRows();//获取行数
		
		System.out.println("sheet名为"+sheetName+"    列数"+columns+"    行数"+rows);
		
		
		for(int column=0;column<columns;column++){
			for(int row=0;row<rows;row++ ){
				Cell cl = sheet.getCell(column, row);
				
				System.out.println(cl.getContents());
				
			}
			System.out.println();
		}
		wbook.close();		
		return "";
	}

}

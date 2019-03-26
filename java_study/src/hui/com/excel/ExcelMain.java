package hui.com.excel;

import java.io.IOException;

import hui.com.excel.demo.ReadExcel;
import jxl.read.biff.BiffException;

public class ExcelMain {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		String filePath = "D:\\学习资源\\";
		String fileName = "练习文档.xls";
		
		ReadExcel.readExcel(filePath, fileName);

	}

}

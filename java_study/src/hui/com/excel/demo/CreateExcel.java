package hui.com.excel.demo;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 需要引入org.apache.poijar包
 * @author chunhb
 *使用Java代码创建一个excel表格，保存到本地
 *创建了一个俩行三列的excle文件
 */
public class CreateExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1创建一个workboot
		HSSFWorkbook workboot = new HSSFWorkbook();
		//2创建了一个sheet
		HSSFSheet sheet_stu  = workboot.createSheet("学生表");
		//3创建一行
		HSSFRow row_0 = sheet_stu.createRow(0);
		//4创建一个 单元格
		HSSFCellStyle cellstyle = workboot.createCellStyle();
			cellstyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); 
		//5第一行创建第一，二，三列
		HSSFCell cell = row_0.createCell(0);
	     cell.setCellValue("学号");  
	     cell.setCellStyle(cellstyle);  
	    cell = row_0.createCell(1);
	     cell.setCellValue("学号");  
	     cell.setCellStyle(cellstyle);  
	    cell = row_0.createCell(2);
	     cell.setCellValue("学号");  
	     cell.setCellStyle(cellstyle);  
	     //创建第二行创建第一，二，三列
	     row_0 = sheet_stu.createRow(1);
			//5第一行创建第一列
	     	cell = row_0.createCell(0);
		     cell.setCellValue("学号1");  
		     cell.setCellStyle(cellstyle);  
		    cell = row_0.createCell(1);
		     cell.setCellValue("学号2");  
		     cell.setCellStyle(cellstyle);  
		    cell = row_0.createCell(2);
		     cell.setCellValue("学号3");  
		     cell.setCellStyle(cellstyle);  
		     
	     //6保存文件到e盘，名称为Members.xls
	     FileOutputStream fout = new FileOutputStream("E:/Members.xls");  
	     workboot.write(fout);  
         fout.close();  

		
	}

}

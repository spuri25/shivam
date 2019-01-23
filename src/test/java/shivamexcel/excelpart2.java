package shivamexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excelpart2 {

	public static void main(String[] args) throws IOException, BiffException {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("C:\\workspace\\CopyoftestData1forSelenium.xls");
System.out.println("1");
Workbook wb = Workbook.getWorkbook(fis);
System.out.println("2");
String data00 = wb.getSheet(0).getCell(0, 0).getContents();
String data01= wb.getSheet(0).getCell(0, 1).getContents();
System.out.println(data00);
System.out.println(data01);
int count=wb.getSheet(0).getRows();
System.out.println(count);
;
for(int i=0;i<count;i++)
{
String data03 = wb.getSheet(0).getCell(0, i).getContents();
String data04 = wb.getSheet(0).getCell(1, i).getContents();
System.out.println(data03);
System.out.println(data04);
 }
	}
}
	

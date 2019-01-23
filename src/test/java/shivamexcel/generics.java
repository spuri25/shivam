package shivamexcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;

import jxl.Workbook;

public class generics {
//datahelper
	//datahelper
	
	FileInputStream fis;
	Workbook wb;
public generics(String xlPath)
{
	try
	{
		fis = new FileInputStream(xlPath);
		 wb = Workbook.getWorkbook(fis);
	}
	catch(Exception e)
	{
		System.out.println("no file found");
	}
}

//this method gets the rowcount
public int GetRowCount(int sheetNum)
{
	int rowcount=wb.getSheet(0).getRows();
	return rowcount;
}
//the method to get value from the surver
public String CellData1(int sheetnum, int col, int row)
{

	String data03 = wb.getSheet(sheetnum).getCell(col, row).getContents();

	return (data03);
	
}
public String CellData2(int sheetnum, int col, int row)
{

	String data04 = wb.getSheet(sheetnum).getCell(col, row).getContents();

	return (data04);
	
}

}

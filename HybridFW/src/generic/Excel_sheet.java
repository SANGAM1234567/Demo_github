package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_sheet 
{

	public static String get(String Sh,int r,int c) 
	{
		String value="";
		try
		{
		FileInputStream fis=new FileInputStream("./excel/hybrid fw.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(Sh);
	
		 Row row = sh.getRow(r);
		Cell cell = row.getCell(c);
		 value = cell.toString();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return value;
	
	}

}

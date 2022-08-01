package ExcelData;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public static String getstringData(String sheetname, int row, int cell) throws Exception {
		
		String path="C:\\Users\\mrpat\\eclipse-workspace\\ras_1\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	

}

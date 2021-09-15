package org.tst;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AdactinHotel 
{
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\m.shalini\\eclipse-workspace\\Atactin\\Excel\\Adactin.xlsx");
	FileInputStream stream= new FileInputStream(file);
	
	Workbook workbook=new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("Sheet1");
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) { 
			Cell cell = row.getCell(j);
		
			int type = cell.getCellType();
			if (type==1) {
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
			if (type==0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					String data= new SimpleDateFormat("dd-MMM-yy").format(cell.getDateCellValue());
					System.out.println(data);
				}
				else {
			String data=String.valueOf((long)cell.getNumericCellValue());
			System.out.println(data);
				}
			}
		}
	}
}
}


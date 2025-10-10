package assignmentonexcepfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmpSalaryexcel {
	public static void main(String[] args) throws IOException {
		 Workbook workbook =new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("DemoSheet");
 
        
        for (int i = 0; i < 5; i++) {
            Row row = sheet.createRow(i);
            for (int j = 0; j < 5; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue("Employee ID"+(j+1)); 
            }
        }
        
        FileOutputStream fos =new FileOutputStream("emp.xslx");
        workbook.write(fos);
        fos.close();
        workbook.close();
        System.out.println("Report is ready ");
        
        FileInputStream fis = new FileInputStream("emp.xlsx");
        Workbook readWorkbook = new XSSFWorkbook(fis);
        Sheet readSheet = readWorkbook.getSheetAt(0);
 
        for (int i = 0; i < 5; i++) {
            Row row = readSheet.getRow(i);
            for (int j = 0; j < 5; j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell.getStringCellValue() + "\t");
            }
            System.out.println();
        }
 
        readWorkbook.close();
        
 
		
	}

}

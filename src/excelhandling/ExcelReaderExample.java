package excelhandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ExcelReaderExample {
    public static void main(String[] args) throws IOException {
 
        // ---------------- WRITE DATA ----------------
        Workbook workbook =new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("DemoSheet");
 
        // Write 5 rows × 5 columns
        for (int i = 0; i < 5; i++) {
            Row row = sheet.createRow(i);
            for (int j = 0; j < 5; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue("R" + (i + 1) + "C" + (j + 1)); // Example: R1C1, R1C2...
            }
        }
 
        // Save Excel file
        FileOutputStream fos = new FileOutputStream("demo.xlsx");
        workbook.write(fos);
        fos.close();
        workbook.close();
        System.out.println("Excel file with 5x5 data created successfully!");
 
        // Read Data
        FileInputStream fis = new FileInputStream("demo.xlsx");
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

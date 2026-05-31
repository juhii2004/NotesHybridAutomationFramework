package utils;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelUtils {

    private static String path =
            "src/test/resources/testdata/TestData.xlsx";

    public static String getCellData(
            String sheetName,
            int rowNum,
            int colNum) {

        try {

            FileInputStream fis = new FileInputStream(path);

            Workbook workbook = WorkbookFactory.create(fis);

            Sheet sheet = workbook.getSheet(sheetName);

            Row row = sheet.getRow(rowNum);

            return row.getCell(colNum).toString();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return "";
    }

    public static void writeResult(
            String sheetName,
            int rowNum,
            int colNum,
            String value) {

        try {

            FileInputStream fis = new FileInputStream(path);

            Workbook workbook = WorkbookFactory.create(fis);

            Sheet sheet = workbook.getSheet(sheetName);

            Row row = sheet.getRow(rowNum);

            Cell cell = row.createCell(colNum);

            cell.setCellValue(value);

            FileOutputStream fos = new FileOutputStream(path);

            workbook.write(fos);

            fos.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
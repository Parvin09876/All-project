package com.parvin.Utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataDrivenFile {
    public static Object[][] getDataFromExcel(String excelFilePath, String sheetName, int columCount) throws IOException {
        Object[][] data;
        File src = new File(excelFilePath);
        FileInputStream fileInputStream = new FileInputStream(src);

        Workbook workbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getLastRowNum();
        data = new Object[rowCount][columCount];

        for (int i = 1; i <= rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < columCount; j++) {
                data[i - 1][j] = row.getCell(j).toString();
            }
        }
        return data;
    }

}


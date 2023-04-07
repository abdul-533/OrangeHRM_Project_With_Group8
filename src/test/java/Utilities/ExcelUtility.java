package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ExcelUtility {

    public static ArrayList<ArrayList<String>> getData(String path, String sheetName, int count) {
        ArrayList<ArrayList<String>> tablo = new ArrayList<>();
        Sheet sheet = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);


        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> stir = new ArrayList<>();
            for (int j = 0; j < count; j++) {
                stir.add(sheet.getRow(i).getCell(j).toString());
            }
            tablo.add(stir);

        }


        return tablo;
    }

    public static void writeExcel(String path, Scenario scenario, String browserName) {
        File file = new File(path);

        if (!file.exists()) {

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("orangeHRM_Test");
            Row newRow = sheet.createRow(0);
            Cell newCell = newRow.createCell(0);
            newCell.setCellValue(scenario.getName());

            newCell = newRow.createCell(1);
            newCell.setCellValue(scenario.getStatus().toString()); //fail ve ya pass olmasin aldik

            newCell = newRow.createCell(2);
            newCell.setCellValue(browserName);

            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();

            } catch (Exception e) {
                System.out.println("e.getMessage() = " + e.getMessage());
            }


        } else {
            Sheet sheet = null;
            Workbook workbook = null;
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
                sheet = workbook.getSheet("orangeHRM_Test");
            } catch (Exception e) {
            }

            Row newRow = sheet.createRow(sheet.getPhysicalNumberOfRows());

            Cell newCell = newRow.createCell(0);
            newCell.setCellValue(scenario.getName());

            newCell = newRow.createCell(1);
            newCell.setCellValue(scenario.getStatus().toString());

            newCell = newRow.createCell(2);
            newCell.setCellValue(browserName);


            try {
                inputStream.close();
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (Exception e) {

            }

        }


    }


}

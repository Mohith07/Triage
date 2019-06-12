package com.hackathon.triage.excelreader;

import com.hackathon.triage.excelreader.domain.ExcelComponent;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

@Component
public class reader {

    @Value("${jira.api}")
    private String FILE_NAME;
    private static Map<String, List<ExcelComponent>> allComponents;

    public reader() {
        this.allComponents = new HashMap<>();
    }

    public static void main(String[] args) {

        try {

            FileInputStream excelFile = new FileInputStream(new File("C:\\Users\\jainmo\\Downloads\\Triage\\src\\main\\java\\com\\hackathon\\triage\\excelreader\\Areas_of_Expertise.xlsx"));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = (Sheet) workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();

            while (iterator.hasNext()) {

                System.out.println();
                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();

                if (cellIterator.next().getStringCellValue().equals("Topics")) {
                    while (cellIterator.hasNext()) {
                        String componentName = cellIterator.next().getStringCellValue();
                        allComponents.put(componentName, Arrays.asList(new ExcelComponent(componentName)));
                    }
                }
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();
                    if(currentCell.getCellType()==Cell.CELL_TYPE_BLANK) {
                        System.out.print("0--");
                    }
                    else {
                        if (currentCell.getCellType() == Cell.CELL_TYPE_STRING) {
                            System.out.print(currentCell.getStringCellValue() + "--");
                        } else if (currentCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                            System.out.print(currentCell.getNumericCellValue() + "--");
                        }
                    }

                }
                System.out.println();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

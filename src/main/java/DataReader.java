import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by Ian on 10/5/2017.
 */
public class DataReader {
    public void readExcel(String fileName){
        try {
            FileInputStream excelFile = new FileInputStream(new File(fileName));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet;
            Iterator<Row> iterator;
            Iterator<Cell> cellIterator;
            Cell currentCell;

            for(int i = 0; i < workbook.getNumberOfSheets();i++){
                datatypeSheet = workbook.getSheetAt(i);
                iterator = datatypeSheet.iterator();
                while(iterator.hasNext()){
                    Row currRow = iterator.next();
                    cellIterator = currRow.iterator();
                    while(cellIterator.hasNext()){
                        currentCell = cellIterator.next();
                        this.printMessage(currentCell);
                    }
                }
            }

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            e.getMessage();
            System.exit(1);
        }
        catch(IOException e){
            e.printStackTrace();
            e.getMessage();
            System.exit(2);
        }
    }

    public void printMessage(Cell inputCell){
        switch (inputCell.getCellTypeEnum()){
            case BOOLEAN:
                System.out.println(inputCell.getBooleanCellValue());
                break;

            case NUMERIC:
                System.out.println(inputCell.getNumericCellValue());
                break;

            case STRING:
                System.out.println(inputCell.getStringCellValue());
                break;
        }
    }
}

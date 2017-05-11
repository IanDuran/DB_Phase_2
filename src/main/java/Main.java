/**
 * Created by Ian on 10/5/2017.
 */
public class Main {

    public static void main(String... args){
        final String FILE_NAME = "testFile.xlsx";
        DataReader reader = new DataReader();
        reader.readExcel(FILE_NAME);

        /*DBWriter writer = new DBWriter();
        writer.printQueryResult("SELECT * FROM book;");*/
    }
}

package example_31;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.testng.annotations.DataProvider;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DataProviderFromCSV {

    @DataProvider(name = "stateCapitals")
    public static Object[][] stateCapital() {
        int ctr = 0;
        Object[][] objects = new Object[0][];
        String DIRECTORY_PATH = System.getProperty("user.dir");
        String csvFile = DIRECTORY_PATH + "/src/test/java/example_31/testdata.csv";
        FileReader filereader = null;
        try {

            filereader = new FileReader(csvFile);
            CSVReader csvReader = new CSVReaderBuilder(filereader).build();
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                ctr++;
            }
            objects = new Object[ctr][2];
            int i = 0, j = 0;
            for (String[] row : allData) {
                j = 0;
                for (String cell : row) {
                    objects[i][j] = cell;
                    j++;
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objects;
    }
}

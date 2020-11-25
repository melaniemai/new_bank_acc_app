import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    // Function reads from a CSV file and returns as a list
    public static List<String[]> read(String file) {
        List<String[]> data = new LinkedList<String[]>();
        String dataLine;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((dataLine = br.readLine()) != null) {
                String[] dataRecords = dataLine.split(",");
                data.add(dataRecords);
            }
        } catch (FileNotFoundException e) {
            System.out.println("NO FILE FOUND.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("NO FILE FOUND.");
            e.printStackTrace();
        }
        return data;
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * TODO:
 *  - Update the path to your dataset file
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException {

        // TODO: Update this with your CSV file path
        File file = new File("data/your_dataset.csv");

        // TODO: Create an array of Data objects to store data
        Data[] dataList = new Data[100]; //adjust size as needed
        int dataCount = 0; //to keep track of # data objects
        

        // TODO: Read file using Scanner
        // - Skip header if needed
        // - Loop through rows
        // - Split each line by commas
        // - Convert text to numbers when needed
        // - Create new Data objects
        // - Add to your array
        Scanner scanner = new Scanner(file);
        scanner.nextLine(); 
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");

            String name = columns[0];
            double value = Double.parseDouble(columns[1]);

            Data data = new Data(name, value);

            dataList[dataCount] = data;
            dataCount++;
        }

        scanner.close();

        System.out.println("Rows loaded: " + dataCount);


        // TODO: Call your analysis methods
        // Example:
        // double maxValue = findMaxValue(dataList);
        // double average = computeAverageValue(dataList);
        

        double max = findMaxValue(dataList, dataCount);
        double average = computeAverageValue(dataList, dataCount);
        
    

        // TODO: Print insights
        // - Number of rows loaded
        // - Min, max, average, or any other findings
        // - Final answer to your guiding question
        System.out.println("Max value: " + max);
        System.out.println("Average value: " + average);



        // OPTIONAL TODO:
        // Add user interaction:
        // Ask the user what kind of analysis they want to see
    }
    public static double findMaxValue(Data[] dataList, int count) {
            double max = Double.MIN_VALUE;
            for (int i = 0; i < count; i++) {
                if (dataList[i].getValue() > max) {
                    max = dataList[i].getValue();
                }
            }
            return max;
        }
        public static double computeAverageValue(Data[] dataList, int count) {
            double sum = 0.0;
            for (int i = 0; i < count; i++) {
                sum += dataList[i].getValue();
            }
            return sum / count;
        }
}



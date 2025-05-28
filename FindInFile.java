import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindInFile {
    public static String getStringByIndex(String filePath, int index) {
        String result = null;
        int currentIndex = 1;

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                currentIndex++;
                String line = scanner.nextLine();
                if (currentIndex == index) {
                    result = line;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        return result;
    }

    public static int findIndex(String filePath, String target) {
        File file = new File(filePath);
        int lineNumber = 1;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                lineNumber++;
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase(target)) {
                    return lineNumber;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }

        return -1; // Target string not found
    }
}
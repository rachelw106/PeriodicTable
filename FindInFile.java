import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindInFile {
    public static String getStringByIndex(String filePath, int index) {
        String result = null;
        int currentIndex = 0;

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (currentIndex == index) {
                    result = line;
                    break;
                }
                currentIndex++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        return result;
    }

    public static int findIndex(String filePath, String targetValue) {
        int index = 0;

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int valueIndex = line.indexOf(targetValue);

                if (valueIndex != -1) {
                    return index + valueIndex;
                }
                index += line.length() + 1;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            return -1;
        }

        return -1; 
    }

    public static int findIntIndex(String filePath, int target) {
        int index = 0;
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int num = scanner.nextInt();
                    if (num == target) {
                        return index;
                    }
                    index++;
                } else {
                    scanner.next(); // Skip non-integer values
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
            return -1; // Return -1 if file not found
        }
        return -1; // Return -1 if target integer is not found
    }
}
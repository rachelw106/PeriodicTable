import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.println("Hi. Please enter your name");
        String name = scanner.nextLine();

        // Ask for mode selection
        System.out.println("Welcome " + name + ". Type practice or test to continue");
        String mode = scanner.nextLine();

        // Handle practice mode
        if (mode.equalsIgnoreCase("practice")) {
            System.out.println("Select difficulty level: Easy, Medium, or Hard");
            String difficulty = scanner.nextLine();

            System.out.println("Understood. Starting practice mode with difficulty: " + difficulty);
            System.out.println("If you wish to quit during the session, type 'quit'");

            ArrayList<String> selectedQuestions = new ArrayList<>();

            // Choose the question bank based on selected difficulty
            if (difficulty.equalsIgnoreCase("easy")) {
                selectedQuestions = easy;
            } else if (difficulty.equalsIgnoreCase("medium")) {
                selectedQuestions = medium;
            } else if (difficulty.equalsIgnoreCase("hard")) {
                selectedQuestions = hard;
            } else {
                System.out.println("Invalid difficulty level selected. Ending program.");
                return;
            }

            while (true) {
                int index = (int)(Math.random() * selectedQuestions.size());
                String question = selectedQuestions.get(index);

                System.out.println(question);

                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("quit")) {
                    System.out.println("Exiting practice session");
                    break;
                }

                String fileName = "";
                if (question.contains("group")) {
                    fileName = "Groups.txt";
                } else if (question.contains("symbol for")) {
                    fileName = "Symbols.txt";
                } else if (question.contains("element for the symbol")) {
                    fileName = "Element.txt";
                } else if (question.contains("atomic number")) {
                    fileName = "Numbers.txt";
                } else if (question.contains("atomic mass")) {
                    fileName = "Mass.txt";
                }

            }
        }
    }
}
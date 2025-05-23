import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.println("Hi. Please enter your name");
        String name = scanner.nextLine();

        // Ask for mode selection
        System.out.println("Welcome " + name + ". Type practice or test to continue");
        String mode = scanner.nextLine();
        if(!(mode.equalsIgnoreCase("practice") || mode.equalsIgnoreCase("test"))){
            System.out.println("Invalid argument selected. Ending program.");
            return;
        }

        // Handle practice mode
        if (mode.equalsIgnoreCase("practice")) {
            System.out.println("Select difficulty level: easy, medium, or hard");
            String difficulty = scanner.nextLine();
            // Choose the question bank based on selected difficulty
            if (!(difficulty.equals("easy") || (difficulty.equals("medium") || difficulty.equals("hard")))) {
                System.out.println("Invalid difficulty level selected. Ending program.");
                return;
            }

            System.out.println("Understood. Starting practice mode with difficulty: " + difficulty);
            System.out.println("If you wish to quit during the session, type 'quit'");

            while (true) {
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("quit")) {
                    System.out.println("Exiting practice session");
                    break;
                } else {
                    PeriodicTable.easy();
                }
            }
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PeriodicTable p = new PeriodicTable();

        // Ask for user's name
        System.out.println("Hi. Please enter your name");
        String name = scanner.nextLine();

        // Ask for mode selection
        System.out.println("Welcome " + name + ". Type practice or test to continue");
        String mode = scanner.nextLine();
        if(!(mode.equalsIgnoreCase("practice") || mode.equalsIgnoreCase("test"))){
            System.out.println("Invalid argument selected. Ending program.");
            scanner.close();
            return;
        }

        // Handle practice mode
        if (mode.equalsIgnoreCase("practice")) {
            System.out.println("Select difficulty level: easy, medium, or hard");
            String difficulty = scanner.nextLine();
            // Choose the question bank based on selected difficulty
            if (!(difficulty.equals("easy") || (difficulty.equals("medium") || difficulty.equals("hard")))) {
                System.out.println("Invalid difficulty level selected. Ending program.");
                scanner.close();
                return;
            }

            System.out.println("Understood. Starting practice mode with difficulty: " + difficulty);
            System.out.println("Press enter after each question.");
            System.out.println("If you wish to quit during the session, type 'quit'");

            while (true) {
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("quit")) {
                    System.out.println("Exiting practice session");
                    break;
                } else {
                    if(difficulty.equals("easy")) p.easy();
                    if(difficulty.equals("medium")) p.medium();
                    if(difficulty.equals("hard")) p.hard();
                }
            }
        } else {
            //test mode
            p.enableTesting();
            System.out.println("Test mode enabled. You will answer 10 questions of varying difficulty.");
            System.out.println("Your score will be shown at the end of the test.");
            System.out.println("Press enter to begin.");
            scanner.nextLine();

            for(int i = 0; i < 8; i++){
                int random = 1; //(int) (Math.random()*3);
                if(random == 0) p.easy();
                if(random == 1) p.medium();
                if(random == 2) p.hard();
            }

            System.out.print("Your score is: ");
            int score = p.testScore();
            double finalScore = score/10.0;
            System.out.println(finalScore);
        }

        scanner.close();
    }
}
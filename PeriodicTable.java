import java.util.Scanner;
import java.util.ArrayList;

public class PeriodicTable {
    private int score;
    private Scanner scanner = new Scanner(System.in);
    private boolean test = false;

    public void enableTesting() {
        test = true;
    }
    public int testScore() {
        return score;
    }

    public void easy() {
        ArrayList<String> easy = new ArrayList<>();
        easy.add("Name an element in the group ");
        easy.add("What is the symbol for ");

        int choose = (int) (Math.random() * 2);

        if (choose == 0) {
            int num = (int) (Math.random() * 118 + 2);
            String group = FindInFile.getStringByIndex("Groups.txt", num);
            System.out.println(easy.get(0) + group + ".");
            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);
            int answerIndex = FindInFile.findIndex("Elements.txt", answer);

            String groupOfAnswer = FindInFile.getStringByIndex("Groups.txt", answerIndex);
            if (test && group.equalsIgnoreCase(groupOfAnswer)) {
                score++; System.out.println("true");
            }
            if (!test) {
                System.out.println("The correct answers are:");
                for (int i = 2; i < 120; i++) {
                    if (FindInFile.getStringByIndex("Groups.txt", i).equals(group)) {
                        System.out.println(FindInFile.getStringByIndex("Elements.txt", i));
                    }
                }
            }
        } else {
            int num = (int) (Math.random() * 118 + 2);
            String element = FindInFile.getStringByIndex("Elements.txt", num);
            System.out.println(easy.get(1) + element + "?");
            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);

            if (test && answer.equalsIgnoreCase(FindInFile.getStringByIndex("Symbols.txt", num))) {
                score++; System.out.println("true");
            }
            if (!test) {
                System.out.println("The correct answer is: " + FindInFile.getStringByIndex("Symbols.txt", num));
            }
        }
    }

    public void medium() {
        ArrayList<String> medium = new ArrayList<>();
        medium.add("What is the element for the symbol ");
        medium.add("What group contains the element ");

        int choose = (int) (Math.random() * 2);

        if (choose == 0) {
            int num = (int) (Math.random() * 118 + 2);
            String symbol = FindInFile.getStringByIndex("Symbols.txt", num);
            System.out.println(medium.get(0) + symbol + "?");

            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);
            if (answer.equalsIgnoreCase(FindInFile.getStringByIndex("Elements.txt", num)) && test) {
                score++; System.out.println("true");
            }
            if (!test) {
                System.out.println("The correct answer is: " + FindInFile.getStringByIndex("Elements.txt", num));
            }

        } else {
            int num = (int) (Math.random() * 118 + 2);
            String element = FindInFile.getStringByIndex("Elements.txt", num);
            System.out.println(medium.get(1) + element + ".");

            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);

            if (answer.equalsIgnoreCase(FindInFile.getStringByIndex("Groups.txt", num)) && test) {
                score++; System.out.println("true");
            }
            if (!test) {
                System.out.println("The correct answer is: " + FindInFile.getStringByIndex("Groups.txt", num));
            }
        }
    }

    public void hard() {
        ArrayList<String> hard = new ArrayList<>();
        hard.add("Which element corresponds to the atomic number ");
        hard.add("What is the atomic number for the element ");
        hard.add("What is the atomic mass for the element ");

        int choose = (int) (Math.random() * 3);

        if (choose == 0) {
            int num = (int) (Math.random() * 118 + 1);
            System.out.println(hard.get(0) + num + ".");
            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);

            if (answer.equalsIgnoreCase(FindInFile.getStringByIndex("Elements.txt", num + 2)) && test) {
                score++; System.out.println("true");
            }
            if (!test) {
                System.out.println("The correct answer is: " + FindInFile.getStringByIndex("Elements.txt", num + 2));
            }

        } else if (choose == 1) {
            int num = (int) (Math.random() * 118 + 2);
            String element = FindInFile.getStringByIndex("Elements.txt", num);
            System.out.println(hard.get(1) + element + ".");
            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);

            if (answer.equalsIgnoreCase(FindInFile.getStringByIndex("Numbers.txt", num)) && test) {
                score++; System.out.println("true");
            }
            if (!test) {
                System.out.println("The correct answer is: " + FindInFile.getStringByIndex("Numbers.txt", num));
            }

        } else {
            int num = (int) (Math.random() * 118 + 2);
            String element = FindInFile.getStringByIndex("Elements.txt", num);
            System.out.println(hard.get(2) + element + ".");
            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);

            String correctAns = FindInFile.getStringByIndex("Mass.txt", num);
            String correctRounded = "";
            for(int i = 0; i < correctAns.length(); i++) {
                if(correctAns.substring(i, i+1).equals(".")) i = correctAns.length();
                else correctRounded += correctAns.substring(i,i+1);
            }
            String ansRounded = "";
            for(int i = 0; i < answer.length(); i++) {
                if(answer.substring(i, i+1).equals(".")) i = answer.length();
                else ansRounded += answer.substring(i,i+1);
            }
            if (correctRounded.equalsIgnoreCase(ansRounded) && test) {
                score++; System.out.println("true");
            }
            if (!test) {
                System.out.println("The correct answer is: " + FindInFile.getStringByIndex("Mass.txt", num));
            }
        }
    }
}
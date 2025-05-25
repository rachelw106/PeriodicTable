import java.util.Scanner;
import java.util.ArrayList;

public class PeriodicTable {
    private int score = 0;
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
        easy.add("Name an element in the group");
        easy.add("What is the symbol for ");
        easy.add("What is the element for the symbol ");

        int choose = (int) (Math.random() * 3);
        String question = easy.get(choose);

        if (question.equals(easy.get(0))) {
            int num = (int) (Math.random() * 118);
            String group = FindInFile.getStringByIndex("Groups.txt", num);
            System.out.println(easy.get(0) + group + ".");
            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);
            int answerIndex = FindInFile.findIndex("Elements.txt", answer);
            if (answerIndex > -1) {
                String groupOfAnswer = FindInFile.getStringByIndex("Groups.txt", answerIndex);
                if (test) {
                    if (group.equals(groupOfAnswer))
                        score++;
                }
            }
            if (!test) {
                System.out.println("The correct answers are:");
                for (int i = 0; i < 118; i++) {
                    if (FindInFile.getStringByIndex("Groups.txt", i).equals(group)) {
                        System.out.println(FindInFile.getStringByIndex("Elements.txt", i));
                    }
                }
            }

        } else if (question.equals(easy.get(1))) {

            int num = (int) (Math.random() * 118);
            String element = FindInFile.getStringByIndex("Elements.txt", num);
            System.out.println(easy.get(1) + element + "?");
            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);
            int answerIndex = FindInFile.findIndex("Symbols.txt", answer);
            if (answerIndex > -1) {
                String elementOfAnswer = FindInFile.getStringByIndex("Elements.txt", answerIndex);
                if (test) {
                    if (element.equals(elementOfAnswer))
                        score++;
                }
            }
            if (!test) {
                System.out.println("The correct answer is: " + FindInFile.getStringByIndex("Symbols.txt", num));
            }
        }
    }

    public void medium() {
        ArrayList<String> medium = new ArrayList<>();
        medium.add("Which element corresponds to the symbol ");
        medium.add("What group contains the element ");

        int choose = (int) (Math.random() * 2);
        String question = medium.get(choose);

        if (question.equals(medium.get(0))) {

            int num = (int) (Math.random() * 118);
            String symbol = FindInFile.getStringByIndex("Symbols.txt", num);
            System.out.println(medium.get(0) + symbol + "?");
            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);
            int answerIndex = FindInFile.findIndex("Elements.txt", answer);
            if (answerIndex > -1) {
                String symbolOfAnswer = FindInFile.getStringByIndex("Symbols.txt", answerIndex);
                if (symbol.equals(symbolOfAnswer) && test) {
                    score++;
                }
            }
            if (!test) {
                System.out.println("The correct answer is: " + FindInFile.getStringByIndex("Elements.txt", num));
            }
        } else {
            int num = (int) (Math.random() * 118);
            String element = FindInFile.getStringByIndex("Elements.txt", num);
            System.out.println(medium.get(1) + element + ".");
            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);
            int answerIndex = FindInFile.findIndex("Groups.txt", answer);

            if (answerIndex > -1) {
                String elementOfAnswer = FindInFile.getStringByIndex("Elements.txt", answerIndex);
                if (element.equals(elementOfAnswer) && test) {
                    score++;
                }
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
        String question = hard.get(choose);

        if(question.equals(hard.get(0))){
            
            int num = (int) (Math.random() * 118 + 1);
            System.out.println(hard.get(0) + num + ".");
            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);
            int answerIndex = FindInFile.findIndex("Elements.txt", answer);

            if (answerIndex > -1) {
                if (num == answerIndex + 1 && test) {
                    score++;
                }
            }
            if (!test) {
                System.out.println("The correct answer is: " + FindInFile.getStringByIndex("Elements.txt", num - 1));
            }

        } else if(question.equals(hard.get(1))) {
            
            int num = (int) (Math.random() * 118);
            String element = FindInFile.getStringByIndex("Elements.txt", num);
            System.out.println(hard.get(1) + element + ".");
            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);
            int answerIndex = FindInFile.findIndex("Numbers.txt", answer);

            if (answerIndex > -1) {
                String elementOfAnswer = FindInFile.getStringByIndex("Elements.txt", answerIndex);
                if (element.equals(elementOfAnswer) && test) {
                    score++;
                }
            }
            if (!test) {
                System.out.println("The correct answer is: " + FindInFile.getStringByIndex("Numbers.txt", num));
            }
        } else {
            int num = (int) (Math.random() * 118);
            String element = FindInFile.getStringByIndex("Elements.txt", num);
            System.out.println(hard.get(2) + element + ".");
            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);
            int answerIndex = FindInFile.findIndex("Mass.txt", answer);

            if (answerIndex > -1) {
                String elementOfAnswer = FindInFile.getStringByIndex("Elements.txt", answerIndex);
                if (element.equals(elementOfAnswer) && test) {
                    score++;
                }
            }
            if (!test) {
                System.out.println("The correct answer is: " + FindInFile.getStringByIndex("Mass.txt", num));
            }

        }
    }
}
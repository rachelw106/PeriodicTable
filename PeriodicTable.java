import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PeriodicTable{
    private static int score = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static boolean test = false;

    public void enableTesting() {
        test = true;
    }
    
    public static boolean easy() {
        ArrayList<String> easy = new ArrayList<>();
        easy.add("Name an element in the group ");
        easy.add("What is the symbol for ");
        easy.add("What is the element for the symbol ");

        int choose = (int) (Math.random()*3+1);
        String question= easy.get(choose);
        if(question.equals(easy.get(0)))
        {
            int num = (int) (Math.random()*118);
            String group = FindInFile.getStringByIndex("Groups.txt", num);
            System.out.println(easy.get(0) + group + ".");
            String answer = scanner.nextLine();
            System.out.println("Answer entered: " + answer);
            int answerIndex = FindInFile.findIndex("Elements.txt", answer);
            if(answerIndex > -1) {
                String groupOfAnswer = FindInFile.getStringByIndex("Groups.txt", answerIndex);
                if(test) {
                    if(groupOfAnswer.equals(group)) score++;
                } else {
                    System.out.println("The correct answers are:");
                    for(int i = 0; i < 118; i++) {
                        if(FindInFile.getStringByIndex("Groups.txt", i).equals(group)) {
                            System.out.println(FindInFile.getStringByIndex("Elements.txt", num));
                        }
                    }
                }
                if(groupOfAnswer.equals(group)) return true;
            } else {
                System.out.println("Answer not found.");
                return false;
            }

        } 
        else if(question.equals(easy.get(1)))
        {

        } 
        else {

        }

        s = new Scanner(g);
        int start= 1;
        while(s.hasNextLine()){
            start++;
        }

        }
    }
    public boolean medium() {
            ArrayList<String> medium = new ArrayList<>();
            medium.add("Which element corresponds to the symbol ");
            medium.add("What group contains the element ");
    }

    public boolean hard(){
        hard.add("Which element corresponds to the atomic number ");
        hard.add("What is the atomic mass for the element ");
    }
}
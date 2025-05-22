import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PeriodicTable{
    private int score = 0;
    //
    public boolean easy() {
        ArrayList<String> easy = new ArrayList<>();
        easy.add("Name an element in the group ");
        easy.add("What is the symbol for ");
        easy.add("What is the element for the symbol ");

        int choose = (int) (Math.random()*3+1);
        String question= easy.get(choose);
        if(question.equals(easy.get(0)))
        {
            File group = new File("Groups.txt");
            Scanner s = new Scanner(group);
            int index = 0;
            String chosenGroup = "";
            while(s.hasNextLine()) {
                index++;
                if(index == choose) {
                    chosenGroup = s.nextLine();
                }
            }
            System.out.print(easy.get(0) + chosenGroup);
            Scanner scanner = new Scanner(System.in);
            index = 0;
            String element = "";
            while(s.hasNextLine()) {
                index++;
                if(index == choose) {
                    chosenGroup = s.nextLine();
                }
            }
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
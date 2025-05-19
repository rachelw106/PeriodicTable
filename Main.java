import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
         ArrayList<String> easy = new ArrayList<>();
         ArrayList<String> medium = new ArrayList<>();
         ArrayList<String> hard = new ArrayList<>();

        //Questions:
         easy.add("Name an element in the group");
         easy.add("What's the symbol for");
         easy.add("What's the element for the symbol");

         medium.add("Which element corresponds to the symbol");
         medium.add("What group does the element  belong to");

         hard.add("Which element corresponds to the atomic number");
         hard.add("What is the atomic mass for the element");

        //Instructions:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Please enter your name");
         if (scanner.hasNextLine()) {
            String text = scanner.nextLine();
        }

        System.out.println("Welcome "+ text + ". What would you like to do, practice or test?");
         if (scanner.hasNextLine()) {
            String text = scanner.nextLine();
        }
        if(text.equals("practice"))
        {
            System.out.println("What difficulty would you like to do? Easy, Medium, Hard");
             if (scanner.hasNextLine()) {
                 String text = scanner.nextLine();
            }
            System.out.println("Understood! Starting practice, Difficulty: " + text + ". If you wish to quit anytime during the practice or the exam, you can enter 'quit'");
            
            // while loop that will run unless the user ever inputs quit, or if they took test (they win)
            //in while loop, accesses the difficulty, if(text.equals("easy"), hard, etc.)
            //accesses those questions with Math.randomInt, and then will print a question
        }




    }
}



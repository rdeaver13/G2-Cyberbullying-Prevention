package GP2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class preventionTechnniquesRewrite {
    static boolean repeat = false;

    // method used for displaying menu
    public static void displayMenu(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

    // method for prompting user interraction
    public static void userMenuChoice() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        boolean cont = false;
        
        do {
            userChoice = scanner.next();

            switch(userChoice) {
                case "1":
                    displayMenu("GP2/techniquesForParents.txt");
                    cont = true;
                    break;
                case "2":
                    displayMenu("GP2/techniquesForTeens.txt");
                    cont = true;
                    break;
                case "3":
                    displayMenu("GP2/techniquesForKids.txt");
                    cont = true;
                    break;
                default:
                    System.out.println("Please enter 1, 2 or 3...");
            }
        } while(!cont);
    }

    // method to prompt user to continue
    public static void continueChoice() {
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        boolean cont = false;
        
        do {
            userChoice = scanner.next();

            switch(userChoice) {
                case "1":
                    cont = true;
                    repeat = true;
                    break;
                case "2":
                    cont = true;
                    repeat = false;
                    break;
                default:
                    System.out.println("Please enter 1 or 2...");
            }
        } while(!cont);
    }

    public static void runPreventionTechniques() throws IOException {
        do {
        displayMenu("GP2/preventionTechniques.txt");

        userMenuChoice();

        displayMenu("GP2/exitMenu.txt");

        continueChoice();

        }
        while (!repeat);
    }

    public static void main(String[] args) throws IOException {
        runPreventionTechniques();

    }
}

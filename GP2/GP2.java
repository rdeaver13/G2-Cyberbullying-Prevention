package GP2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GP2 {
    
    public GP2() {
        // Declate Vars
        int user_input;
        Scanner input = new Scanner(System.in);

        File myFile = new File("GP2/intro.txt");
        

        // Print Welcome Introduction
        try {

            Scanner textFile = new Scanner(myFile);
            // Print introduction
            while(textFile.hasNextLine()){
                System.out.println(textFile.nextLine());
            }
            // Close text file
            textFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        // Looking for user input
        user_input = input.nextInt();

        // Main Loop
        while (user_input != 0){
            
            switch(user_input) {

                default:
                // change text file to error message
                    myFile = new File("GP2/fail.txt");
                    break;

                case 1: 
                // change text file to risk factors
                    myFile = new File("GP2/riskFactors.txt");
                    break;

                case 2:
                // change text file to prevention techniques
                    //myFile = new File("GP2/preventionTechniques.txt");
                    //break;
                // Edited by Ray
                // call runPreventionTechniques method created in "GP2/preventionTechniques.java"
                    preventionTechniques preventionTechniques = new preventionTechniques();
                    preventionTechniques.runPreventionTechniques();
                    break;
                // End of edit
            }
            
            try {
                Scanner textFile = new Scanner(myFile);
                // Print info
                while(textFile.hasNextLine()){
                    System.out.println(textFile.nextLine());
                }
                // Close text file
                textFile.close();
    
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            }

            // Looking for user input
            user_input = input.nextInt();

        }

        // Close user input
        input.close();
    }

}

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
                // change text file to default message
                    myFile = new File("GP2/intro.txt");
                    break;

                case 1: 
                // start the file risk factors
                    riskFactors risks = new riskFactors();
                    break;

                case 2:
                // Edited by Ray
                // call runPreventionTechniques method created in "GP2/preventionTechniques.java"
                    preventionTechniques preventionTechniques = new preventionTechniques();
                    preventionTechniques.runPreventionTechniques();
                    break;
                // End of edit

                case 3:
                    // quiz class here
                    Quiz quiz = new Quiz();
                    quiz.runQuiz();
                    break;

                case 4:
                    myFile = new File("GP2/resources.txt");
            }
            
            // Display the intro text once again
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

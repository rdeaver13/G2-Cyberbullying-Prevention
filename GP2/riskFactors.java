package GP2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class riskFactors {
    public riskFactors(){
        File myFile = new File("GP2/riskFactors.txt");
        
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

    }
}
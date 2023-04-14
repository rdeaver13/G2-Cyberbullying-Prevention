<<<<<<< HEAD
=======

>>>>>>> a4d02b6d1114a3048ed47ace537c57294c567731
package GP2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class riskFactors {

    // Constructor
    public riskFactors() {

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

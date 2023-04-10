/*
 * Prevention techniques: A list of techniques 
 * that can be used to prevent or minimize the risks associated with each topic. 
 * This section should provide users with practical advice on how to stay safe online.
 * Author: Ray Deaver
 */
package GP2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class preventionTechniques {
    // create a method to be called by main() class
    public void runPreventionTechniques() {
        boolean verifyRepeatMenu = false;  // initializes a boolean variable used for repeating the menu
        File mainMenuFile = new File("GP2/preventionTechniques.txt");  // initializes a file variable for main menu
        File subMenuFile = new File("");  // initializes a file variable for sub menu
        File exitMenuFile = new File("GP2/exitMenu.txt");  // initializes a file variable for exit menu
        
        do {  // using a do-while loop, perform user interactions
            // display message declaring this section as "Prevention Techniques"
            try(Scanner fileScanner = new Scanner(mainMenuFile)) {

                do {  // read the file line-by-line and print the input
                        System.out.println(fileScanner.nextLine());
                } while(fileScanner.hasNextLine());  // verifies that there is another line to be printed
            
                // use .close() to close the scanner
                fileScanner.close();
        
            // catch statement that displays error message if one occurs during file access
            } catch(FileNotFoundException e) {
                System.out.println("An error has occured..." + e.getMessage());
            }

            // next we gather user input response to the menu displayed
            try(Scanner userScanner = new Scanner(System.in)) {
                String userChoice;  // declares a new variable for user choice
                int userChoiceConvert;  // declares an int variable for use in switch case 
                boolean verifyUserChoice = false;  // initializes a boolean variable for repeating the menu

                // use a do-while loop to request user input, this way we can ensure the user enters a valid input
                do {
                    userChoice = userScanner.next();
                    if(userScanner.hasNextInt()) {
                        userChoiceConvert = Integer.parseInt(userChoice);  // convert the String user input to an integer for the switch function
                    }
                    else {
                        userChoiceConvert = 0;
                    }
                    // use switch function to access the appropriate file
                    switch(userChoiceConvert) {
                        case 1:
                            // switch file with "GP2/techniquesForParents.txt" when user enters "1"
                            subMenuFile = new File("GP2/techniquesForParents.txt");
                            System.out.println("Case 1 test print");
                            verifyUserChoice = true;
                            break;
                        case 2:
                            // switch file with "GP2/techniquesForTeens.txt" when user enters "2"
                            subMenuFile = new File("GP2/techniquesForTeens.txt");
                            System.out.println("Case 2 test print");
                            verifyUserChoice = true;
                            break;
                        case 3:
                            // switch file with "GP2/techniquesForKids.txt" when user enters "3"
                            subMenuFile = new File("GP2/techniquesForKids.txt");
                            System.out.println("Case 3 test print");
                            verifyUserChoice = true;
                            break;
                        default:
                            // display an error message when user enters anything else
                            System.out.println("Invalid input entered..." +
                                               "\nPlease enter 1, 2 or 3");
                            break;
                    }
                } while(!verifyUserChoice);

                // use .close() to close the scanner
                userScanner.close();

            // catch statement that displays error message if one occurs during file access
            } catch(Exception e) {
                System.out.println("An error has occurred..." + e.getMessage());
            }

            // next display the new page 
            try(Scanner fileScanner = new Scanner(subMenuFile)) {

                do {  // read the file line-by-line and print the input
                    System.out.println(fileScanner.nextLine());
                } while(fileScanner.hasNextLine());  // verifies that there is another line to be printed
                
                // use .close() to close the scanner
                fileScanner.close();

                System.out.println("Press Enter key to continue...");

                // prompts user to press Enter key to continue
                try(Scanner userScanner = new Scanner(System.in)) {
                    userScanner.next();
                    
                    // use .close() to close the scanner
                    userScanner.close();

                } catch(Exception e) {
                    System.out.println("An error has occurred..." + e.getMessage());
                }

            // catch statement that displays error message if one occurs during file access
            } catch(Exception e) {
                System.out.println("An error has occurred..." + e.getMessage());
            }

            // next ask user if they wish to repeat this menu, or if the wish to exit this menu
            try(Scanner fileScanner = new Scanner(exitMenuFile)) {

                do {  // read the fine line-by-line and print the input
                    System.out.println(fileScanner.nextLine());
                } while(fileScanner.hasNextLine());

                // use .close() to close the scanner
                fileScanner.close();

            // catch statement that displays error message if one occurs during file access
            } catch(Exception e) {
                System.out.println("An error has occurred..." + e.getMessage());
            }

            // next gather user input
            try(Scanner userScanner = new Scanner(System.in)) {
                int userChoice = 0;  // initializes a new variable for user choice
                boolean verifyUserChoice = false;  // initializes a boolean variable for repeating the menu

                // use a do-while loop to request user input, this way we can ensure the user enters a valid input
                do {
                    userChoice = userScanner.nextInt();

                    // use switch function to access the appropriate file
                    switch(userChoice) {
                        case 1:
                            // returns user to beginning of menu
                            verifyUserChoice = true;
                            break;
                        case 2:
                            // exits the application
                            verifyUserChoice = true;
                            verifyRepeatMenu = true;
                            break;
                    }
                } while(!verifyUserChoice);

            } catch(Exception e) {
                System.out.println("An error has occurred..." + e.getMessage());
            }
        } while(!verifyRepeatMenu);
    }
}

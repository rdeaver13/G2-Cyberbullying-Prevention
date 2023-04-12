Package GP2;

import java.util.Scanner;

public class CyberBullyingPrevention {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            // Display menu
            System.out.println("Prevent Harassment!\n");
            System.out.println("Enter the corresponding number for each section:");
            System.out.println("1 - Risk factors");
            System.out.println("2 - Prevention Techniques");
            System.out.println("3 - Quiz");
            System.out.println("4 - Resources");
            System.out.println("0 - Quit\n");
            
            // Get user's choice
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    displayRiskFactors();
                    break;
                case 2:
                    displayPreventionTechniques();
                    break;
                case 3:
                    runQuiz();
                    break;
                case 4:
                    displayResources();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            
            System.out.println();
            
        } while (choice != 0);
        
        scanner.close();
        
    }
    
    private static void displayResources() {
    }

    private static void displayRiskFactors() {
        System.out.println("Risk Factors:");
        System.out.println("- Anonymity");
        System.out.println("- Power differential");
        System.out.println("- Lack of face-to-face communication");
        System.out.println("- Low self-esteem");
        System.out.println("- Lack of empathy");
        System.out.println("- Inadequate parental monitoring");
    }
    
    private static void displayPreventionTechniques() {
        System.out.println("Prevention Techniques:");
        System.out.println("- Educate children about cyberbullying");
        System.out.println("- Encourage open communication");
        System.out.println("- Teach children to be responsible digital citizens");
        System.out.println("- Monitor children's online activity");
        System.out.println("- Establish clear rules and consequences");
        System.out.println("- Work with schools to address cyberbullying");
    }
    
    private static void runQuiz() {
        try (Scanner scanner = new Scanner(System.in)) {
        }
        System.out.println("Quiz:");
        System.out.println("What is the definition of cyberbullying?");
        System.out.println("a) A type of dance");
        System.out.println("b) The act of bullying someone online");
        System.out.println("c) A type of video game");
        
        System.out.print("Your answer: ");
    }
}
  
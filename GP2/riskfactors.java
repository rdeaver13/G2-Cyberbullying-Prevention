import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CyberbullyingDetector {

      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the text to be analyzed:");
      String text = sc.nextLine();

      // Define a list of keywords that may indicate cyberbullying
      String[] keywords = {"ugly", "stupid", "hate", "loser", "worthless", "fat", "dumb", "pathetic"};

      // Check if the input text contains any of the keywords
      boolean containsKeyword = false;
      for (String keyword : keywords) {
         if (text.toLowerCase().contains(keyword)) {
            containsKeyword = true;
            break;
         }
      }

      // Check for excessive use of exclamation points or all-caps
      boolean excessiveExclamation = text.contains("!!!") || text.contains("!!!!");
      boolean allCaps = text.replaceAll("\\s+", "").matches("[A-Z]+");

      // Determine the overall risk level based on the detected factors
      if (containsKeyword || excessiveExclamation || allCaps) {
         System.out.println("WARNING: This text may contain cyberbullying.");
      } else {
         System.out.println("No cyberbullying detected.");
      }

   }

}

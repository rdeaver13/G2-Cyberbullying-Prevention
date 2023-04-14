package GP2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        GP2 gp2 = new GP2();

        // start preventionTechniques

        try {
            preventionTechniques preventionTechniques = new preventionTechniques();
            preventionTechniques.runPreventionTechniques();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // end preventionTechniques

    }
}

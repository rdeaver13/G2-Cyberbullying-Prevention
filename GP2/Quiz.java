import java.util.Scanner;
import java.awt.*;
import java.io.*;


public class Quiz {
    public static void main(String[] args){
        //Declaring the Scanner class
        Scanner input = new Scanner(System.in);
        
        //Opening the files
        try{
            //Creating the reader for questions.txt and answers.txt
            FileReader Qreader = new FileReader("Questions.txt");
            BufferedReader QbufferedReader = new BufferedReader(Qreader);

            FileReader Areader = new FileReader("Answers.txt");
            BufferedReader AbufferedReader = new BufferedReader(Areader);

            String line;

            //Reading and printing all the questions
            While((line = QbufferedReader.readLine()) != null){
                System.out.println(line);
            }
            Qreader.close();
            Areader.close();

        } catch(IOException e){
            e.printStackTrace();
        }

        

        
    }
}

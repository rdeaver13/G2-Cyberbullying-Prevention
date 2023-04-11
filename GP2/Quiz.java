package QuizProject;

import java.io.*;
import java.util.*;

public class Quiz {

    //Reading all the questions from the questions file
    public static ArrayList<String> loadQuestions(String filePath) throws IOException {
        ArrayList<String> questions = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            questions.add(line.trim());
        }
        reader.close();
        return questions;
    }
    

    //Adding all the answers in the file
    public static ArrayList<String> loadAnswers(String filePath) throws IOException {
        ArrayList<String> answers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            line.substring(2);
            answers.add(line);
        }
        reader.close();
        return answers;
    }


    //Adding everything into the quiz, and asking the user for their answer
    public static void playQuiz(ArrayList<String> questions, ArrayList<String> answers) {
        //Score counter
        int correctAnswers = 0;
        int totalQuestions = questions.size();

        //Adding the questions and answers to a hashmap
        HashMap<String,String> QnA = new HashMap<String,String>();
        for(int k = 0; k < totalQuestions; k++){
            QnA.put(questions.get(k),answers.get(k));
        }
        //Adding the shuffled questions arraylist
        ArrayList<String> shuffledQuestions = new ArrayList<>(QnA.keySet());


        //Printing the questions and the corresponding answers
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < totalQuestions; i++) {
            //Randomizing the questions and the corresponding answers
            int randIdx = new Random().nextInt(totalQuestions);
            String randomQuestion = shuffledQuestions.get(randIdx);
            String randomAnswers = QnA.get(randomQuestion);

            System.out.println("Question " + (i + 1) + ":");
            System.out.println(randomQuestion);
            String[] answerChoices = randomAnswers.split(",");
            String correctChoice = answerChoices[0].trim();

            //Printing out the questions and the answer choices
            for (int j = 1; j < answerChoices.length; j++) {
                System.out.println((char) (64 + j) + ". " + answerChoices[j]);
            }

            System.out.print("Your answer (A / B / C / D): ");
            String userAnswer = new String("null");
            userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(correctChoice)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        scanner.close();
        //Showing the user their score
        System.out.println("Total questions: " + totalQuestions);
        System.out.println("Correct answers: " + correctAnswers);
        System.out.println("Your score: " + correctAnswers + "/" + totalQuestions);
    }


    public static void main(String[] args) {
        //Adding the file paths
        String questionsFilePath = "QuizProject/Questions.txt";
        String answersFilePath = "QuizProject/Answers.txt";

        try {
            //Executing everything
            ArrayList<String> questions = loadQuestions(questionsFilePath);
            ArrayList<String> answers = loadAnswers(answersFilePath);
            playQuiz(questions, answers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Question{
    private String text; //For storing question
    private String[] answers; //For storing answers
    private String rightAnswer; //For storing right answer

    private Question(String text, String... answers){
        this.text = text;
        this.answers = answers;
        this.rightAnswer = answers[0];

        for (int i = 0; i< answers.length; i++){
            int randomIndex = (int)(Math.random()* answers.length);
            String temp = answers[i];
            answers[i] = answers[randomIndex];
            answers[randomIndex] = temp;
        }
    }
}

public class AdvancedQuiz {

    //For storing all the questions in one ArrayList
    private static ArrayList<Question> questions = new ArrayList<Question>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        createQuiz();
    }

    private static void createQuiz(){
        System.out.println("Enter quiz name: ");
        String quizName = scanner.nextLine();
        File newQuiz = new File(quizName + ".txt");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newQuiz,true))){
            System.out.println("How many answers do you want to have?");
            String numOfAnswers = scanner.nextLine();
            scanner.nextLine();
            bufferedWriter.write(numOfAnswers);
            bufferedWriter.newLine();
            bufferedWriter.write(quizName);
            bufferedWriter.newLine();
            System.out.println("Please start entering questions. To stop entering questions, press 0");
            String input = "";
            while (!input.equals("0")){
                System.out.println("Enter question:");
                input = scanner.nextLine();
                bufferedWriter.write(input);
                bufferedWriter.newLine();
                System.out.println("Enter answers one by one:");
                for (int i = 0; i<Integer.parseInt(numOfAnswers); i++){
                    input = scanner.nextLine();
                    bufferedWriter.write(input);
                    bufferedWriter.newLine();
                }
            }
        }catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
    }
}

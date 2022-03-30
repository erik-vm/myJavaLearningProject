import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] myQuiz = new String[4][4];
        myQuiz[0][0] = "Whats the color of banana?";
        myQuiz[0][1] = "Snow";
        myQuiz[0][2] = "Yellow";
        myQuiz[0][3] = "House";
        myQuiz[1][0] = "How many corners do triangle have?";
        myQuiz[1][1] = "3 corners";
        myQuiz[1][2] = "17 corners";
        myQuiz[1][3] = "Whats triangle?";
        myQuiz[2][0] = "Last christmas I gave you my....";
        myQuiz[2][1] = "SDD";
        myQuiz[2][2] = "heart";
        myQuiz[2][3] = "sweat roll";
        myQuiz[3][0] = "The coffee is made of?";
        myQuiz[3][1] = "Out of too energetic toddlers";
        myQuiz[3][2] = "Out of WW2 nuclear weapons";
        myQuiz[3][3] = "Out of coffee beans";

        int[] correctAnswers = {2, 1, 2, 3};
        int score= 0;

        for (int i = 0; i < myQuiz.length; i++){
            System.out.println(myQuiz[i][0]);
            System.out.println("--------------------------");
            for (int j = 1; j < myQuiz[i].length; j++){
                System.out.println("\t" + (j) + ")"+myQuiz[i][j]);
            }
            int answer = scanner.nextInt();
            if (answer == correctAnswers[i]){
                System.out.println("Correct!");
                score++;
            }else {
                System.out.println("Wrong!" + "\n" + "--------------------------");
            }
        }
        System.out.println("Score: " + score + " correct answers.");
    }
}

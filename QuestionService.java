package Quiz;
import java.util.Scanner;

public class QuestionService {
    

    Questions [] questions = new Questions[5];
    String selection[] = new String[5];
    

    public QuestionService() {
        questions[0] = new Questions(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Questions(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Questions(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Questions(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Questions(5, "size of boolean", "1", "2", "4", "8", "1");

    }

    public void playQuiz()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the quiz!");
        System.out.println("Please do type the answer when prompted!");
        int i=0;
        for(Questions q : questions)
        {
            System.out.println(q.getId() +  ") " + q.getQuestion());
            System.out.println(q.getOpt1() + " | " + q.getOpt2() + " | " + q.getOpt3() + " | " + q.getOpt4());
            selection[i] = sc.nextLine();
            i++;
        }
    }

    public void checkScore()
    {
        int score=0;
        for(int i=0;i<selection.length;i++) 
        {
            if (questions[i].getAnswer().equals(selection[i])){
                score++;
            }
        }
        switch (score) {
            case 5:
                System.out.println("Damn you are on a streak!!");
                break;
            case 4:
                System.out.println("Okay! You got 4 right");
                break;
            case 3:
                System.out.println("Not bad!");
                break;
            case 2:
                System.out.println("Need work to put in you got 2 right !?");
                break;
            case 1:
                System.out.println("This was a fluke");
                break;
            default:
                System.out.println("C'mon dude! Really ?");
                break;
        }
    }
}

package ro.jademy.milionaire;
import java.util.ArrayList;
public class Millionaire {
    public static void main(String[] args) {
        String question;
        ArrayList<String> questionList=new ArrayList<>();
        ArrayList<String> answerList=new ArrayList<>();

        //Game game1=new Game(1);

        Question question1=new Question(1,"What is the highest number used in a Sudoku puzzle?",answerList);
        Answer a1=new Answer("1true",true);
        Answer a2=new Answer("2false",false);
        Answer a3=new Answer("3false",false);
        Answer a4=new Answer("4false",false);

            //int questionIndex = 0;
//            switch (questionIndex) {
//                case 1:
//                   return question="What is the highest number used in a Sudoku puzzle?;
//                   break;
//                case 2:
//                   return question="What is the term for a positive electrode?";
//                   break;
//                case 3:
//                   return question="Which swimming stroke is named after an insect?";
//                   break;
//            }



    }
}
/*
Player-firstname,lastname

game-question
    -level
    -start()
    -50/50

questions-question
         -dificulty
         -list<answer>
 */


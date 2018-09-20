package ro.jademy.milionaire;

import java.util.ArrayList;

public class Millionaire {

    public static void main(String[] args) {
        String question;
        ArrayList<Question> questionList = new ArrayList<>();
        //ArrayList<String> answerList=new ArrayList<>();


        questionList.add(0, new Question(1,
                "1 DIF1 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false", false),
                new Answer("3false", false),
                new Answer("4false", false)));

        questionList.add(1, new Question(1,
                "2 DIF1 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false", false),
                new Answer("3false", false),
                new Answer("4false", false)));

        questionList.add(2, new Question(1,
                "3 DIF1 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false", false),
                new Answer("3false", false),
                new Answer("4false", false)));

        questionList.add(3, new Question(2,
                "4 DIF2 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false", false),
                new Answer("3false", false),
                new Answer("4false", false)));

        questionList.add(4, new Question(2,
                "5 DIF2 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false", false),
                new Answer("3false", false),
                new Answer("4false", false)));

        questionList.add(5, new Question(2,
                "6 DIF2 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false", false),
                new Answer("3false", false),
                new Answer("4false", false)));

        questionList.add(6, new Question(3,
                "7 DIF3 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false", false),
                new Answer("3false", false),
                new Answer("4false", false)));

        questionList.add(7, new Question(3,
                "8 DIF3 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false", false),
                new Answer("3false", false),
                new Answer("4false", false)));

        questionList.add(8, new Question(3,
                "9 DIF3 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false", false),
                new Answer("3false", false),
                new Answer("4false", false)));

        //strating game trial
        Game g1 = new Game(1, questionList);
        g1.askQuestion();
       // g1.answerQuestion();


//        Answer a1=new Answer("1true",true);
//        Answer a2=new Answer("2false",false);
//        Answer a3=new Answer("3false",false);
//        Answer a4=new Answer("4false",false);

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


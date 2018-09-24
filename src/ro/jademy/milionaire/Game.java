package ro.jademy.milionaire;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static final int MAX_LEVEL = 3;
    private int currentLevel = 1;
    private ArrayList<Question> questionList = new ArrayList<>();

    public Game(ArrayList<Question> questionList) {
        this.questionList.addAll(questionList);
    }

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public void startGame() {
        // initializam intrebarile si jocul
        System.out.println("am " +questionList.size()+" intrebari am in question list");
        askQuestion();
    }

    public void askQuestion() {
        //show first question on screen
        //int maxLevel = Question.MAX_LEVEL;
        int index=currentLevel-1;
        for ( ; index < Game.MAX_LEVEL; index++) {
            System.out.println("dificultatea curenta este " + currentLevel);
            System.out.println("index is "+index);
            System.out.println("showing question");
            System.out.println(questionList.get(index).getQuestion());
            showAnswers();
            answerQuestion(index);
            //currentLevel++;
            System.out.println("niveul curent este " + currentLevel + " in answerQuestion metoda");

        }
    }

    public boolean answerQuestion(int questionIndex) {
        System.out.println("type the number coresponding to the correct answer");
        Scanner scanner = new Scanner(System.in);

        int answerIndex = scanner.nextInt();
        System.out.println("you selected the " + answerIndex + " question");
        if (questionList.get(questionIndex).getAnswerList().get(answerIndex).getIsCorrect() == true) {
            System.out.println("correct ANSWER");
            return true;
        }
            System.out.println("u lose!!!");

        return false;
    }

    public void showAnswers() {
        for (int i = 0; i < questionList.get(currentLevel - 1).getAnswerList().size(); i++) {
            System.out.println(questionList.get(currentLevel - 1).getAnswerList().get(i).getAnswer());
        }
    }

//        for (int index = 0; index < maxLevel; index++) {
//            int randomNumber = random.nextInt(3);
//            System.out.println("NUMARUL -randomizat- ESTE " + (randomNumber + 1));
//
//            System.out.println();
//
//
//            System.out.println("se afiseaza intrebarea" + index + 1 + " " + 1);
//            //Showing question HERE--------
//            for (int index1 = 0; index1 < questionList.size() - 1; index1++) {
//
//
//
//                    System.out.println(questionList.get(randomNumber).getQuestion());
//
//                    for (int i = 0; i < questionList.get(randomNumber).getAnswerList().size(); i++) {
//
//                        System.out.println(questionList.get(randomNumber).getAnswerList().get(i).getAnswer());
//
//                    }
//                    if (answerQuestion()) {
//                        break;
//                    } else {
//                        System.out.println("try again");
//                    }
//
//                }


//            System.out.println("Select an answer");
//            //display answers trial 1.0
//            System.out.println("trial 1.0");
//        for(Answer answer:getQuestionList().get(1).getAnswerList()){
//            System.out.println(getQuestionList().get(1).getAnswerList().get(answer).getAnswer());
//        }
    //display answers trial 1.1
    //System.out.println("trial 1.1");


//    public boolean answerQuestion() {
//        //get usser input and check if corect
////        System.out.println("type the number coresponding to the correct answer");
////        Scanner scanner = new Scanner(System.in);
////        int answerIndex = scanner.nextInt();
////        System.out.println("you selected the " + answerIndex + " question");
////        //interogation of answer trial 1.0
////        if (getQuestionList().get(1).getAnswerList().get(answerIndex - 1).getIsCorrect()) {
////            System.out.println("u get WIN!!!!!! NEXT QUESTION");
////            System.out.println("nivelul anterior este " + currentLevel);
////            currentLevel++;
////            System.out.println("nivelul curent este " + currentLevel);
////            return true;
////        } else {
////            System.out.println("u lose" + "trial 1.0");
////            return false;
////        }
//        return false;
//    }

    public void fiftyFifty() {
        //show same question with only two answers
    }

}

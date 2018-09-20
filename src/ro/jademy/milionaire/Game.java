package ro.jademy.milionaire;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int currentLevel = 1;
    private ArrayList<Question> questionList = new ArrayList<>();

    public Game(int currentLevel, ArrayList<Question> questionList) {
        this.currentLevel = currentLevel;
        this.questionList.addAll(questionList);
    }

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public void startGame() {
        // initializam intrebarile si jocul

    }

    public void askQuestion() {
        //show first question on screen
        int maxLevel = Question.MAX_LEVEL;
        int index = 0;
        for (; index < maxLevel; index++) {

            Random random = new Random();
            int randomNumber = random.nextInt(3);
            System.out.println("NUMARUL -randomizat- ESTE " + (randomNumber + 1));
            System.out.println("dificultatea curenta este " + currentLevel);
            System.out.println();


            System.out.println("se afiseaza intrebarea" + index+1 + " " + 1);
            //Showing question HERE--------
            for (int index1 = 0; index1 < questionList.size() - 1; index1++) {

                if (questionList.get(index1).getDifficutyLevel() == currentLevel) {

                    System.out.println(questionList.get(randomNumber).getQuestion());

                    for (int i = 0; i < questionList.get(randomNumber).getAnswerList().size(); i++) {

                        System.out.println(questionList.get(randomNumber).getAnswerList().get(i).getAnswer());

                    }
                    if (answerQuestion()) {
                        break;
                    } else {
                        System.out.println("try again");
                    }

                }

            }


//            System.out.println("Select an answer");
//            //display answers trial 1.0
//            System.out.println("trial 1.0");
//        for(Answer answer:getQuestionList().get(1).getAnswerList()){
//            System.out.println(getQuestionList().get(1).getAnswerList().get(answer).getAnswer());
//        }
            //display answers trial 1.1
            System.out.println("trial 1.1");

        }
    }

    public boolean answerQuestion() {
        //get usser input and check if corect
        System.out.println("type the number coresponding to the correct answer");
        Scanner scanner = new Scanner(System.in);
        int answerIndex = scanner.nextInt();
        System.out.println("you selected the " + answerIndex + " question");
        //interogation of answer trial 1.0
        if (getQuestionList().get(1).getAnswerList().get(answerIndex - 1).getIsCorrect()) {
            System.out.println("u get WIN!!!!!! NEXT QUESTION");
            System.out.println("nivelul anterior este " + currentLevel);
            currentLevel++;
            System.out.println("nivelul curent este " + currentLevel);
            return true;
        } else {
            System.out.println("u lose" + "trial 1.0");
            return false;
        }


    }

    public void fiftyFifty() {
        //show same question with only two answers
    }

}

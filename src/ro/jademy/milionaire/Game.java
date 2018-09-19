package ro.jademy.milionaire;

import java.util.ArrayList;

public class Game {
    private int currentLevel = 1;
    private ArrayList<Question> questionList;

    public Game(int currentLevel,ArrayList<Question> questionList) {
        this.currentLevel=currentLevel;
        this.questionList.addAll(questionList);
    }

    public void startGame() {
        // initializam intrebarile si jocul

    }

    public void askQuestion() {
        //show question on screen
    }

    public void answerQuestion() {
        //get usser input and check if corect
    }

    public void fiftyFifty() {
        //show same question with only two answers
    }

}

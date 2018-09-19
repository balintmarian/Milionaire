package ro.jademy.milionaire;

import java.util.ArrayList;

public class Question {
    private static final int MAX_LEVEL = 15;

    private String question;
    private int difficutyLevel;
    private ArrayList<Answer> answerList = new ArrayList<>();

    public Question(int difficutyLevel, String question, ArrayList<Answer> answerList) {
        this.answerList = answerList;
        this.difficutyLevel = difficutyLevel;
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getDifficutyLevel() {
        return difficutyLevel;
    }

    public ArrayList<Answer> getAnswerList() {
        return answerList;
    }



    public Answer getCorrectAnswer() {
        for (Answer answer : answerList) {
            if (answer.getIsCorrect()) {
                return answer;
            }
        }
        return null;
    }

}

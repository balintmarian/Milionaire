package ro.jademy.milionaire;

import java.util.ArrayList;
import java.util.Arrays;

public class Question {
    public static final int MAX_LEVEL = 3;

    private String question;
    private int difficutyLevel = 1;
    private ArrayList<Answer> answerList = new ArrayList<>();

    //constructor trial 1.0, didnt work for now
    public Question(int difficutyLevel, String question, ArrayList<Answer> answerList) {
        this.answerList = answerList;
        this.difficutyLevel = difficutyLevel;
        this.question = question;
    }

    //constructor trial 1.1
    public Question(int difficutyLevel, String question, Answer... answers) {
        this.answerList.addAll(Arrays.asList(answers));
        this.difficutyLevel = difficutyLevel;
        this.question = question;
    }

    //Fifty-Fifty question
    public Question(int difficutyLevel, String question, Answer answer1, Answer answer2) {
        this.answerList.add(answer1);
        this.answerList.add(answer2);
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

    public void setAnswerList(Answer answer) {
        this.answerList.add(answer);
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

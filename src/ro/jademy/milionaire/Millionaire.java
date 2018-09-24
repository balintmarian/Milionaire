package ro.jademy.milionaire;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Millionaire {

    private static ArrayList<Question> questionList = new ArrayList<>();

    public static void main(String[] args) {

        initQuestions();

        ArrayList<Question> gameQuestions = getGameQuestions();

        // strating game with subset of random questions
        Game g1 = new Game(gameQuestions);
        g1.startGame();
        // g1.answerQuestion();

    }

    private static void initQuestions() {
        questionList.add(new Question(1,
                "1 DIF1 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false"),
                new Answer("3false"),
                new Answer("4false")));

        questionList.add(new Question(1,
                "2 DIF1 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false"),
                new Answer("3false"),
                new Answer("4false")));

        questionList.add(new Question(1,
                "3 DIF1 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false"),
                new Answer("3false"),
                new Answer("4false")));

        questionList.add(new Question(2,
                "4 DIF2 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false"),
                new Answer("3false"),
                new Answer("4false")));

        questionList.add(4, new Question(2,
                "5 DIF2 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false"),
                new Answer("3false"),
                new Answer("4false")));

        questionList.add(new Question(2,
                "6 DIF2 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false"),
                new Answer("3false"),
                new Answer("4false")));

        questionList.add(new Question(3,
                "7 DIF3 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false"),
                new Answer("3false"),
                new Answer("4false")));

        questionList.add(new Question(3,
                "8 DIF3 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false"),
                new Answer("3false"),
                new Answer("4false")));

        questionList.add(new Question(3,
                "9 DIF3 What is the highest number used in a Sudoku puzzle?",
                new Answer("1true", true),
                new Answer("2false"),
                new Answer("3false"),
                new Answer("4false")));
    }

    private static ArrayList<Question> getGameQuestions() {
        // create sub set of questions
        Random random = new Random();
        ArrayList<Question> gameQuestions = new ArrayList<>();


        for (int i = 1; i <= Game.MAX_LEVEL; i++) {
            ArrayList<Question> levelQuestions = getQuestionsForLevel(i);
            int randomIndex=random.nextInt(levelQuestions.size());
            gameQuestions.add(levelQuestions.get(randomIndex));

        }
        return gameQuestions;
    }

    private static ArrayList<Question> getQuestionsForLevel(int level) {
        ArrayList<Question> levelQuestion = new ArrayList<>();
        for (Question q : questionList) {
            if (q.getDifficutyLevel() == level) {
                levelQuestion.add(q);
            }

        }
        return levelQuestion;
    }
}

package assignment1.Question;

import java.util.List;

public interface MultiAnswerQuestionInterface {

    /**
     * sets the correct answer choices to the multi-answer question
     * @param correctAnswersList list of all correct answers
     */
    public void setAnswer(List<String> correctAnswersList);

    /**
     * adds a single new answer to the list of correct answers to this question
     * @param correctAnswer String of correct answer
     */
    public void addAnswer(String correctAnswer);

    /**
     * int array of indices that will be used to choose which of the choice options from the question will be considered a correct answer
     * @param correctAnswersIndex int array of selected indices
     */
    public void addAnswer(int[] correctAnswersIndex);

    
}

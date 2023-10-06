package assignment1.Question;

import java.util.ArrayList;

public interface QuestionInterface {

    /**
     * set what the current question prompt is
     * @param prompt String that is the prompt
     */
    public void setQuestion(String prompt);

    /**
     * retrieve the String value for the current question
     * @return String that is the current question prompt
     */
    public String getQuestion();

    /**
     * set what the current question's correct answer is
     * @param prompt String that is the answer
     */
    public void setAnswer(String answer);

    /**
     * retrieve the String value for the answer
     * @return String that is the answer to the current question
     */
    public String getAnswer();

    /**
     * set the answer options for the current question
     */
    public void setChoices();

    /**
     * retrieve the ArrayList holding the options for answers to the current question
     * @return an ArrayList<String> of options
     */
    public ArrayList<String> getChoices();

    /**
     * retrieve the number of correct answers for this question
     * @return int that is the number of correct answers
     */
    public int getNumAnswers();
    
}

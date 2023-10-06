package assignment1.Student;

import assignment1.Question.Question;

public interface StudentInterface {
    
    /**
     * student answers the question
     * @param question question to-be answered
     */
    public void answerQuestion(Question question);

    /**
     * handles multi-answer questions
     * student answers a multi-answer question
     * @param question question to-be answered
     * @return String of student's answer
     */
    public String answerMultiAnswerQuestion(Question question);

    /**
     * retrieve the Student ID
     * @return  String of SID
     */
    public String getSID();
}

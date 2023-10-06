package assignment1.VotingService;

import assignment1.Question.Question;
import assignment1.Student.Student;

public interface VotingServiceInterface {

    /**
     * starts the voting simulation with a question and the number of students who will be answering
     * @param question question to-be answered
     * @param numberOfStudents num of students to answer questions
     */
    public void startVotingSimulation(Question question, int numberOfStudents);

    /**
     * checks if the student answered the question correctly
     * @param student student who answered
     * @param answer answer of the student
     * @param question question they are answering
     * @return String describing the student's correctness and their answer
     */
    public String checkAnswer(Student student, String answer, Question question);

    /**
     * retrieved the information about the voting simulation
     *      - student: student's correctness | student's answer
     *      - question choice : how many times choice was selected
     * 
     * @param student student who answered
     * @param answer answer of the student
     * @param question question they are answering
     */
    public void gatherResults(Student student, String answer, Question question);

    /**
     * prints each student's SID next to their answer and correctness
     */
    public void printStudentSpecificResults();

    /**
     * prints each option for the question and also how many times it was chosen by students
     * also prints the correct answer
     * 
     * @param answer the correct answer for the question
     */
    public void printAnswerSpecificResults(String answer);
    
}

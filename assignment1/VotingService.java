package assignment1;

import java.util.HashMap;
import java.util.Map;

import assignment1.Question.Question;
import assignment1.Student.Student;

public class VotingService implements VotingServiceInterface{

    private Map<String, String> studentResults;
    private Map<String, Integer> answerResults;
    private int numStudentsCorrect;

    public VotingService(){
        this.studentResults = new HashMap<>();
        this.answerResults = new HashMap<>();
        this.numStudentsCorrect = 0;
    }


    public void startVotingSimulation(Question question, int numStudents){
        System.out.println("\n\n" + question.getQuestion() + "\n");

        for(int i=0; i<numStudents; i++){   //for each student...
            Student andrew = new Student();
            String ans = andrew.answerQuestion(question);   //answer the question

            gatherResults(andrew, ans, question);  //record the studet's answer
        }

        printAnswerSpecificResults(question.getAnswer());
        System.out.print("\n");
        printStudentSpecificResults();
        System.out.println("\n" + numStudentsCorrect + " out of " + numStudents + " students answered this question correctly!\n");
    }   //end startVotingSimulation


    public String checkAnswer(Student stu, String ans, Question question){
        String answerCorrectness = ans; 
        String[] correctAnswer = question.getAnswer().split(", ");
        String[] studentAnswer = ans.split(", ");

        if(studentAnswer.length != correctAnswer.length){   //if the correct answer and the student answer dont have the same length, it is wrong
            answerCorrectness ="  |  Wrong :(  |  " + answerCorrectness;
            return answerCorrectness;
        } else{
            for(int i=0; i<correctAnswer.length; i++){  //student answer is also wrong if it doesn't match the correct answer

                if(!ans.contains(correctAnswer[i])){
                    answerCorrectness="  |  Wrong :(  |  " + answerCorrectness;
                    return answerCorrectness;
                }
            }
        }

        answerCorrectness = "  |--Correct!--|  " + answerCorrectness;   //otherwise it is correct
        this.numStudentsCorrect++;
        return answerCorrectness;
    }   //end checkAnswer


    public void gatherResults(Student stu, String ans, Question question){

        //For answerResults
        if(!this.answerResults.containsKey(ans)){
            this.answerResults.put(ans, 1);
        }else{
            this.answerResults.put(ans, this.answerResults.get(ans)+1);
        }

        //For studentResults
        this.studentResults.put(stu.getSID(), checkAnswer(stu, ans, question));  //put student's SID as key with value of String their answer + "Correct"/"Wrong"
    }   //end gatherResults


    public void printStudentSpecificResults(){
        System.out.println("Student results:");
        this.studentResults.forEach((k, v) -> System.out.println(k + (v)));
    }   //end pringStudentSpecificResults

    public void printAnswerSpecificResults(String ans){
        System.out.println("Correct answer: " + ans + "\n");
        this.answerResults.forEach((k, v) -> System.out.println(k+ " : " +(v)));
        
    }   //end printAnswerSpecificResults


    
}

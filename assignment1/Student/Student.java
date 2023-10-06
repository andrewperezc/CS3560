package assignment1.Student;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import assignment1.Question.*;

public class Student {
    
    private UUID SID;

    public Student(){
        this.SID = UUID.randomUUID();
    }

    public String answerQuestion(Question question){
        String studentAnswer = "";
        Random rand = new Random();

        if(question.numStudentChoices > 1){
            studentAnswer = answerMultiAnswerQuestion(question);
        }else{
            int answerIndex = rand.nextInt(question.getChoices().size());   //generate random number between 0 and the last index of the array of possible studentAnswer options
            studentAnswer = (String) question.getChoices().toArray()[answerIndex];  //add their randomly selected choice as their studentAnswer
        }

        return studentAnswer;
    }   //end answerQuestion

    public String answerMultiAnswerQuestion(Question question){
        String studentAnswer = "";
        Random rand = new Random();

        Object[] optionsObjectArray = question.getChoices().toArray();
        String[] optionsArray = Arrays.copyOf(optionsObjectArray, optionsObjectArray.length, String[].class);

        int numSelections = rand.nextInt((optionsArray.length-1)+1)+1;  //generates the number of checkboxes this student will select when answering the question

        for(int i=0; i<numSelections; i++){  //for each checkbox that this student is going to choose...
            int answerIndex = rand.nextInt(optionsArray.length);   //the random index at which one of the student's answers is located

            if(studentAnswer.isBlank()){
                studentAnswer = optionsArray[answerIndex];
            }else{

                if(studentAnswer.contains(optionsArray[answerIndex])){
                    continue;
                }else{
                    studentAnswer+= ", " + optionsArray[answerIndex];  //from the list of options, add a possible studentAnswer to their list of submitted answers
                }
            }
        }
        return studentAnswer;
    }   //end answerMultiAnswerQuestion

    public String getSID(){
        return this.SID.toString();
    }   //end getSID
}

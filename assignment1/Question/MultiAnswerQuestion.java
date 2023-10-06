package assignment1.Question;

import java.util.Arrays;
import java.util.List;

public class MultiAnswerQuestion extends Question implements MultiAnswerQuestionInterface {



    public MultiAnswerQuestion(){
        super();
    }

    public MultiAnswerQuestion(String questionPrompt, List<String> questionChoices, List<String> correctAnswersList){
        super(questionPrompt, questionChoices, correctAnswersList.toString().replace("[","").replace("]", ""));
        this.numStudentChoices = questionChoices.size();
    }

    
    public void setAnswer(List<String> correctAnswersList){
        String correctAnswer = correctAnswersList.toString();
        correctAnswer = correctAnswer.replace("[", "").replace("]", "");
        super.setAnswer(correctAnswer);
        this.numStudentChoices = correctAnswer.length();
    }

    public void addAnswer(String correctAnswer){

        String answers = this.getAnswer();
        if(getAnswer().isBlank()){
            answers = correctAnswer;
        }else{
            answers+= ", " + correctAnswer;
        }

        this.setAnswer(answers);
        this.numStudentChoices++;
    }

    public void addAnswer(int[] correctAnswersIndex){
        List<String> questionChoices = this.getChoices();
        
        Object[] questionChoicesObjectArray = questionChoices.toArray();
        String[] questionChoicesArray = Arrays.copyOf(questionChoicesObjectArray, questionChoicesObjectArray.length, String[].class);


        for (int i= 0; i < questionChoicesArray.length; i++) {
            
            String answers = this.getAnswer();

            if(getAnswer().isBlank()){
                answers = questionChoicesArray[correctAnswersIndex[i]];
            }else{
                answers+= ", " + questionChoicesArray[correctAnswersIndex[i]];
            }
            this.setAnswer(answers);
        }
        this.numStudentChoices++;
    }

}

package assignment1.Question;

import java.util.List;

public class Question {
    
    private String question;
    private List<String> choices;
    private String answer;
    public int numStudentChoices;
    
    public Question(){
        this.question = "";
        this.choices = null;
        this.answer = "";
        this.numStudentChoices = 0;
    }

    public Question(String questionPrompt, List<String> questionChoices, String correctAnswer){
        this.question = questionPrompt;
        this.choices = questionChoices;
        this.answer = correctAnswer;
        this.numStudentChoices = 1;
    }

    
    public void setQuestion(String prompt){
        this.question = prompt;
    }

 
    public String getQuestion(){
        return this.question;
    }

    
    public void setChoices(List<String> questionChoices){
        this.choices = questionChoices;
    }

   
    public void setChoices(String questionChoice){
        this.getChoices().add(questionChoice);
    }

  
    public List<String> getChoices(){
        return this.choices;
    }

    public void setAnswer(String correctAnswer){
        this.answer = correctAnswer;
    }

    public String getAnswer(){
        return this.answer;
    }

    public int getNumAnswers(){
        return this.numStudentChoices;
    }

}

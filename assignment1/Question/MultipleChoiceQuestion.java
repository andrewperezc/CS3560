package assignment1.Question;

import java.util.List;


public class MultipleChoiceQuestion extends SingleAnswerQuestion{
    
    public MultipleChoiceQuestion(){
        super();
    }

    public MultipleChoiceQuestion(String questionPrompt, List<String> questionChoices, String correctAnswer){
        super(questionPrompt, questionChoices, correctAnswer);
    }

}

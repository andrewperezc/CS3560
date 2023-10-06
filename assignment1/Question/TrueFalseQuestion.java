package assignment1.Question;

import java.util.ArrayList;
import java.util.List;

public class TrueFalseQuestion extends SingleAnswerQuestion{

    private List<String> choices = new ArrayList<>(List.of("True", "False"));

    public TrueFalseQuestion(){
        super();
        super.setChoices(choices);
    }

    public TrueFalseQuestion(String questionPrompt, String correctAnswer){
        super.setQuestion(questionPrompt); 
        super.setAnswer(correctAnswer);
        super.setChoices(choices);

    }

}

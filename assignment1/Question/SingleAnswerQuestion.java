package assignment1.Question;

import java.util.List;

public class SingleAnswerQuestion extends Question {
    

    public SingleAnswerQuestion(){
        super();
    }

    public SingleAnswerQuestion(String questionPrompt, List<String> questionChoices, String correctAnswer){
        super(questionPrompt, questionChoices, correctAnswer);
    }

}

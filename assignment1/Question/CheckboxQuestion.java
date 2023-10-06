package assignment1.Question;

import java.util.List;

public class CheckboxQuestion extends MultiAnswerQuestion{

    public CheckboxQuestion(){
        super();
    }

    public CheckboxQuestion(String questionPrompt, List<String> questionOptions, List<String> correctAnswers){
        super(questionPrompt, questionOptions, correctAnswers);
    }
}

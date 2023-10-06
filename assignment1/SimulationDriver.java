package assignment1;

import java.util.ArrayList;
import java.util.List;
import assignment1.Question.*;
import assignment1.VotingService.*;


public class SimulationDriver extends VotingService{
    public static void main(String[] args){

        //Configure the question and list of possible answers
        String questionPrompt = "True or False... Air purifiers are a scam.";

        String questionPrompt2 = "What ingredients are needed for a bowl of cereal?";
        List<String> possibleAnswers2 = new ArrayList<>(List.of("soy sauce", "cheese", "cereal", "milk"));
        List<String> answerList2 = new ArrayList<>(List.of("cereal", "milk"));

        String questionPrompt3 = "What grade do you think I should get on this assignment?";
        List<String> possibleAnswers3 = new ArrayList<>(List.of("A", "B", "C", "D", "F", "G"));



        /**
         * Question Types:
         * 
         * TrueFalseQuestion(String questionPrompt, String correctAnswer)
         *      - two choices, answers can only be true or false
         * 
         * CheckboxQuestion(String questionPrompt, List<String> possibleAnswers, List<String> correctAnswers)
         *      - multiple choices, answer consists of 1 or more choices
         * 
         * MultipleChoiceQuestion(String correctPrompt, List<String> possibleAnswers, String correctAnswer)
         *      - multiple choices, answer is one of the choices
         */

        Question tfq = new TrueFalseQuestion(questionPrompt, "True");
        Question cbq = new CheckboxQuestion(questionPrompt2, possibleAnswers2, answerList2);
        Question mcq = new MultipleChoiceQuestion(questionPrompt3, possibleAnswers3, "A");


        VotingService sim1 = new VotingService();
        sim1.startVotingSimulation(tfq, 10);
        VotingService sim2 = new VotingService();
        sim2.startVotingSimulation(cbq, 12);
        VotingService sim3 = new VotingService();
        sim3.startVotingSimulation(mcq, 20);
    }
}

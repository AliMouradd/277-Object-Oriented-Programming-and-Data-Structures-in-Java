package zybooks_labs;

public class Quiz4ChoiceQuestion extends QuizQuestion {
    String choice1;
    String choice2;
    String choice3;
    String choice4;
    public Quiz4ChoiceQuestion(String question,String choice1, String choice2, String choice3, String choice4, String answer){
        super(question, answer);
        this.choice1= choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
    }

    public String toString(){
        return super.toString()+"\nA) "+ choice1 + "\nB) "+ choice2 + "\nC) "+ choice3 + "\nD) "+ choice4;
    }
}

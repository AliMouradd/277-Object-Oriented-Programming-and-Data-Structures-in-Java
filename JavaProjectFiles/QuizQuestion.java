package zybooks_labs;

public class QuizQuestion {
    String question;
    String answer;
    public QuizQuestion(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String toString() {
        return question;
    }
    public boolean isAnswerCorrect(String response) {
        return answer.toUpperCase().equals(response.toUpperCase());
    }
}

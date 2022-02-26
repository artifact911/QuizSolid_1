package service;

import model.Quiz;

import java.io.IOException;

public class Exam {

    private final Dialog dialog;

    private final Shuffler shuffler;

    public Exam(Dialog dialog, Shuffler shuffler) {
        this.dialog = dialog;
        this.shuffler = shuffler;
    }

    public void start(int questions) throws IOException {
        if (questions <= 0) return;
        int points = 0;
        for (Quiz quiz : shuffler.getRandomList(questions)) {
            dialog.print(quiz.getQuestion() + ": ");
            String answer = dialog.input().trim();
            if(answer.equalsIgnoreCase(quiz.getAnswer())){
                points++;
            } else {
                dialog.print("правильный ответ: " + quiz.getAnswer() + "\n");
            }
        }
        int percent = 100 * points / questions;
        dialog.print(String.format("Ваш результат: %d%%%n", percent));
    }
}

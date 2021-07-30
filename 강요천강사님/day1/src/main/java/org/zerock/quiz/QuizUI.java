package org.zerock.quiz;

import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class QuizUI {

    private Scanner scanner;
    private QuizService quizService;

    public void resolve() {
        System.out.println("Quiz~ Quiz~");
        String choice = scanner.nextLine();

        if(choice.equalsIgnoreCase("n")){
            return;
        }

        QuizDTO quizDTO = quizService.makeQuiz();

        System.out.println(quizDTO.getNum1() + "X" + quizDTO.getNum2());

        System.out.print("정답>> ");
        int userAnswer = Integer.parseInt(scanner.nextLine());

        boolean result = quizService.grading(quizDTO, userAnswer);

        if(result) {
            System.out.println("딩동댕~");
        }else {
            System.out.println("땡~");
        }

        this.resolve();
    }

}

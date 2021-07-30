package org.zerock.quiz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        QuizService service = new QuizService();
        Scanner scanner = new Scanner(System.in);

        QuizUI quizUI = new QuizUI(scanner, service);

        quizUI.resolve();


    }

}
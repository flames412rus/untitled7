package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Question questions[] = new Question[3];
        questions[0] = new Question("В каком году было крещение Руси?", 988, "Последняя цифра 8,трехзначное число");
        questions[1] = new Question("Когда началась WW2 ?", 1939,"1 сентября 1*** - нападение на Польшу");
        questions[2] = new Question("Когда появилась первая в мире ядерная бомба у СССР?", 1949, "Через четыре года после первых двух боевых применений в мире");

        int correct = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].getTitle());
            Scanner scan = new Scanner(System.in);
            int otvet = scan.nextInt();
            if (otvet==questions[i].getAnswer()) {
                System.out.println("верно:" + questions[i].getAnswer());
                correct++;
            } else {

                System.out.println("Неверно "+ questions[i].getPods());
                i--;
            }

        }
        System.out.println("Ваш результат :" + correct);
    }
}

package com.mariiapasichna;

import java.util.Arrays;

public class Task2 {

    /*2*) Дан кирпич со сторонами a,b,c и отверстие со сторонами x,y. Определить пройдет ли кирпич в отверстие.
Например кирпич со сторонами 2,3,2 не пройдет в отверстие 1x50.*/

    public static void main(String[] args) {
        int brick[] = {5, 1, 12};
        int x = 23;
        int y = 2;
        int minPort = Math.min(x, y);
        int maxPort = Math.max(x, y);
        Arrays.sort(brick);
        if (brick[0] < minPort && brick[1] < maxPort) {
            System.out.println("The brick will go through the port");
        } else {
            System.out.println("The brick will not go through the port");
        }
    }
}
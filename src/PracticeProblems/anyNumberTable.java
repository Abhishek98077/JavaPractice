package PracticeProblems;

import java.util.Scanner;

public class anyNumberTable {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        System.out.println("Enter the multiples");
        int numberTimes = sc.nextInt();

        for (int i = 0; i <= numberTimes; i++) {
            System.out.println(number + "*" + i + "="+ number * i );
        }

    }
}

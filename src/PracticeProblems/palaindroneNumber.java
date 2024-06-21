package PracticeProblems;

import java.util.Scanner;

import static java.lang.Integer.reverse;

public class palaindroneNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int temp  , sum=0 , remainder;
        temp = number;
        while (number < 0) {
            remainder = number % 10;
            number = number / 10;
            sum = (sum * 10) + remainder;
            number = number %10;
        }
        if(sum == number){
            System.out.println("The number is palaindrone");
        }else{
            System.out.println("The number is not palaindrone");
        }

    }
}

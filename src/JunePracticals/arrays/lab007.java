package JunePracticals.arrays;

import java.util.Scanner;

public class lab007 {
    public static void main(String[] args){
        //Leap year program

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if (year %4 ==0 && year%100!=0 || year%400==0){
            System.out.println(year + "is a leap Year");
        }else{
            System.out.println(year + "is not a leap Year");
        }

    }
}

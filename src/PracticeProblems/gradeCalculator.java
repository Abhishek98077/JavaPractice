package PracticeProblems;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args){

        Integer obtainedMarks;
        Integer totalMarks = 300;
        float percentage;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics Marks");
        int Physics = sc.nextInt();
        System.out.println("Enter your Maths Marks");
        int maths = sc.nextInt();
        System.out.println("Enter your Chemistry Marks");
        int chemistry = sc.nextInt();

        obtainedMarks =Physics+chemistry+maths;
        percentage =(obtainedMarks*100)/totalMarks;
        System.out.println("Your Percentage is" + percentage);

        if (percentage < 33){
            System.out.println("You are fail");
        } else if (percentage <60) {
            System.out.println("You are pass Your Grade id B");
        } else if (percentage > 90 ) {
            System.out.println("You are pass Your Grade id A");

        }


    }
}

package PracticeProblems;

import java.util.Scanner;

public class vowelOrConconent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("this is a vowel");
        }else{
            System.out.println("this is a consonent");
        }
    }
}

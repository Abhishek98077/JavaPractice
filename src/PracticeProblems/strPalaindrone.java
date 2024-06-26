package PracticeProblems;

import java.util.Scanner;

public class strPalaindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        boolean result =isPalaindrone(str);
        if (result){
            System.out.println("The string is palaindrone");

        }else{
            System.out.println("The string is not palaindrone");
        }
    }

    private static boolean isPalaindrone(String str) {
        String OS = str;

        StringBuilder newstr = new StringBuilder(str);
        String RevStr = newstr.reverse().toString();
        return OS.equalsIgnoreCase(RevStr);

    }
}

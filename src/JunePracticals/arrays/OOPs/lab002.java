package JunePracticals.arrays.OOPs;

import java.util.Scanner;

public class lab002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int myArray[] = new int[n];
        System.out.println("enter the element");
        for (int i = 0; i < n; i++) {
             myArray[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(myArray[i]);
        }
    }
}

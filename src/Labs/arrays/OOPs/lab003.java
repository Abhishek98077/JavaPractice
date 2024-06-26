package Labs.arrays.OOPs;

import java.util.Scanner;

public class lab003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int MyArray[] = new int[size];
        System.out.println("Enter the  array elements4");

        for(int i =0; i<size; i++){
            MyArray[i] = sc.nextInt();

        }
        for(int i=0; i<size; i++){
            System.out.println(MyArray[i]);
        }
    }
}

package PracticeProblems;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        int i =0;
        int flag=0;
        int m =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        m=n/2;

        if( n ==0 || n ==1 ){
            System.out.println("Not a prime number");

        }else{
            for (i=2;i<=m;i++){
                if (n%i==0){

                    System.out.println("not a prime number");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("Prime number");
        }



    }
}

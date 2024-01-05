package src;

import java.util.Scanner;

public class SWAP_temp {
    public static void main(String[] args) {


        //Program to swap two numbers using temp variable
        int fst, sec, temp;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number");
        fst=sc.nextInt();
        System.out.println("Enter Second number");
        sec=sc.nextInt();
        sc.close();

        //swap
        temp=0;
        temp=fst;
        fst=sec;
        sec=temp;

        System.out.println("-----Swapped two numbers----");
        System.out.println("First number "+fst);
        System.out.println("Second number "+sec);








    }
}

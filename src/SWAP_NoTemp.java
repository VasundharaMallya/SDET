package src;

import java.util.Scanner;

public class SWAP_NoTemp {

    public static void main(String[] args) {

            //Program to swap two numbers without using temp variable
            int fst, sec;
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter first number");
            fst=sc.nextInt();
            System.out.println("Enter Second number");
            sec=sc.nextInt();
            sc.close();


           fst=fst+sec;
           sec=fst-sec;
           fst=fst-sec;

            System.out.println("-----Swapped two numbers----");
            System.out.println("First number "+fst);
            System.out.println("Second number "+sec);




        }


}

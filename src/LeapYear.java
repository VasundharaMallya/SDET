package src;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Validate Leap year
        System.out.println("Enter Year");
        Scanner sc=new Scanner(System.in);
        int Year=sc.nextInt();
        sc.close();
        //Code to validate leap year
        System.out.println("-----Answer----");
        if((Year % 4 == 0 & (((Year % 100) != 0) || ((Year % 400 == 0)))))
        {
            System.out.println(Year +"\t"+"is Leap Year");
        }
        else
        {
            System.out.println(Year+"\t"+"is not leap year");
        }



    }
}

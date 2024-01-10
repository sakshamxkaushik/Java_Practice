package Basics;

import java.util.Scanner;
public class Program1 {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Input 1 : ");
        int num1 = io.nextInt();
        System.out.println("Input 2 : ");
        int num2 = io.nextInt();
        System.out.println("Input 3 : ");
        int num3 = io.nextInt();
        System.out.println("Input 4 : ");  
        int num4 = io.nextInt();
        System.out.println("Input 5 : ");
        int num5 = io.nextInt();

        System.out.println("Average of five numbers is : " + (num1+num2+num3+num4+num5)/5);
    }
    
}

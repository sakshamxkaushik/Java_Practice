package Basics;
/*  Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
 */

 import java.util.Scanner;
public class Divide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = input.nextInt();
        System.out.print("Input second number: ");
        int b = input.nextInt();
        int div = a / b;   // divide of a and b
        System.out.println("Divide of a and b is: " + div);
        
    }
    
}

package Basics;
/*Write a Java program to compute a specified formula.

Specified Expression :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) */

public class Double {
    public static void main(String[] args) {
        // Calculate the result of an alternating series and store it in 'result'
        double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        
        // Print the calculated result
        System.out.println(result);
    }
    
}

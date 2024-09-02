package com.csc;
import java.util.Scanner;
// Your code goes here!


public class OOPS {
    double lowerbound = Integer.MIN_VALUE;
    double upperbound = Integer.MAX_VALUE;
    String errorMessage;
    String inputMessage;
    public double Bound2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose 1 to input a lower bound or another integer for no lower bound: ");
        int input = in.nextInt(); 
        switch (input) {
            case 1: System.out.println("Input your lower bound: ");
            lowerbound = in.nextDouble();
            break;
            default:
            break;
        }
        System.out.println("Please choose 1 to input a upper bound or another integer to have no upper bound: ");
        int input2 = in.nextInt();
        switch (input2) {
            case 1: System.out.println("Input your upper bound: ");
            upperbound = in.nextDouble();
            break;
            default:
            break;
            }
        in.nextLine();
        System.out.println("Please input the prompt to ask the user to input a number within your previously set bounds: ");
        inputMessage = in.nextLine();
        System.out.println("Please input an error message to be shown if a number is inputed outside of the set bounds: ");
        errorMessage = in.nextLine();

        System.out.println(inputMessage);
        double number = in.nextDouble();
        while (number < lowerbound || number > upperbound) {
            System.out.println(errorMessage);
            number = in.nextDouble();
        }
        System.out.println("The number is within the set bounds");
        in.close();
        return number;
    }
        


public static void main(String[] args) {
    OOPS oops = new OOPS(); 
    oops.Bound2();
} 

}
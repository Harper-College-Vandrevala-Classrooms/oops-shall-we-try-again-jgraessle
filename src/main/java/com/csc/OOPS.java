package com.csc;
import java.util.Scanner;
// Your code goes here!


public class OOPS {
    int lowerbound = Integer.MIN_VALUE;
    int upperbound = Integer.MAX_VALUE;
    String errorMessage;
    String inputMessage;
    public int Bound2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose 1 to input a lower bound, another integer for no lower bound, or input 'default' for a default bound of 100: (enter exit to exit the menu) ");
        String input = in.nextLine(); 
        switch (input) {
            case "1": System.out.print("Input your lower bound: ");
            lowerbound = in.nextInt();
            break;
            case "default":
            lowerbound = 100;
            break;
            case "exit": System.out.println("The program has exited, restart the program to resume");
            System.exit(0);
            default:
            break;
        }
        in.nextLine();
        System.out.println("Please choose 1 to input an upper bound, another integer to have no upper bound, or input 'default' for a default bound of 100: (enter exit to exit the menu) ");
        String input2 = in.nextLine();
        switch (input2) {
            case "1": System.out.print("Input your upper bound: ");
            upperbound = in.nextInt();
            in.nextInt();
            break;
            case "default": 
            upperbound = 100;
            break;
            case "exit": System.out.println("The program has exited, restart the program to resume");
            System.exit(0);
            break;
            default:
            break;
            }
        in.nextLine();
        System.out.println("Please input the prompt to ask the user to input a number within your previously set bounds: (enter exit to exit the menu) ");
        inputMessage = in.nextLine();
        switch (inputMessage) {
            case "exit": System.out.println("The program has exited, restart the program to resume");
            System.exit(0);
            break;
            default:
            break;
        }
        System.out.println("Please input an error message to be shown if a number is inputed outside of the set bounds: (enter exit to exit the menu) ");
        errorMessage = in.nextLine();
        switch (errorMessage) {
            case "exit": System.out.println("The program has exited, restart the program to resume");
            System.exit(0);
            break;
            default:
            break;
        }
        System.out.println(inputMessage); 
        int number = in.nextInt();
        while (number < lowerbound || number > upperbound) {
            System.out.println(errorMessage);
            number = in.nextInt();
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
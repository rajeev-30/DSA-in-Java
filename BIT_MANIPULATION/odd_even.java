package BIT_MANIPULATION;

import java.util.Scanner;

public class odd_even {
    public static void oddOrEven(int num){
        int bitMask = 1;
        if((num & bitMask) == 0){
            System.err.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();

        oddOrEven(0);
        
    }
}

package ARRAYS;

import java.util.Scanner;

public class Search_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // WAP to find out whether a given number is present in an array or not;
        int num[] = { 1, 2, 3, 4, 5 };
        int isInarray = 0;
        System.out.println("Enter number to search");
        int s = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (s == num[i]) {
                isInarray = num[i];
                break;
            }
        }

        if (isInarray != 0) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not present in the array!");
        }
    }

}

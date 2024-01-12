package ARRAYS;

import java.util.Scanner;

public class Kth_Smmalest_Element {
    public static void main(String[] args) {
        int arr[] = { 12, 2, 8, 1, 5, 4, 63, 07 };
        int n = arr.length;
        int min = arr[0];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kth index no: ");
        int k = sc.nextInt();

        for (int i = 0; i <= k; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(("The Kth smallest element is: " + min));
    }

}

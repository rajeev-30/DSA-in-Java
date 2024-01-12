package ARRAYS;

public class Reverse_arr {
    public static void main(String[] args) {

        // WAP to reverse a array; ---> This Program is Written by me :)
        int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3 };
        int l = arr.length;
        int f = 0; // f = First element of array
        int n = (l / 2); // Condition of For loop
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[f];
            arr[f] = arr[l - 1];
            arr[l - 1] = temp;
            l--;
            f++;
        }
        System.out.println("Reverse array is: ");
        for (int element : arr) {
            System.out.println(element);
        }
    }

}

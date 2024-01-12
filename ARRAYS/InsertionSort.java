package ARRAYS;

public class InsertionSort {
    public static void main(String[] args) {
        // Insertion sort
        int arr[] = { 1, 9, 3, 8, 4, 6 };

        // time complexity = 0(n^2);
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            // placement
            arr[j + 1] = current;
        }

        for (int el : arr) {
            System.out.println(el);
        }
    }

}

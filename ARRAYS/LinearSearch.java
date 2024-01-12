package ARRAYS;

public class LinearSearch {
    static void getMinMax(int arr[], int n) {

        int min, max;

        if (n == 1) {
            min = arr[0];
            max = arr[0];
        } else {
            min = arr[0];
            max = arr[1];

            if (min > max) {
                min = arr[1];
                max = arr[0];
            }

            for (int i = 2; i < n; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }

                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }
        System.out.println("min: " + min + ", max: " + max);
    }

    public static void main(String[] args) {
        // WAp to find Min and Max element in an array using Linear Search;
        int arr[] = { 12, 2, 0, 99 };
        int arrLength = arr.length;
        getMinMax(arr, arrLength);
    }

}

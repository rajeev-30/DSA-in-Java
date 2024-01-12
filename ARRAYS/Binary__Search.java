package ARRAYS;

public class Binary__Search {
    //Binary Search
    public static int BinarySearch(int arr[], int element) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == element) {
                return mid;
            } else if (element > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Element found at index no: " + BinarySearch(arr, 8));
    }
}
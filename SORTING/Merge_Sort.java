package SORTING;

public class Merge_Sort {
    public static void printArr(int[] arr) {
        for (int el : arr) {
            System.out.println(el);
        }
    }

    public static void merge(int arr[], int mid, int low, int high) {
        int i = low, j = mid + 1, k = low;
        int[] newArr = new int[arr.length];

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                newArr[k] = arr[i];
                k++;
                i++;
            } else {
                newArr[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            newArr[k] = arr[i];
            k++;
            i++;
        }
        while (j <= high) {
            newArr[k] = arr[j];
            k++;
            j++;
        }

        for (i = low; i <= high; i++) {
            arr[i] = newArr[i];
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, mid, low, high);
        }
    }

    public static void main(String[] args) {
        // time complexity in best,avg,worst case = O(n Logn)
        int[] arr = { 9, 23, 8, 17, 6, 45, 4, };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

}

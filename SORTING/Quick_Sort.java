package SORTING;

class QuickSort {
    public void printArr(int[] arr) {
        for (int el : arr) {
            System.out.println(el);
        }
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                swap(arr, i, j);
            }
        }
        i++;

        swap(arr, high, i);

        return i;
    }

    public void quickSort(int[] arr, int low, int high) {
        int pivot;
        if (low < high) {
            pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }

    }
}

public class Quick_Sort {

    public static void main(String[] args) {
        // time complexity in best,avg case = O(n logn)opo';
        // time complexity in worst case = O(n^2) ---> when array is sorted
        int arr[] = { 19, 11, 33, 54, 21, 6, 65, 33, 5, 2, 8 };
        QuickSort q = new QuickSort();
        q.quickSort(arr, 0, arr.length - 1);

        q.printArr(arr);
    }

}

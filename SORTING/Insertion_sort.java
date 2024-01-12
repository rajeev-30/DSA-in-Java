package SORTING;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, };
        // time coplexity in best case = 0(n)
        // time coplexity in avg,wrost case = 0(n^2)

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int el : arr) {
            System.out.println(el);
        }
    }

}

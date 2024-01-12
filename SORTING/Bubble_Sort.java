package SORTING;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, };
        // time coplexity in best case = 0(n)
        // time coplexity in avg,worst case = 0(n^2)

        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("pass: " + i);
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        for (int el : arr) {
            System.out.println(el);
        }
    }

}

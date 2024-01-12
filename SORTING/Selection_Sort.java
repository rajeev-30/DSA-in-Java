package SORTING;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, };
        // time coplexity in all three cases = 0(n^2)

        for (int i = 0; i < arr.length - 1; i++) {
            int samll = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[samll] > arr[j]) {
                    samll = j;
                }
            }
            int temp = arr[samll];
            arr[samll] = arr[i];
            arr[i] = temp;

        }
        for (int el : arr) {
            System.out.println(el);
        }

    }

}

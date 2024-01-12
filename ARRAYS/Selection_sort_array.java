package ARRAYS;

public class Selection_sort_array {
    public static void main(String[] args) {

        int arr[] = { 5, 7, 6, 3, 5, 1 };
        // time coplexity = 0(n^2)
        // Selection sort

        for (int i = 0; i < arr.length; i++) {
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

package ARRAYS;

public class SortingArr {
    public static void main(String[] args) {
        int arr[] = { 5, 45, 1, 0 };
        int l = arr.length;
        int temp;
        for (int i = 0; i < l; i++) {

            for (int j = i + 1; j < l; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("After sorting: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

}

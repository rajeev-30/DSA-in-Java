package ARRAYS;

public class NegativeNum_OneSide {
    public static void main(String[] args) {
        // WAP to Move all the negative elements to one side of the array

        int arr[] = { 1, 2, -3, 4, 5, -6 };
        int n = arr.length;
        int Negative = 0;
        int temp;

        for (int i = 0; i < n; i++) {

            if (arr[i] < 0) {
                temp = arr[Negative];
                arr[Negative] = arr[i];
                arr[i] = temp;

                Negative++;
            }
        }
        for (int element : arr) {
            System.out.println(element);
        }
    }

}

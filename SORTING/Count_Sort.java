package SORTING;

public class Count_Sort {
    public static void printArr(int[] arr) {
        for (int el : arr) {
            System.out.println(el);
        }
    }

    public static void countSort(int arr[]) {
        int max = arr[0], i, j;
        // find maximum element in arr
        for (i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int count[] = new int[max + 1];

        // initialize the array element with 0
        for (i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        // increment the corresponding index int he count array
        for (i = 0; i < arr.length; i++) {
            int el = arr[i];
            count[el]++;
        }

        i = 0;// counter for count array
        j = 0;// count for main array

        while (i < count.length) {
            if (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        // time complexity in all three cases = O(n)
        // it uses extra space
        int arr[] = { 67, 43, 56, 23, 45, 76, 8, 8, 1, 67 };

        countSort(arr);
        printArr(arr);

    }

}

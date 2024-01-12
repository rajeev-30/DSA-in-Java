package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add element
        list.add(1);
        list.add(2);
        list.add(4);

        System.out.println("Array list: " + list); // all elements are printed

        // get element
        int element = list.get(0); // particular element is printed
        System.out.println("Particulae element: " + element);

        // add element in between
        list.add(2, 3); // 2 = index no.; 3 = new element (which is added at index no. 2);
        System.out.println("After adding a new element 3 at index 2: " + list);

        // set element
        list.set(0, 5); // 0 = index no.; 5 = new element (which is replaced by 1);
        System.out.println("After replacing a 1 by 5: " + list);

        // delete element
        list.remove(0); // 0 = index no. (which is removed);
        System.out.println("After deleting a 0 index: " + list);

        // size
        int size = list.size();
        System.out.println("size: " + size);

        // loops
        System.out.print("using for loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // sorting
        Collections.sort(list);
        System.out.println("\nSorted list: " + list);
    }

}

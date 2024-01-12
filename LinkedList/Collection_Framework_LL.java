package LinkedList;

import java.util.*;

public class Collection_Framework_LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(10);// add at the first
        list.addFirst(20);// add at the first

        list.addLast(30);// add at the Last
        list.add(40);// this is also add at the last
        list.add(50);// this is also add at the last
        list.add(60);// this is also add at the last
        list.add(70);// this is also add at the last

        list.removeFirst(); // remove First Node
        list.removeLast(); // remoive Last Node
        list.remove(3); // remove index 3

        System.out.println(list); // display list without using loop

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}

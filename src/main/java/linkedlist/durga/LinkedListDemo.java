package linkedlist.durga;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add("durga");
        l.add(30);
        l.add(null);
        l.add("durga");
        l.set(0, "Software");               // .set() replaces the element at current index
        l.add(0, "venky");
        l.removeLast();
        l.addFirst("CCC");
        System.out.println(l);              // [CCC, venky, Software, 30, null]

    }
}

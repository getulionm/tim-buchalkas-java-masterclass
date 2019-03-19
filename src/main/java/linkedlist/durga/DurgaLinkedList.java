package linkedlist.durga;

import java.util.Arrays;
import java.util.LinkedList;

public class DurgaLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> li = new LinkedList<Integer>(Arrays.asList(0,1,2,3,4,5));

//        li.add(1, 9);

//        System.out.println(li.get(1));

        System.out.println(li.remove(5));

        printLinkedList(li);
    }

    private static void printLinkedList(LinkedList<Integer> li){
        for(Integer i : li)
            System.out.printf("%d", i);
        System.out.println();
    }



}

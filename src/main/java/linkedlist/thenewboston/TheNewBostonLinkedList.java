package linkedlist.thenewboston;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TheNewBostonLinkedList {

    public static void main(String[] args) {

        String[] numbers = {"0", "1", "2", "3", "4"};

        List<String> list1 = new LinkedList<String>();

        for (String x : numbers){
            list1.add(x);
        }

        String[] letters = {"A", "B", "C", "D"};

        List<String> list2 = new LinkedList<String>();
        for (String y : letters)
            list2.add(y);

        list1.addAll(list2);

        list2 = null;

        printMe(list1);
        removeStuff(list1, 2, 5);
        printMe(list1);
        reverseMe(list1);

    }


    private static void printMe(List<String> l) {
        for (String b : l)
            System.out.printf("%s", b);
        System.out.println();
    }

    private static void removeStuff(List<String> l, int from, int to) {
        l.subList(from, to).clear();
    }

    private static void reverseMe(List<String> l) {
        ListIterator<String> iterated = l.listIterator(l.size());

        while(iterated.hasPrevious()){
            System.out.printf("%s", iterated.previous());
        }
    }
}

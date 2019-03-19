package collections.telusko.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 16, 800));
        laps.add(new Laptop("Apple", 8, 1200));
        laps.add(new Laptop("Acer", 12, 700));

        // Comparator<T> functional interface defines rules for comparison when sorting a collection
        // Comparator<T> is included as a second parameter on Collections.sort()
        //
        // Comparator can be used if class to be sorted in a collection does not 'implements Comparable'
        // or to use a different logic for comparison

        Comparator<Laptop> comparatorPrice = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop lap1, Laptop lap2) {
                if (lap1.getPrice() > lap2.getPrice())
                    return 1;
                else if (lap1.getPrice() < lap2.getPrice())
                    return -1;
                else
                    return 0;
            }
        };


        Collections.sort(laps, comparatorPrice);

        for (Laptop l : laps){
            System.out.println(l);
        }

    }

}

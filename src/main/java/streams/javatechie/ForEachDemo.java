package streams.javatechie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

    // filter ----> conditional check

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Joe");
        list.add("Jane");
        list.add("Bill");
        list.add("Will");
        list.add("Ana");

        list.stream().filter((t)->t.startsWith("B")).forEach(t -> System.out.println(t));

        list.stream().forEach((t-> System.out.println(t)));

        System.out.println("--------------------------------------------------");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.forEach((key, value) -> System.out.println(key + ": " + value));
//        map.entrySet().stream().forEach(obj-> System.out.println(obj));
        map.entrySet().stream().filter(k -> k.getKey()% 2==0).forEach(obj-> System.out.println(obj));

        System.out.println("--------------------------------------------------");

        Consumer<String> consumer = (t) -> System.out.println(t);
        for (String s1 : list){
            consumer.accept(s1);
        }
    }
}

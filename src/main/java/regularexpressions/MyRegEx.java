package regularexpressions;

import java.util.Arrays;
import java.util.List;

public class MyRegEx {

    public static void main(String[] args) {

        String raw = "4.37";
//        List<String> currencies = Arrays.asList("€", "$", "£");
        List<String> currencies = Arrays.asList("€");

        for (String currency : currencies){
            int month = new Integer((currency + raw).replaceAll("[£€$,.]", ""));

            System.out.println(raw + "*12 = " + month * 12);
            System.out.println(raw + "*24 = " + month * 24);
        }
    }
}

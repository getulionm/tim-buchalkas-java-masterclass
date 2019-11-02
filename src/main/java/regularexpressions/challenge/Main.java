package regularexpressions.challenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String challenge1 = "I want a bike.";
        String regex1 = "I want a bike.";
        System.out.println(challenge1.matches(regex1));
        System.out.println("----------------------------------------------------");

        String challenge2 = "I want a ball.";
        String regex2 = "I want a \\w+.";
//        String regex2 = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regex2));
        System.out.println(challenge2.matches(regex2));
        System.out.println("----------------------------------------------------");

        String regex3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regex3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());
        System.out.println("----------------------------------------------------");

        String challenge4 = "Replace all blanks with underscores";
        String regex4 = "\\s";
        System.out.println(challenge4.replaceAll(regex4, "_"));
        System.out.println("----------------------------------------------------");

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));
        System.out.println("----------------------------------------------------");

        String regex5 = "^a{3}bc{8}d{3}ef{3}g$";
        System.out.println(challenge5.replaceAll(regex5, "REPLACED"));
        System.out.println(challenge5.matches(regex5));
        System.out.println("----------------------------------------------------");

        String challenge7 = "abcd.135";
//        String regex7 = "^\\D{4}\\.\\d{3}";
        String regex7 = "^[A-z][a-z]+\\.\\d+$";
        System.out.println(challenge7.replaceAll(regex7,"REPLACED"));
        System.out.println(challenge7.matches(regex7));
        System.out.println("----------------------------------------------------");

        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern8 = Pattern.compile("[A-Za-z]+\\.(\\d+)");   // surrounding in parenthesis = (group)
        Matcher matcher8 = pattern8.matcher(challenge8);

        while(matcher8.find()) {
            System.out.println("Occurrence " + matcher8.group(1));
        }
        System.out.println("----------------------------------------------------");

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
//        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)[\t|\n]");
        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");    // \\s = whitespaces
        Matcher matcher9 = pattern9.matcher(challenge9);

        while(matcher9.find()) {
            System.out.println("Occurrence " + matcher9.group(1));
        }
        System.out.println("----------------------------------------------------");

        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge10);

        while(matcher10.find()) {
            System.out.println("Occurrence " + matcher10.group(1));
            System.out.println("Occurrence: start = " + matcher10.start(1) + " end = " + (matcher10.end(1) -1));
        }
        System.out.println("----------------------------------------------------");

        String challenge11 = "{0,2}, {0,5}, {1,3}, {2,4}";
//        Pattern pattern11 = Pattern.compile("(\\d,\\d)");
//        Pattern pattern11 = Pattern.compile("([0-9],[0-9])");
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");         // anything inside {}
        Matcher matcher11 = pattern11.matcher(challenge11);

        while(matcher11.find()) {
            System.out.println("Occurrence " + matcher11.group(1));
        }
        System.out.println("----------------------------------------------------");

        String challenge11a = "{0,2}, {0,5}, {1,3}, {2,4}, {x,y}, {6,34}, {11,12}";
        Pattern pattern11a = Pattern.compile("\\{(\\d+,\\d+)\\}");
        Matcher matcher11a = pattern11a.matcher(challenge11a);

        while(matcher11a.find()) {
            System.out.println("Occurrence " + matcher11a.group(1));
        }
        System.out.println("----------------------------------------------------");

        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));
        System.out.println("----------------------------------------------------");

        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));
        System.out.println("----------------------------------------------------");

        System.out.println(challenge12.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge13.matches("^\\d{5}(-\\d{4})?$"));
    }
}
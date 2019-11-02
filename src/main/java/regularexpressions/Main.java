package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "I am a String. Yes, I am.";
        System.out.println(string);

        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);
        System.out.println("----------------------------------------------------");

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String alphanum = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanum.replaceAll("[^ej]", "X"));
        System.out.println(alphanum.replaceAll("[abcdef345678]", "X"));
        System.out.println(alphanum.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(alphanum.replaceAll("(?i)[a-f3-8]", "X"));

        System.out.println(alphanum.replaceAll("[0-9]","X"));
        System.out.println(alphanum.replaceAll("\\d","X")); // digits
        System.out.println(alphanum.replaceAll("\\D","X")); // NON-digits

        String hasWhitespace = "I have blanks and \ta tab, and also a newLine\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s",""));
        System.out.println(hasWhitespace.replaceAll("\t","X"));
        System.out.println("->" + hasWhitespace.replaceAll("\\S","") + "<-"); // only \t, Spaces and \n remain

        System.out.println(hasWhitespace.replaceAll("\\w", "X")); // whitespace
        System.out.println(hasWhitespace.replaceAll("\\W", "X")); // NOT-whitespace
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));

        String a = "abcDF12Ghhiiiijkl99z";
        System.out.println(a.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(a.replaceAll("^abcDe+", "YYY"));
        System.out.println(a.replaceAll("^abcDe*", "YYY"));

        String b = "abcDeF12Ghhiiiijkl99z";
        System.out.println(b.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(b.replaceAll("[h+i*j]", "Y"));
        System.out.println(b.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>A paragraph.</p>");
        htmlText.append("<p>A paragraph again.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is a summary.</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }
        System.out.println("----------------------------------------------------");

        String h2GroupPattern = "(<h2>.*?</h2>)";         // lazy quantifier
//        String h2GroupPattern = "(<h2>.*</h2>)";          // greedy quantifier
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()){
            count++;
            System.out.println("Occurrence " + groupMatcher.group(1));
        }
        System.out.println("----------------------------------------------------");

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while(h2TextMatcher.find()) {
            count++;
            System.out.println("Occurrence " + h2TextMatcher.group(2));
        }
        System.out.println("----------------------------------------------------");

        System.out.println("harry".replaceAll("[H|h]arry", "Joe")); // [H|h] = OR within pattern
        System.out.println("Harry".replaceAll("[H|h]arry", "Joe"));

        // [^abc] = NOT
        String tvTest = "tstvtkt";
//        String tNotVRegExp = "t[^v]";     // t not followed by a v
        String tNotVRegExp = "t(?!v)";    // look ahead syntax = ! does not consume a char
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while (tNotVMatcher.find()){
            count++;
            System.out.println("Occurence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }
        System.out.println("----------------------------------------------------");

        String phoneRegex = "^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$";
        System.out.println("phone1 = " + "1234567890".matches(phoneRegex));        // no match
        System.out.println("phone2 = " + "(123) 456-7890".matches(phoneRegex));    // match
        System.out.println("phone3 = " + "123 456-7890".matches(phoneRegex));      // no match
        System.out.println("phone4 = " + "(123)456-7890".matches(phoneRegex));     // no match

        System.out.println("----------------------------------------------------");

        String cardRegex = "^4[0-9]{12}([0-9]{3})?$";
        System.out.println("visa1 = " + "4444444444444".matches(cardRegex));    // match
        System.out.println("visa2 = " + "5444444444444".matches(cardRegex));    // no match
        System.out.println("visa3 = " + "4444444444444444".matches(cardRegex)); // match
        System.out.println("visa4 = " + "4444".matches(cardRegex));             // no match

    }
}

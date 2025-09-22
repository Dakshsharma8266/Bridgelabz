import java.util.*;

public class SentenceFormatter {

    public static String formatParagraph(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return "";
        }

        // Remove extra spaces
        paragraph = paragraph.trim().replaceAll("\\s+", " ");

        // Ensure one space after punctuation
        paragraph = paragraph.replaceAll("\\s*([.,!?])\\s*", "$1 ");

        // Capitalize first letter of each sentence
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : paragraph.toCharArray()) {
            if (capitalizeNext && Character.isLetter(c)) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(c);
            }
            if (c == '.' || c == '?' || c == '!') {
                capitalizeNext = true;
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world.this is a test!do you like java?yes, i do.   ";
        String formatted = formatParagraph(input);

        System.out.println("Original: " + input);
        System.out.println("Formatted: " + formatted);
    }
}
question 2
import java.util.*;

public class SentenceFormatter {

    public static String formatParagraph(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return "";
        }

        // Remove extra spaces
        paragraph = paragraph.trim().replaceAll("\\s+", " ");

        // Ensure one space after punctuation
        paragraph = paragraph.replaceAll("\\s*([.,!?])\\s*", "$1 ");

        // Capitalize first letter of each sentence
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : paragraph.toCharArray()) {
            if (capitalizeNext && Character.isLetter(c)) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(c);
            }
            if (c == '.' || c == '?' || c == '!') {
                capitalizeNext = true;
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world.this is a test!do you like java?yes, i do.   ";
        String formatted = formatParagraph(input);

        System.out.println("Original: " + input);
        System.out.println("Formatted: " + formatted);
    }
}

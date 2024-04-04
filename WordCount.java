import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        String[] words = inputString.split("\\s+");

        int wordCount = words.length;

        System.out.println("Number of words in the string: " + wordCount);

        scanner.close();
    }
}

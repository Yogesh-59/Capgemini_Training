import java.util.Scanner;
public class LongestWord {

    public static String findLongestWord(String str) {
        String[] words = str.split("\\s+"); // split the sentence into an array of words based on spaces
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String longestWord = findLongestWord(str);
        System.out.println("The longest word in the sentence is: " + longestWord);
    }
}
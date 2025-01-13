import java.util.Scanner;

public class WordReplacer {
    public static String replaceWord(String sentence, String target, String replacement) {
        return sentence.replace(target, replacement);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String target = sc.nextLine();
        String replacement = sc.nextLine();
        String result = replaceWord(sentence, target, replacement);
        System.out.println("Modified Sentence: " + result);
    }
}

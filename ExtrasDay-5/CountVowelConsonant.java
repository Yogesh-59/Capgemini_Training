import java.util.*;

public class CountVowelConsonant {

    public static int[] vowelConsonantCount(String str) {
        int len = str.length();
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < len; ++i) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || 
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } 
            else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                consonantCount++;
            }
        }

        return new int[] { vowelCount, consonantCount };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        
        int[] result = vowelConsonantCount(str);
        System.out.println("Vowel count is: " + result[0]);
        System.out.println("Consonant count is: " + result[1]);
    }
}

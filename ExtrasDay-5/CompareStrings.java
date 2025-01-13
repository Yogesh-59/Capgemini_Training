import java.util.Scanner;
public class CompareStrings {
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);
        for (int i = 0; i < minLen; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2; 
            }
        }
           if (len1 == len2) {
            return 0; 
        } else if (len1 > len2) {
            return 1; 
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int result = compareStrings(str1, str2);

        if (result == 0) {
            System.out.println("The strings are equal.");
        } else if (result < 0) {
            System.out.println("The first string is lexicographically smaller than the second string.");
        } else {
            System.out.println("The first string is lexicographically greater than the second string.");
        }
    }
}

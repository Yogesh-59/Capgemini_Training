import java.util.Scanner;
public class SubstringOccurrences {
    public static int countSubstringOccurrence(String str, String subStr) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Enter the substring to search for: ");
        String subStr = sc.nextLine();
        int occurrences = countSubstringOccurrence(str, subStr);
        System.out.println("The substring " + subStr + " occurs " + occurrences + " times in the main string.");
    }
}

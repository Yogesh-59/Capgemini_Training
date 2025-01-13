import java.util.Scanner;
public class RemoveCharacter {
    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != charToRemove) {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char charToRemove = sc.next().charAt(0);
        String result = removeCharacter(str, charToRemove);
        System.out.println("Modified String: " + result);
    }
}

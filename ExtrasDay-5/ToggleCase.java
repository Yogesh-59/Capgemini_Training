import java.util.Scanner;

public class ToggleCase {
    public static String toggleCase(String str) {
        StringBuilder toggledString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } 
            else if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch)); 
            } 
            else {
                toggledString.append(ch);
            }
        }

        return toggledString.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = toggleCase(str);
        System.out.println("The toggled case string is: " + result);
    }
}

import java.util.*;
public class RemoveDuplicates {

    public static String removeDuplicates(String str) {
        Set<Character> st = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (st.add(ch)) { 
                sb.append(ch); 
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().trim();
        String result = removeDuplicates(str);
        System.out.println("Original given String: " + str);
        System.out.println("String after removing duplicates: " + result); 
    }
}
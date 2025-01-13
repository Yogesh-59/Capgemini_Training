import java.util.*;

public class ReverseString {

    public static String reverseStr(String str) {
        int len = str.length();
        String temp="";
        for(int i=len-1;i>=0;i--){
          temp +=str.charAt(i);
      }
      return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        System.out.println("given string reverse string is: " +reverseStr(str) );
    }
}

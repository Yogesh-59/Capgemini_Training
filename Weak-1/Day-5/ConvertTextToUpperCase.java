import java.util.Scanner;
import java.util.*;
public class ConvertTextToUpperCase{
    public static String upperCaseConvert(String str){
          StringBuilder sb =new StringBuilder();
          for (int i=0;i<str.length();++i){
            char ch =str.charAt(i);
           if(ch>='a' && ch<='z'){
              sb.append((char)(ch-32));
                }
          else{
            sb.append(ch);
     }
   }
      return sb.toString();
  }
 public static boolean compareTwoString(String str1, String str2){
       if (str1.length() !=str2.length()){
        return false;
       }
           for(int i=0;i<str1.length();++i){
             if (str1.charAt(i)!=str2.charAt(i)){
                return false;
              }
             }
            return true;
        
}
   public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
         String str=sc.nextLine().trim();
         String upperCase=str.toUpperCase();
         String uppercaseMethod=upperCaseConvert( str);
         boolean result=compareTwoString(upperCase , uppercaseMethod);
         System.out.println("Uppercase Text use Built-in : " + upperCase);
        System.out.println("Uppercase Text using method: " + uppercaseMethod);
        System.out.println("Are both results equal? " + result);
            
  }
}
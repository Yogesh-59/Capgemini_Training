import java.util.Scanner;
import java.util.*;
public class ConvertTextToLowerCase{
    public static String lowerCaseConvert(String str){
          StringBuilder sb =new StringBuilder();
          for (int i=0;i<str.length();++i){
            char ch =str.charAt(i);
           if(ch>='A' && ch<='Z'){
              sb.append((char)(ch+32));
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
         String lowerCase=str.toLowerCase();
         String lowercaseMethod=lowerCaseConvert( str);
         boolean result=compareTwoString(lowerCase , lowercaseMethod);
         System.out.println("lowercase Text use Built-in : " + lowerCase);
        System.out.println("lowercase Text using method: " + lowercaseMethod);
        System.out.println("Are both results equal? " + result);
            
  }
}
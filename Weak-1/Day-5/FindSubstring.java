import java.util.Scanner;
public class FindSubstring{
    public static String subStringUseChar(String str1, int start , int end){
           String ans="";
          for (int i=start;i<end;++i){
               ans +=str1.charAt(i);
         }
            return ans;
   
     } 
     public static String findSubStr(String str, int start, int end){
        String result="";
         result=str.substring(start,end);
       return result;
  }
   public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
     String str1=sc.nextLine().trim();
     int start=sc.nextInt();
     int end=sc.nextInt();
          if (findSubStr(str1,start,end).equals(subStringUseChar(str1,start,end))){
             
           System.out.println("find substring using method :"+findSubStr(str1,start,end));
            System.out.println("find substring using charAt :"+subStringUseChar(str1,start,end));
         }
        else{
           System.out.println("the given string is not same as charAt substring and method substring");
        }
         
     }	
 }
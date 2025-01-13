import java.util.Scanner;
public class StringComparision{
  public static boolean compareString(String str1, String str2){
      if(str1.length() !=str2.length()){
         return false;
      }
        else{
         if(str1.equals(str2)){
         return true;
        }
         else{
           return false;
        }
     }

   }
    public static boolean CompareStringUseChar(String str1, String str2){
         if (str1.length()!=str2.length()){
             return false;
            }
          for (int i=0;i<str1.length();++i){
          if(str1.charAt(i)!=str2.charAt(i)){
           return false;
          }
         }
            return true;
   
     } 
   public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
     String str1=sc.nextLine();
     String str2= sc.nextLine();
      if(compareString(str1,str2) && CompareStringUseChar(str1, str2)){
         System.out.println("The given string 1 is :"+str1+ " is equals to string 2"+str2);
       }
       else{
         System.out.println("The given string 1 is :"+str1+ " is not equals to string 2 :"+str2);
        }
     }
 }
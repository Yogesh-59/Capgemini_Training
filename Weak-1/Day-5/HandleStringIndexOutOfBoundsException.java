import java.util.Scanner;
import java.util.*;
public class HandleStringIndexOutOfBoundsException{
    public static void generateStringIndexOutOfBoundsException(String str){
          char ch =str.charAt(str.length());
         System.out.println("the length of string is :"+str.length()+" character is :"+ch);
     }
   public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
          String str=sc.nextLine().trim();
       try{
         generateStringIndexOutOfBoundsException(str);
        }
      catch(Exception e){
           System.out.println("String Index Out Of Bounds Exception is caught "+e.getMessage());
           System.out.println("plese enter valid index");
     }	
 }
}
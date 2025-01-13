import java.util.Scanner;
import java.util.*;
public class HandleNumberFormatException{
    public static void generateNumberFormatException(String str){
          int number=Integer.parseInt(str);
          System.out.println("number :"+number);
     }
   public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
          String str=sc.nextLine().trim();
       try{
         generateNumberFormatException(str);
        }
      catch(Exception e){
           System.out.println(" Exception is caught "+e.getMessage());
           
     }	
  }
}
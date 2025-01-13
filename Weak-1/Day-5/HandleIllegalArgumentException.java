import java.util.Scanner;
import java.util.*;
public class HandleIllegalArgumentException{
    public static void generateIllegalArgumentException(String str, int start, int end){
          String ch=str.substring(start, end);
          System.out.println("enter String and its substring is :"+ch);
     }
   public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
          String str=sc.nextLine().trim();
             int start=sc.nextInt();
             int end=sc.nextInt();
       try{
         generateIllegalArgumentException(str,start,end);
        }
      catch(Exception e){
           System.out.println("no Exception is caught "+e.getMessage());
           System.out.println("plese enter valid index");
     }	
  }
}
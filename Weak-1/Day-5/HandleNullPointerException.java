import java.util.Scanner;
import java.util.*;
public class HandleNullPointerException{
    public static void generateNullPointer(){
          String str=null;
          int len=str.length();
     }
   public static void main(String [] args){
         
       try{
         generateNullPointer();
        }
      catch( NullPointerException e){
           System.out.println("null pointer is caught "+e.getMessage());
           System.out.println("you need to set the length is :"+"0");
     }	
 }
}
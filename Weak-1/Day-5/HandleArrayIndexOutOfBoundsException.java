import java.util.Scanner;
import java.util.*;
public class HandleArrayIndexOutOfBoundsException{
    public static void generateArrayIndexOutOfBoundsException(int [] array ,int index){
          int number=array[index];
          System.out.println("number :"+number);
     }
   public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
          int[] array={25,5,2005,7,15,10};
          int number=sc.nextInt();
       try{
         generateArrayIndexOutOfBoundsException(array,number);
        }
      catch(Exception e){
           System.out.println(" Exception is caught "+e.getMessage());
           
     }	
  }
}
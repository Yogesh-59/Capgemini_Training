import java.util.Scanner;
public class FeeStructure{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    // Taking user input
    int fee=sc.nextInt();
    int discountPercent=sc.nextInt();
    // Calculating the discount Amount
    int discountAmount=(fee*discountPercent)/100;
    // then print the discounted fee
    int discountedFee= (fee - discountAmount);
      System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+discountedFee);
   }

}
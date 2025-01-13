import java.util.Scanner;
public class StringToCharacter{
    public static char[] strTochar(String str1){
          int len=str1.length();
           //char[] ch=str1.toCharArray();
          char[]ans=new char[len];
          for(int i=0;i<len;++i){
            ans[i] += str1.charAt(i);
         }
        return ans;
   
     } 
    public static char[] toCharArrMethod(String str){
        char[] temp=str.toCharArray();
          return temp;
     }
   public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
     String str1=sc.nextLine().trim();
      char []result=strTochar(str1);
       char []ans=toCharArrMethod(str1);
        for (int i=0;i<str1.length();++i){
          if(result[i]!=ans[i]){
            System.out.print("The given String is not same as char method and function");
           }
            else{
             System.out.print(ans[i]+" ");
           }
         }
     }	
 }
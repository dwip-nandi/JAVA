import java.util.Scanner;
import java.util.ArrayList;

public class Palindroms {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          System.out.print("Enter the string :");
          String str = input.nextLine();
          input.close();
        
          System.out.println("The string is : " + str);
          String[] strArray = str.toLowerCase().split(" ");
        //   ArrayList<string>arrlist = new ArrayList<string>();
          for(String s:strArray){
               if(isPalindrom(s)){
                System.out.print(s + " ");
               }
          }

    }
    public static boolean isPalindrom(String s){
            int l=0,r=s.length()-1;
            while(l<r){
                if(s.charAt(l) != s.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }return true;
    }
    
}
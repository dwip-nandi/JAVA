import java.util.Scanner;
import java.util.ArrayList;

public class ReverseWords{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str= input.nextLine();
        input.close();
        String[] words =str.split(" ");
        ArrayList<String> newArrayString = new ArrayList<>();
        for(String s:words){
            String r= new StringBuilder(s).reverse().toString();
            newArrayString.add(r + " ");
        }

        System.out.print("Reversed words :");
        for(String s:newArrayString){
            System.out.print(s);
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class WordLengthAnalyzer{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = input.nextLine();
        input.close();

        String[] words = str.split(" ");
        ArrayList<String> newArrayString = new ArrayList<>();

        for(String s:words){
            newArrayString.add(s);
        }
        System.out.print("Words :");
        for(String s:newArrayString){
            System.out.print(s + ", ");
        }
        System.out.println();
        System.out.print("Length :");
        for(String s:newArrayString){
            System.out.print(s.length() + " ");
        }
    }

}
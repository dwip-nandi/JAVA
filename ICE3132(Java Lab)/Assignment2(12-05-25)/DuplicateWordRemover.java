import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class DuplicateWordRemover{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = input.nextLine();
        input.close();
        String[] words = str.split(" ");
        Set<String>st= new HashSet<>();
        for(String s:words){
            st.add(s);
        }
        for(String s:st){
            System.out.print(s + " ");
        }
    }
}
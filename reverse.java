import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String a=sc.nextLine();
        
        List<Character> charList = new ArrayList<>();
        for (char c : a.toCharArray()) {
            charList.add(c);
        }
        Collections.reverse(charList);
        
        StringBuilder reversedStringBuilder = new StringBuilder();
        for (char c : charList) {
            reversedStringBuilder.append(c);
        }
        String reversedString = reversedStringBuilder.toString();
        
        System.out.println("Original String: " + a);
        System.out.println("Reversed String: " + reversedString);
    }
}

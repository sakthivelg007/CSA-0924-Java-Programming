import java.util.*;
public class vowels
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		String a=sc.nextLine();
		int count1=0;
		int count=0;
        List<Character> vowelsList = Arrays.asList('A', 'E', 'I', 'O', 'U');
		List<Character> charList = new ArrayList<>();
        for (int i = 0; i < a.length(); i++)
        {
            charList.add(a.charAt(i));
        }
        System.out.println("List of characters: " + charList);
        for (int i = 0; i < a.length(); i++)
        {
        	 if (vowelsList.contains(Character.toUpperCase(charList.get(i)))) 
        	 {
        		 count=count+1;
        	 }
        	 else
        	 {
        		 count1=count1+1;
        	 }
                 
        }
        System.out.println("vowels count: "+count);
        System.out.println("consonants count: "+count1);
        
	}
}

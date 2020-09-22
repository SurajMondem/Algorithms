import java.util.*;

public class IsUnique {
    public static void main(String[] args) {
        String[] input = {"string", "abcda", "drowned", "abcabc"};

        for (String string : input) {
            boolean result = Is_Unique(string);
            System.out.println(result);    
        }
    }

    private static boolean Is_Unique(String input){
        HashSet<Character> set = new HashSet<>();

        for (int i =0; i < input.length(); i++) {
            if(set.contains(input.charAt(i))){
                return false;
            }
            else{
                set.add(input.charAt(i));
            }
        
        }
        return true;
    }
}
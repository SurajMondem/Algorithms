import java.util.*;
public class isPalindromePermutation {
    public static void main(String[] args) {
        System.out.println(checkPalindromePermutation("apapapapbcdbcds"));
        System.out.println(checkPalindromePermutation("abcdefabcefd"));
        System.out.println(checkPalindromePermutation("apaapbcdbcds"));
    }

    private static boolean checkPalindromePermutation(String input){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
           map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());

        if(input.length() % 2 == 0){
            for(int i = 0; i< list.size(); i++){
                if(!(list.get(i) % 2 == 0)){
                    return false;
                }
            }
        }
        else if(input.length() % 2 != 0){
            int counter = 0;
            for (int i = 0; i < list.size(); i++) {
                if((list.get(i) % 2 != 0) && (counter > 1)){
                    return false;
                }
                else if(list.get(i) % 2 != 0){
                    counter++;
                }
            }
        }

        return true;
    }
}
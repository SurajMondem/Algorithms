
public class CheckPermutation {
    public static void main(String[] args) {
        String[] input1 = {"mtu", "dog", "aba", "abba"};
        String[] input2 = {"mut", "god", "baa", "abbc"};

        for (int i = 0; i < input1.length; i++) {
            System.out.println(Check_Permutation(input1[i], input2[i]));
        }

    }
    private static boolean Check_Permutation(String string1, String string2){
        if(string1.length() != string2.length()){
            return false;
        }

        int[] letters = new int[128];
        for (int i = 0; i < string1.length(); i++) {
            letters[string1.charAt(i)]++;
        }

        for (int i = 0; i < string2.length(); i++) {
            letters[string2.charAt(i)]--;
            if(letters[string2.charAt(i)] < 0){
                return false;
            }
        }
        return true;

    }
}
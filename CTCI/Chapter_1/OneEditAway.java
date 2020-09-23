public class OneEditAway {
    public static void main(String[] args) {
        System.out.println(checkOneEdit("pale", "ple"));
        System.out.println(checkOneEdit("pale", "bale"));
        System.out.println(checkOneEdit("pales", "pale"));
        System.out.println(checkOneEdit("pale","bake"));

    }

    private static boolean checkOneEdit(String first, String second){
        if(Math.abs(first.length() - second.length()) > 1){
            return false;
        }

        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int index1 = 0;
        int index2 = 0;
        boolean found = false;
        while (index1 < s1.length() && index2 < s2.length()) 
        {
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(found){
                    return false;
                }
                found = true;

                if(s1.length() == s2.length()){
                    index1++;
                }
            }
            else {
                index1++;
            }
            index2++;
        }

        return true;
    }
}
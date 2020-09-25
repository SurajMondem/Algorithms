public class isStringRotation {
    public static void main(String[] args) {
        System.out.println( checkStringRotation("waterbottle", "erbottlewat") );
    }


    private static boolean checkStringRotation(String s1, String s2){
        if(s1.length() == s2.length() && (s1.length() > 0)){
            String s1s1 = s1 + s1;
            return isSubstring(s2,s1s1);
        }
        
        
        return false;
    }

    private static boolean isSubstring(String s1, String s3) {
        int count = 0;
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) == s1.charAt(count))
                count++;
            else {
                count = 0;
            }
            if (count == s1.length())
                return true;// has calculated up to the full length
            if (i - count >= s1.length())
                return false; // it's been the second part...

        }
        return false;
    }
}
public class StringCompression {
    public static void main(String[] args) {
        System.out.println(createStringCompression("aabbaaccccab"));
        System.out.println(createStringCompression("string"));
        System.out.println(createStringCompression("malayalam"));
        System.out.println(createStringCompression("aabbbbcccabcabc"));
    }


    private static String createStringCompression (String input){
        String str = "";
        int count = 0;
        for (int i = 0; i < input.length() -1 ; i++) {
            if(input.charAt(i) == input.charAt(i+1)){
                count++;
            }
            else if (input.charAt(i) != input.charAt(i + 1)) {
                count++;
                str = str + input.charAt(i) + "" + count;
                count = 0;    
            }

        }
        str = str + input.charAt(input.length() -1 ) + "" + (count+1);
        return str;
    }
}
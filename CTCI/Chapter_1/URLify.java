/*
APPRAOCH:
-> Counted Spaces to be filled
-> added that spacecount(spacecount * 2) as '%20' has 2 more spaces than ' '
-> Reverse parse if ' '
    -> then insert '%20'
    -> else map the index with oldindex



*/
public class URLify {
    public static void main(String[] args){
         String input = "Mr John Smith    ";
         int truelength = 13;
         System.out.println(make_URLify(input.toCharArray(), truelength));
    }

    private static char[] make_URLify(char[] str, int truelength)
    {
        int spaceCount = countOfChar(str, 0, truelength, ' ');
        int newIndex = truelength - 1 + spaceCount * 2;

        if(newIndex + 1 < str.length){
            str[newIndex + 1] = '\0';
        }
        for (int oldIndex = truelength - 1; oldIndex >= 0; oldIndex--) {
            if(str[oldIndex] == ' '){
                str[newIndex] = '0';
                str[newIndex -1] = '2';
                str[newIndex -2] = '%';
                newIndex -= 3;
            }
            else{
                str[newIndex] = str[oldIndex];
                newIndex -= 1;
            }
            
        }

        return str;
    }

    private static int countOfChar(char[] str, int start, int end, int target){
        int count = 0;
        for (int i = start; i < end; i++) {
            if(str[i] == target){
                count++;
            }
        }
        return count;
    }
}

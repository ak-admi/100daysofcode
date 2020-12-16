package Day3;

public class ReverseSentence {
    public static String Reverse(String S) {
         S= S.trim();
         char [] str=S.toCharArray();
        String result = "";
        int index = str.length-1;
        char chr;
        boolean isStart = true;
        while (index >= 0) {
            chr = str[index];
            if(isStart && chr!=" "){
                isStart=false;
            }
            
        }else{
            chr=chr.toLowerCase();
        }

    }

    public static void main(String[] args) {

    }

}

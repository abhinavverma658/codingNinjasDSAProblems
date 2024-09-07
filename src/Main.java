import java.util.Arrays;
import java.util.Scanner;

public  class Main {
    public boolean isPalindrome(String s) {
        int n=s.length();
        s=s.toLowerCase();
        s=s.replaceAll("\\s+", "");
        s=s.replaceAll(",","");
        s=s.replaceAll(":","");
        String str=s;
        String sentence="";
        for(int i=n;i>=0;i--){
            char ch=s.charAt(i);
            String str1 = String.valueOf(ch);
            sentence=sentence.concat(str1);
        }
        if(str.equals(sentence)){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Main mn= new Main();
        mn.isPalindrome("A man, a plan, a canal: Panama");


    }
}
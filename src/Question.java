import java.util.Scanner;

public class Question {

    public static void main(String[] args) {
        String name = "abhinavverma";
        int length= name.length();
        char temp=name.charAt(0);
        for(int i=0;i<length;i++){
            for(int j=1;j<length;j++){
                if(temp==name.charAt(j)){
                    System.out.println(temp);
                }
                temp++;
            }
        }
    }
}

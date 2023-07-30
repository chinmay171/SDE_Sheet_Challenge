import java.util.* ;
import java.io.*; 
public class atoiFunction {
    public static int atoi(String s) {
        // Write your code here.
        String strAns = "";
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == '-') strAns += '-';
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
                strAns += s.charAt(i);
        }
        return Integer.parseInt(strAns) % 1000000007;
    }
}

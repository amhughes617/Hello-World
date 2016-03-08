import java.util.ArrayList;

/**
 * Created by alexanderhughes on 3/8/16.
 */
public class Exercise09 {
    public static void main(String[] args) {
        int num = 12345;
        //...
        // int newNum = 54321;
        String numStr = String.valueOf(num);
        String newNumString = "";
        for (int i = numStr.length() - 1; i >= 0; i--) {
            newNumString += numStr.charAt(i);
        }
        num = Integer.valueOf(newNumString);
    }
    public static void withBuffer(int num) {
        String numStr = String.valueOf(num);
        StringBuffer buff = new StringBuffer(numStr);
        numStr = buff.reverse().toString();
        num = Integer.valueOf(numStr);
        System.out.println(num);
    }
    public static void useMath(int num) {
        int result = 0;
        int rem;
        while(num > 0) {
            rem = num % 10;
            num = num / 10;
            result = result * 10 + rem;
        }
        System.out.println(result);
    }
}

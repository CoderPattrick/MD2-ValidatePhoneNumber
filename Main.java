import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String[] testCase={"(84)-(0978489648)","(a8)-(22222222)"};
    public static void main(String[] args) {
        String regex = "^[(]\\d{2}[)][-][(]\\d{7,}[)]$";
        Pattern p = Pattern.compile(regex);
        for (String number:testCase
             ) {
            Matcher m = p.matcher(number);
            System.out.println("Phone number "+ number+ " is valid? "+ (m.matches()));
        }
    }
}

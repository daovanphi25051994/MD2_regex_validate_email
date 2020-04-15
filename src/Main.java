import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] arrString = new String[6];
        arrString[0] = "phi@hotmail.com";
        arrString[1] = "pi@gmail.com";
        arrString[2] = "i@gyahoo.com";
        arrString[3] = "@gmail.com";
        arrString[4] = "phi@gmail.";
        arrString[5] = "#phi@gmail.com.vn";
        Validate validate = new Validate();
        for (String string : arrString) {
            boolean isValidate = validate.validateEmail(string);
            System.out.println(isValidate);
        }

    }
}

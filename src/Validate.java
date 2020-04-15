import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    Pattern pattern;
    Matcher matcher;
    public static final String REGEX_EMAIL = "[A-Za-z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)";
    public boolean validateEmail(String string){
        pattern = Pattern.compile(REGEX_EMAIL);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}

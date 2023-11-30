import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserId {
    
    public static boolean firstName(String firstName){

        //name will take min 3 character and will have first letter caps
        String regex = "^[A-Z][a-zA-Z]{2,}$";

        //compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(firstName);

        return matcher.matches();
    }

    public static boolean lastName(String firstName){

        //name will take min 3 character and will have first letter caps
        String regex = "^[A-Z][a-zA-Z]{2,}$";

        //compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(firstName);

        return matcher.matches();
    }
}

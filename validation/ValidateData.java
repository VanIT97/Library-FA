package Library.validation;

import java.util.regex.Pattern;

public class ValidateData {
    public static boolean checkGender(String gender){
        if(gender == "Nam" || gender == "Nu") return true;
        else return false;
    }

    public static boolean checkDateTime(String birthDate){
        return Pattern.matches("^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$", birthDate);
    }

}

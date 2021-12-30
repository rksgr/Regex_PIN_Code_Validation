import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class PINValidation {
    /*
    Use Case 1: Regex pattern to validate pin code (six digit number)
     */
    public void sixDigitPINValidation(int pincode){
        Pattern pattern = Pattern.compile("[1-9][0-9]{5}");
        Matcher matcher = pattern.matcher(Integer.toString(pincode));
        boolean pinCodeValidated = matcher.matches();

        if (pinCodeValidated){
            System.out.println("The given pin code is correct.");
        } else{
            System.out.println("The pin code entered is incorrect.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Bridgelabz!");
        System.out.println("Today we shall perform PIN code validation using Regular Expressions.");
        PINValidation pinv = new PINValidation();
        pinv.sixDigitPINValidation(400088);
    }
}

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
    /*
    Use Case 2: Regex pattern to prevent special and alphanumeric characters at beginning
     of pin code
    */
    public void prvntSplCharAtBeginPINValidation(){
        Pattern pattern = Pattern.compile("[^a-zA-Z~!@#$%^&*()][1-9][0-9]{5}");
        Matcher matcher = pattern.matcher("A400088");
        boolean pinCodeValidated = matcher.matches();

        if (pinCodeValidated){
            System.out.println("The given pin code is correct.");
        } else{
            System.out.println("The pin code entered is incorrect.");
        }
    }
    /*
    Use Case 3: Regex pattern to prevent special and alphanumeric characters at end
     of pin code
    */
    public void prvntSplCharAtEndPINValidation() {
        Pattern pattern = Pattern.compile("[1-9][0-9]{5}[^a-zA-Z~!@#$%^&*()]");
        Matcher matcher = pattern.matcher("400088 ");
        boolean pinCodeValidated = matcher.matches();

        if (pinCodeValidated) {
            System.out.println("The given pin code is correct.");
        } else {
            System.out.println("The pin code entered is incorrect.");
        }
    }
    /*
    Use Case 4: Regex pattern to allow space after 3 characters in the pin code
    */
    public void allowMidSpacePINValidation(){
        Pattern pattern = Pattern.compile("[1-9][0-9]{5}|[1-9][0-9]{2}[\\s][0-9]{3}");
        Matcher matcher = pattern.matcher("400 088");
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
        pinv.allowMidSpacePINValidation();
    }
}

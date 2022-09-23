
import java.util.*;
public class coderbyte1 {

    /*Codeland Username Validation
    Have the function CodelandUsernameValidation(str) take the str parameter being passed and determine if the string is a valid username according to the following rules:

            1. The username is between 4 and 25 characters.
            2. It must start with a letter.
            3. It can only contain letters, numbers, and the underscore character.
            4. It cannot end with an underscore character.

    If the username is valid then your program should return the string true, otherwise return the string false.
    Examples

    Input: "aa_"

    Output: false

    Input: "u__hello_world123"

    Output: true*/

    public static String CodelandUsernameValidation(String str) {
        // code goes here

        String result="false";

        if(str.length()>4 && str.length()<25){
            if(Character.isLetter(str.charAt(0))){
                if(!str.endsWith("_")){
                    for(int i=0;i<str.length();i++){
                        if(Character.isDigit((str.charAt(i))) || Character.isLetter((str.charAt(i))) || str.charAt(i)== '-' ){ // String olmadýðý için çift týrnak içine almadýk.
                            result= "true";
                        }else{
                            result="false";
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }
}
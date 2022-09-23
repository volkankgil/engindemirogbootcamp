
/*Longest Word
        Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string.
        If there are two or more words that are the same length, return the first word from the string with that length.
        Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example "Hello world123 567"

        Examples
        Input: "fun&!! time"
        Output: time

        Input: "I love dogs"
        Output: love*/


import java.util.Scanner;

public class coderbyte2 {

    Scanner input=new Scanner(System.in);
    public static String LongestWord(String sen) {
        // code goes here

        String str[] = sen.split(" ");

        String strmax="";
        int maxlength=0;


        for(int i=0;i<str.length;i++){
            int thisString=0;
            for(int j=0;j<str[i].length();j++){
                if(Character.isAlphabetic(str[i].charAt(j))){
                    thisString++;
                }
            }

            if(thisString>maxlength){
                maxlength=thisString;
                strmax=str[i];
            }
        }

        return strmax;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }
}

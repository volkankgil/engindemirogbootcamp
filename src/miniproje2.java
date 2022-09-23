import java.util.Scanner;

public class miniproje2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str;

        int count = 0;

        int count2=0;

        str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }else if(str.charAt(i)=='e'){
                count2++;
            }
        }
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'ý') {
                count++;
            } else if (str.charAt(j) == 'i') {
                count2++;
            }
        }
        for (int k = 0; k < str.length(); k++) {
            if (str.charAt(k) == 'u') {
            count++;
        }else if (str.charAt(k) == 'ü') {
                count2++;
            }
    }

        for (int l = 0; l < str.length(); l++) {
            if (str.charAt(l) == 'o') {
                count++;
            }else if (str.charAt(l) == 'ö') {
                count2++;
            }
        }
        System.out.println("Kalýn sesli harf içerir." + count);

        System.out.println("Ýnce sesli harf içerir." + count2);
    }
}

        /*String harf;

        harf=input.nextLine();

        switch (harf){
            case "A":

            case "I":

            case "O":

            case "U":
            System.out.println("Kalýn sesli harf.");
            break;
            default:
                System.out.println("Ýnce sesli harf.");

        }*/


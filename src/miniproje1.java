
import java.util.Scanner;

import java.util.*;


public class miniproje1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        boolean isprime=true;

        if(number<2) {
            isprime = false;
            System.out.println("ge�ersiz say� girdiniz.");
        }else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isprime = false;
                }
            }
        }


        if(isprime){
            System.out.println("Say� asald�r." + number);
        }else {
            System.out.println("Say� asal de�ildir." + number);
        }
    }
}

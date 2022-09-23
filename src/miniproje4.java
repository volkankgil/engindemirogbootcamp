import java.util.Scanner;

public class miniproje4 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int number1=input.nextInt();

        int number2=input.nextInt();

        int count1=0;

        int count2=0;

        for(int i=1;i<number1;i++){
            if(number1%i==0){
                count1+=i;
            }
        }

        for(int k=1;k<number1;k++){
            if(number2%k==0){
                count2+=k;
            }
        }

        if(count1==number2&&count2==number1){
            System.out.println("arkadaþ sayýdýr.");
        }else {
            System.out.println("arkadaþ sayý deðildir.");
        }
    }
}

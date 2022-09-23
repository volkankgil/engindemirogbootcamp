import java.util.Scanner;

public class miniproje3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int number;
        number=input.nextInt();
        int total=0;

        for(int i=1;i<=number;i++){
            if(number%i==0){
                total+=i;
            }
        }
        System.out.println(total);

        if(total/2==number){
            System.out.println("Mükemmel sayýdýr.");
        }
    }
}

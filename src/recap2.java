public class recap2 {
    public static void main(String[] args) {
        double list[]={1.5,6.5,3.5,4.5};

        double total=0;

        double max=list[0];

        for (double listele:list) {
            total+=listele;
            if(max<listele){
                max=listele;
            }
            System.out.println(listele);
        }
        System.out.println(total);
        System.out.println(max);
    }
}

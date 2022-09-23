public class değervereferanstipleri {
    public static void main(String[] args) {

        int sayı1=10;
        int sayı2=20;
        sayı2=sayı1;
        sayı1=30;
        sayı2=sayı1;// tekrar eşitleme yapar isek 30 değerini alırız.

        System.out.println(sayı2);

        int list1[]=new int[]{1,2,3,4};
        int list2[]=new int[]{5,6,7,8};

        list2=list1;
        list1[0]=10;

        System.out.println(list2[0]);

    }
}

public class de�ervereferanstipleri {
    public static void main(String[] args) {

        int say�1=10;
        int say�2=20;
        say�2=say�1;
        say�1=30;
        say�2=say�1;// tekrar e�itleme yapar isek 30 de�erini al�r�z.

        System.out.println(say�2);

        int list1[]=new int[]{1,2,3,4};
        int list2[]=new int[]{5,6,7,8};

        list2=list1;
        list1[0]=10;

        System.out.println(list2[0]);

    }
}

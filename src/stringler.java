public class stringler {
    public static void main(String[] args) {

        String mesaj="Bug�n hava �ok g�zel.";

        System.out.println("Eleman Say�s�: " + mesaj.length());

        System.out.println("6. eleman :" +mesaj.charAt(6)); // bo�lukta karakterden say�l�yor.

        String mesaj2=mesaj.concat(" Ya�as�n. ");

        System.out.println(mesaj2);

        System.out.println(mesaj.startsWith("b")); //b�y�k k���k harf duyarl�l���

        System.out.println(mesaj.endsWith("."));

        char karakterler[]=new char[8];

        mesaj.getChars(0,4,karakterler,2);

        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("ug"));
        System.out.println(mesaj.lastIndexOf("."));
    }
}

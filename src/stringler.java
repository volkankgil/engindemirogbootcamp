public class stringler {
    public static void main(String[] args) {

        String mesaj="Bugün hava çok güzel.";

        System.out.println("Eleman Sayýsý: " + mesaj.length());

        System.out.println("6. eleman :" +mesaj.charAt(6)); // boþlukta karakterden sayýlýyor.

        String mesaj2=mesaj.concat(" Yaþasýn. ");

        System.out.println(mesaj2);

        System.out.println(mesaj.startsWith("b")); //büyük küçük harf duyarlýlýðý

        System.out.println(mesaj.endsWith("."));

        char karakterler[]=new char[8];

        mesaj.getChars(0,4,karakterler,2);

        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("ug"));
        System.out.println(mesaj.lastIndexOf("."));
    }
}

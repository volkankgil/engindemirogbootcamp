import java.util.Locale;

public class stringler2 {
    public static void main(String[] args) {

        String mesaj="Bugün hava çok güzel.";

        String yenimesaj=mesaj.replace(" ","-");

        System.out.println(yenimesaj);

        System.out.println(yenimesaj.substring(3));

        System.out.println(yenimesaj.substring(3,6));

        for (String kelime:yenimesaj.split("-")){
            System.out.println(kelime);
        }

        System.out.println(yenimesaj.toLowerCase());
        System.out.println(yenimesaj.toUpperCase());
    }
}

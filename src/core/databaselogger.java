package core;

public class databaselogger implements logger {
    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı: " + data);

    }
}

package core;

public class messagelogger implements logger{

    @Override
    public void log(String data) {
        System.out.println("Mail ile loglandý: " + data);

    }
}

package core;

public class maillogger implements logger{

    @Override
    public void log(String data) {
        System.out.println("Mail ile loglandý: " + data);

    }
}

package core.logging;

public class MailLoggerDao implements  IBaseLoggerDao{
    @Override
    public void log(String data) {
        System.out.println("Maile loglandı:"+data);
    }
}

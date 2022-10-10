package core.logging;

public class DatabaseLoggerDao implements  IBaseLoggerDao{
    @Override
    public void log(String data) {
        System.out.println("Database loglandı:"+data);
    }
}

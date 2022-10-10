package core.logging;

public class FileLoggerDao implements IBaseLoggerDao{
    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandı:"+data);
    }
}

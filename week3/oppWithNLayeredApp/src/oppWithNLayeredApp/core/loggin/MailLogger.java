package oppWithNLayeredApp.core.loggin;

public class MailLogger implements  Logger{
       @Override
    public void log(int id, String name, double unitPrice) {
           System.out.println("to Mail: " +" Product ID: "+id+" Product Name: "+name+" Product Price: "+unitPrice);
    }
}

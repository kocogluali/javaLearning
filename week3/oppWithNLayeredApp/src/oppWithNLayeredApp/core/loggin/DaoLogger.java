package oppWithNLayeredApp.core.loggin;

public class DaoLogger implements  Logger{
    public void log(int id, String name, double unitPrice) {
        System.out.println("to Dao: " +" Product ID: "+id+" Product Name: "+name+" Product Price: "+unitPrice);
    }
}

package oppWithNLayeredApp.core.loggin;

public class FileLogger implements  Logger{
    public void log(int id, String name, double unitPrice) {
        System.out.println("to File : " +" Product ID: "+id+" Product Name: "+name+" Product Price: "+unitPrice);
    }
}



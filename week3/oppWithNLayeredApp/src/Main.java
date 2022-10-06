import oppWithNLayeredApp.business.ProductManager;
import oppWithNLayeredApp.core.loggin.DaoLogger;
import oppWithNLayeredApp.core.loggin.FileLogger;
import oppWithNLayeredApp.core.loggin.Logger;
import oppWithNLayeredApp.core.loggin.MailLogger;
import oppWithNLayeredApp.databaseAccess.HibernatesDba;
import oppWithNLayeredApp.entities.Product;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1,"iphoneX",90);
        Logger[] loggers = {new MailLogger(), new DaoLogger() , new FileLogger()};
        ProductManager  productManager = new ProductManager(new HibernatesDba(), List.of(loggers));
        productManager.add(product);
    }
}
package oppWithNLayeredApp.databaseAccess;

import oppWithNLayeredApp.entities.Product;

public class HibernatesDba implements  ProductDba{
    @Override
    public void add(Product product) {
        System.out.println("Hibernates eklendi.");
    }
}

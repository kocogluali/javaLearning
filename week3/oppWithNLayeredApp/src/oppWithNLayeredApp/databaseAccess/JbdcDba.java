package oppWithNLayeredApp.databaseAccess;

import oppWithNLayeredApp.entities.Product;

public class JbdcDba implements ProductDba{
    @Override
    public void add(Product product) {
        System.out.println("Jdbs Eklendi..");
    }
}

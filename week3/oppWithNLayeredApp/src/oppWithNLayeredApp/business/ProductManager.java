package oppWithNLayeredApp.business;

import oppWithNLayeredApp.core.loggin.Logger;
import oppWithNLayeredApp.databaseAccess.ProductDba;
import oppWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager extends Product {
    private ProductDba productDba;
    private List<Logger> loggers;
    public ProductManager(ProductDba productDba, List<Logger> loggers) {
        this.productDba = productDba;
        this.loggers = loggers;
    }

    public  void add(Product product) throws Exception {
        if(product.getUnitPrice()<10){
            throw new Exception("10 dan küçük değer giremezsiniz");
        }
        productDba.add(product);
        for (Logger logger: loggers
             ) {
            logger.log(product.getId(),product.getName() ,product.getUnitPrice());
        }
    }


}

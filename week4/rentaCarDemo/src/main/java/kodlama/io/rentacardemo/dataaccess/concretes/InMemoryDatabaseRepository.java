package kodlama.io.rentacardemo.dataaccess.concretes;

import kodlama.io.rentacardemo.dataaccess.absract.IBrandRepository;
import kodlama.io.rentacardemo.entites.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryDatabaseRepository implements IBrandRepository {
    List<Brand> brands;

    public InMemoryDatabaseRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"Mercedes"));
        brands.add(new Brand(2,"Audi"));
        brands.add(new Brand(3,"Fiat"));
        brands.add(new Brand(4,"Renault"));
        brands.add(new Brand(5,"Togg"));
    }

    @Override
    public List<Brand> getall() {
       return brands;
    }
}

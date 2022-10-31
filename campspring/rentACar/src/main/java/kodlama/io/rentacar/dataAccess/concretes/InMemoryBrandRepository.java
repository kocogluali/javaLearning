package kodlama.io.rentacar.dataAccess.concretes;

import kodlama.io.rentacar.dataAccess.abstracts.IBrandRepository;
import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Repository //bu sınıf bir dataaccess nesnesidir.
public class InMemoryBrandRepository implements IBrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMV"));
        brands.add(new Brand(2,"Mercedes"));
        brands.add(new Brand(3,"Audi"));
        brands.add(new Brand(4,"Fiat"));
        brands.add(new Brand(5,"Citroen"));
        brands.add(new Brand(6,"Renault"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}

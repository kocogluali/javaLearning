package kodlama.io.rentacardemo.dataaccess.absract;

import kodlama.io.rentacardemo.entites.concretes.Brand;

import java.util.List;

public interface IBrandRepository {
    List<Brand> getall();
}

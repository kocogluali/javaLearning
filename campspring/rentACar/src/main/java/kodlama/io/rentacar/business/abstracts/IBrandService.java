package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.entities.concretes.Brand;

import java.util.List;

public interface IBrandService {
    List<Brand> getAll();
}

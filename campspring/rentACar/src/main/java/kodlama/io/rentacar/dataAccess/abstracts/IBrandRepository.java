package kodlama.io.rentacar.dataAccess.abstracts;

import kodlama.io.rentacar.entities.concretes.Brand;

import java.util.List;

public interface IBrandRepository {
    // Brand[] getAll(); array yerine listden yararlanmak gerekiyor.

    List<Brand> getAll();
}

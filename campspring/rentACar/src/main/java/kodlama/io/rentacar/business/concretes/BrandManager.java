package kodlama.io.rentacar.business.concretes;


import kodlama.io.rentacar.business.abstracts.IBrandService;
import kodlama.io.rentacar.dataAccess.abstracts.IBrandRepository;
import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandManager implements IBrandService {
    private IBrandRepository iBrandRepository;

    public BrandManager(IBrandRepository iBrandRepository) {
        this.iBrandRepository = iBrandRepository;
    }

    @Override
    public List<Brand> getAll() {
        //iş kurallını yazacağımız yapıyı tasarlıyoruz.

        return iBrandRepository.getAll();
    }


}

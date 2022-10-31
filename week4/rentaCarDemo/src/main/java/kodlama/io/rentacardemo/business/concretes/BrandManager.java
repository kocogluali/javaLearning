package kodlama.io.rentacardemo.business.concretes;

import kodlama.io.rentacardemo.business.absract.IBrandService;
import kodlama.io.rentacardemo.dataaccess.absract.IBrandRepository;
import kodlama.io.rentacardemo.entites.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandManager implements IBrandService {

    private IBrandRepository iBrandRepository;

    public BrandManager(IBrandRepository iBrandRepository) {
        this.iBrandRepository = iBrandRepository;
    }

    @Override
    public List<Brand> getall() {
        //iş kurallarını tanımlıyoruz.
        return iBrandRepository.getall();
    }
}

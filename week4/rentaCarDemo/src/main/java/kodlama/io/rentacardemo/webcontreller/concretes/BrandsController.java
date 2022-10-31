package kodlama.io.rentacardemo.webcontreller.concretes;
import kodlama.io.rentacardemo.business.absract.IBrandService;
import kodlama.io.rentacardemo.entites.concretes.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private IBrandService iBrandService;
    public BrandsController(IBrandService iBrandService) {
        this.iBrandService = iBrandService;
    }
    @GetMapping("/getall")
    public List<Brand> getall(){
        return iBrandService.getall();
    }

}

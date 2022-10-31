package kodlama.io.rentacar.webApi.controllers;

import kodlama.io.rentacar.business.abstracts.IBrandService;
import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //annotation //bilgilendirme ifadesidir.
@RequestMapping ("/api/brands") //bu controller a nasıl ulaşacağımızı sağlar https:// deki sorgu yeri gibi



public class BrandsController {
    private IBrandService iBrandService;

    @Autowired //git paremetrelerine bak kim bunu impl... ediyor onu bana newleyip ver
    //yazmasakta çalışır.
    public BrandsController(IBrandService iBrandService) {
        this.iBrandService = iBrandService;
    }

    @GetMapping("/getall")
    public List<Brand> getAll(){

        //IOC yapısı
     return iBrandService.getAll();
    }
}

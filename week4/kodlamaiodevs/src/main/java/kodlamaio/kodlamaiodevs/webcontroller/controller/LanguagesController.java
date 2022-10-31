package kodlamaio.kodlamaiodevs.webcontroller.controller;


import kodlamaio.kodlamaiodevs.business.absract.ILanguageService;
import kodlamaio.kodlamaiodevs.entites.Language;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/language")
public class LanguagesController {

    private ILanguageService iLanguageService;

    public LanguagesController(ILanguageService iLanguageService) {
        this.iLanguageService = iLanguageService;
    }
    @GetMapping("/getlist")
    public List<Language> getlist(){
        return iLanguageService.getlist();
    }

    @PostMapping("/add")
    public void add(Language language) {
        iLanguageService.add(language);
    }



}

package kodlamaio.kodlamaiodevs.business.conceretes;

import kodlamaio.kodlamaiodevs.business.absract.ILanguageService;
import kodlamaio.kodlamaiodevs.dataaccess.absract.ILanguageRepository;
import kodlamaio.kodlamaiodevs.entites.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements ILanguageService {
    private ILanguageRepository iLanguageRepository;

    public LanguageManager(ILanguageRepository iLanguageRepository) {
        this.iLanguageRepository = iLanguageRepository;
    }

    @Override
    public List<Language> getlist() {
        return iLanguageRepository.getlist();
    }

    @Override
    public void add(Language language)  {
        for (Language lang: getlist()
             ) {
            if(lang.getName().equals(lang.getName()) || lang.getName().isEmpty() || lang.getName().isBlank()) {
                System.out.printf("error");
            }

        }
        iLanguageRepository.add(language);
    }



    @Override
    public void delete(int getById) {
        iLanguageRepository.delete(getById);
    }

    @Override
    public void update(int getById, List<Language> languages) {
        iLanguageRepository.update(getById,languages);
    }
}

package kodlamaio.kodlamaiodevs.dataaccess.conceretes;

import kodlamaio.kodlamaiodevs.business.absract.ILanguageService;
import kodlamaio.kodlamaiodevs.dataaccess.absract.ILanguageRepository;
import kodlamaio.kodlamaiodevs.entites.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryRepository implements ILanguageRepository {
    List<Language> languages;

    public InMemoryRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"python"));
        languages.add(new Language(2,"java"));
        languages.add(new Language(3,"c++"));
        languages.add(new Language(4,"c#"));

    }


    @Override
    public List<Language> getlist() {
        return languages;
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }


    @Override
    public void delete(int getById) {
        System.out.println("silindi.");
    }

    @Override
    public void update(int getById, List<Language> languages) {

    }
}

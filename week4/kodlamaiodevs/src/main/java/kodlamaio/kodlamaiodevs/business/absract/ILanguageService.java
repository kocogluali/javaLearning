package kodlamaio.kodlamaiodevs.business.absract;

import kodlamaio.kodlamaiodevs.entites.Language;

import java.util.List;

public interface ILanguageService {
    List<Language> getlist();
    void add(Language language) ;
    void delete(int getById);
    void update(int getById,List<Language> languages);
}

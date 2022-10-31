package kodlamaio.kodlamaiodevs.dataaccess.absract;

import kodlamaio.kodlamaiodevs.entites.Language;

import java.util.List;

public interface ILanguageRepository {
    List<Language> getlist();
   void add(Language language);
    void delete(int getById);
    void update(int getById,List<Language> languages);
}

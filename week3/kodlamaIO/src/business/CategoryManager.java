package business;

import core.logging.IBaseLoggerDao;
import dataAccess.ICategoryDba;
import entites.Category;

import java.util.List;
import java.util.logging.Logger;

public class CategoryManager {
    private List<ICategoryDba> iCategoryDbas;
    private List<IBaseLoggerDao> loggers;

    public CategoryManager(List<ICategoryDba> iCategoryDbas, List<IBaseLoggerDao> loggers) {
        this.iCategoryDbas = iCategoryDbas;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception{
        System.out.println("Eklendi.");
        if(category.getcName().isEmpty() ){
            throw  new Exception("Boş bir categori ismi giremezsin");
        }
        for (IBaseLoggerDao logger: loggers
             ) {
            logger.log(category.getcName());
        }
        for (ICategoryDba iCategoryDba: iCategoryDbas
        ) {
            iCategoryDba.add(category);
        }
    }
}

package dataAccess.category;

import dataAccess.ICategoryDba;
import entites.Category;

public class JdbsCategoryDba implements ICategoryDba {
    @Override
    public void add(Category category) {
        System.out.println("Jdbs eklendi:"+category.getcName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Jdbs güncellendi:"+category.getcName());
    }
}

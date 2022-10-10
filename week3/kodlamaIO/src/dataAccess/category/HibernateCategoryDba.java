package dataAccess.category;

import dataAccess.ICategoryDba;
import entites.Category;

public class HibernateCategoryDba implements ICategoryDba {
    @Override
    public void add(Category category) {
        System.out.println("Hibertanes'e eklendi:"+category.getcName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Hibertanes'e güncellendi:"+category.getcName());
    }
}

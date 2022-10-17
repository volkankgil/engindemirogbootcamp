package dataAccess;

import entities.category;

public class HibernateCategoryDao implements CategoryDao{

    @Override
    public void add(category category) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }

    @Override
    public void delete(category category) {
        System.out.println("Hibernate ile veritabanından silindi");
    }

    @Override
    public void update(category category) {
        System.out.println("Hibernate ile veritabanında güncellendi");
    }
}

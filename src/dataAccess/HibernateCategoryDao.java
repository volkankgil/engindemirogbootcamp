package dataAccess;

import entities.category;

public class HibernateCategoryDao implements CategoryDao{

    @Override
    public void add(category category) {
        System.out.println("Hibernate ile veritaban�na eklendi");
    }

    @Override
    public void delete(category category) {
        System.out.println("Hibernate ile veritaban�ndan silindi");
    }

    @Override
    public void update(category category) {
        System.out.println("Hibernate ile veritaban�nda g�ncellendi");
    }
}

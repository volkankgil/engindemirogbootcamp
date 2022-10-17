package dataAccess;

import entities.*;

public class JDbcCategoryDao implements CategoryDao {

    @Override
    public void add(category category) {
        System.out.println("JDBC ile veritaban�na eklendi");

    }

    @Override
    public void delete(category category) {
        System.out.println("JDBC ile veritaban�ndan silindi");

    }

    @Override
    public void update(category category) {
        System.out.println("JDBC ile veritaban�nda g�ncellendi");

    }
}

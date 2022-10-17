package dataAccess;

import entities.*;

public class JDbcCategoryDao implements CategoryDao {

    @Override
    public void add(category category) {
        System.out.println("JDBC ile veritabanına eklendi");

    }

    @Override
    public void delete(category category) {
        System.out.println("JDBC ile veritabanından silindi");

    }

    @Override
    public void update(category category) {
        System.out.println("JDBC ile veritabanında güncellendi");

    }
}

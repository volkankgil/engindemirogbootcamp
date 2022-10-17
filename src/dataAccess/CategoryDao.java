package dataAccess;

import entities.category;// category sýnýfýnýndan nesne üretmek için import ettik.

public interface CategoryDao {

    void add(category category);
    void delete(category category);
    void update(category category);
}

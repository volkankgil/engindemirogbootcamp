package dataAccess;

import entities.category;// category s�n�f�n�ndan nesne �retmek i�in import ettik.

public interface CategoryDao {

    void add(category category);
    void delete(category category);
    void update(category category);
}

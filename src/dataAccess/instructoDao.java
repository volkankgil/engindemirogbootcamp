package dataAccess;

import entities.instructor;

public interface instructoDao {

    void add(instructor instructor);
    void delete(instructor instructor);
    void update(instructor instrucor);
}

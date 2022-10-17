package dataAccess;

import entities.course;

public interface courseDao {

    void add(course course);
    void delete(course course);
    void update(course course);
}

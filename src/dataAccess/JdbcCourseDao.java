package dataAccess;

import entities.course;

public class JdbcCourseDao implements courseDao{

    @Override
    public void add(course course) {
        System.out.println("JDBC ile veritaban�na eklendi");
    }

    @Override
    public void delete(course course) {
        System.out.println("JDBC ile veritaban�ndan silindi");
    }

    @Override
    public void update(course course) {
        System.out.println("JDBC ile veritaban�nda g�ncellendi");
    }
}

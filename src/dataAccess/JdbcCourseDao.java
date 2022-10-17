package dataAccess;

import entities.course;

public class JdbcCourseDao implements courseDao{

    @Override
    public void add(course course) {
        System.out.println("JDBC ile veritabanına eklendi");
    }

    @Override
    public void delete(course course) {
        System.out.println("JDBC ile veritabanından silindi");
    }

    @Override
    public void update(course course) {
        System.out.println("JDBC ile veritabanında güncellendi");
    }
}

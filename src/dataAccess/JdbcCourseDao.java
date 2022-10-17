package dataAccess;

import entities.course;

public class JdbcCourseDao implements courseDao{

    @Override
    public void add(course course) {
        System.out.println("JDBC ile veritabanýna eklendi");
    }

    @Override
    public void delete(course course) {
        System.out.println("JDBC ile veritabanýndan silindi");
    }

    @Override
    public void update(course course) {
        System.out.println("JDBC ile veritabanýnda güncellendi");
    }
}

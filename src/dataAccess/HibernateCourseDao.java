package dataAccess;


import entities.course;

public class HibernateCourseDao implements courseDao{

    @Override
    public void add(course course) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }

    @Override
    public void delete(course course) {
        System.out.println("Hibernate ile veritabanında silindi");
    }

    @Override
    public void update(course course) {
        System.out.println("Hibernate ile veritabanında güncellendi");
    }
}

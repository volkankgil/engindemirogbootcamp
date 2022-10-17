package dataAccess;

import entities.instructor;

public class HibernateInstroctorDao implements instructoDao{

    @Override
    public void add(instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }

    @Override
    public void delete(instructor instructor) {
        System.out.println("Hibernate ile veritabanından silindi");
    }

    @Override
    public void update(instructor instrucor) {
        System.out.println("Hibernate ile veritabanında güncellendi");
    }
}

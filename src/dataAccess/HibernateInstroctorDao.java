package dataAccess;

import entities.instructor;

public class HibernateInstroctorDao implements instructoDao{

    @Override
    public void add(instructor instructor) {
        System.out.println("Hibernate ile veritabanýna eklendi");
    }

    @Override
    public void delete(instructor instructor) {
        System.out.println("Hibernate ile veritabanýndan silindi");
    }

    @Override
    public void update(instructor instrucor) {
        System.out.println("Hibernate ile veritabanýnda güncellendi");
    }
}

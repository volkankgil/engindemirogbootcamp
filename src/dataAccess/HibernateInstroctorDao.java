package dataAccess;

import entities.instructor;

public class HibernateInstroctorDao implements instructoDao{

    @Override
    public void add(instructor instructor) {
        System.out.println("Hibernate ile veritaban�na eklendi");
    }

    @Override
    public void delete(instructor instructor) {
        System.out.println("Hibernate ile veritaban�ndan silindi");
    }

    @Override
    public void update(instructor instrucor) {
        System.out.println("Hibernate ile veritaban�nda g�ncellendi");
    }
}

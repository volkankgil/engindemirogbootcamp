package dataAccess;

import entities.*;

public class JdbcInstroctorDao implements instructoDao{

    @Override
    public void add(instructor instructor) {
        System.out.println("JDBC ile veritaban�na eklendi");

    }

    @Override
    public void delete(instructor instructor) {
        System.out.println("JDBC ile veritaban�ndan silindi");

    }

    @Override
    public void update(instructor instrucor) {
        System.out.println("JDBC ile veritaban�nda g�ncellendi");

    }
}

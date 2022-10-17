package dataAccess;

import entities.*;

public class JdbcInstroctorDao implements instructoDao{

    @Override
    public void add(instructor instructor) {
        System.out.println("JDBC ile veritabanýna eklendi");

    }

    @Override
    public void delete(instructor instructor) {
        System.out.println("JDBC ile veritabanýndan silindi");

    }

    @Override
    public void update(instructor instrucor) {
        System.out.println("JDBC ile veritabanýnda güncellendi");

    }
}

package Utilidades;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {


    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("cuentasPU");

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }

     public static void closeEntityManagerFactory() {
        if (emf != null) {
            emf.close();
        }
    }



}
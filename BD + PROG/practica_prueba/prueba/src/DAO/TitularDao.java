package DAO;

import Modelo.Titulares;
import Utilidades.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

public class TitularDao {


    public static void agregarTitular(Titulares titular) {

        String sql = "INSERT INTO titulares (dni, nombre) VALUES (?, ?)";

        try
        {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, titular.getDni());
            ps.setString(2, titular.getNombre());
            ps.executeUpdate();

            /*
                Mensaje para nosotros. No para el usuario final.
                En un proyecto real, esto se manejaría con logs o se mostraría en la interfaz de usuario.
             */

            System.out.println(" (DAO)Titular insertado correctamente.");
            DBConnection.closeConnection();

        }
        catch (Exception e)
        {
            System.out.println(" (DAO)Error al insertar titular: " + e.getMessage());
        }
    }


}

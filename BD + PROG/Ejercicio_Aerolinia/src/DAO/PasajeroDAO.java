package DAO;

import Modelo.Pasajero;
import Utilidades.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PasajeroDAO {


    public static  void anadirPasajero(Modelo.Pasajero p){
        String sql = "INSERT INTO pasajeros (dni, nombre, telefono, cod_vuelo) VALUES (?, ?, ?, ?)";

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

           ps.setString(1, p.getDni());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getTelefono());
            ps.setString(4, p.getCod_vuelo().getCod_vuelo());

            ps.executeUpdate();
            DBConnection.closeConnection();

        }catch(Exception e){
            System.out.println(" (DAO) Error al insertar pasajero: " + e.getMessage());
        }
    }

    public static void modificarPasajero(Pasajero pasajero) throws Exception {
        String sql = "UPDATE pasajeros SET nombre = ?, telefono = ? WHERE dni = ?";

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getTelefono());
            ps.setString(3, pasajero.getDni());

            int n = ps.executeUpdate();

            if (n != 1) {
                System.out.println(" (DAO) Pasajero no modificado.");
                // Mensaje para el usuario
                throw new SQLException(" No se encontró ningún pasajero con el DNI proporcionado.");
            } else {
                System.out.println(" (DAO) Pasajero modificado correctamente.");
            }
        } catch (SQLException e) {
            System.out.println(" (DAO) Error al modificar pasajero: " + e.getMessage());
        } finally {
            DBConnection.closeConnection();
        }
    }

     public static void borrar(String dni) throws Exception {
        String sql = "DELETE FROM pasajeros WHERE dni = ?";

        int n = 0;
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, dni);
            n = ps.executeUpdate();

            if (n != 1) {
                System.out.println(" (DAO) Pasajero no borrado.");
                // Mensaje para el usuario
                throw new Exception(" No se encontró ningún pasajero con el DNI proporcionado.");
            } else {
                System.out.println(" (DAO) Pasajero borrado correctamente.");
            }
        } catch (Exception e) {
            System.out.println(" (DAO) Error al borrar pasajero: " + e.getMessage());
        }
        finally {
            DBConnection.closeConnection();
            return;
        }
    }

    public static Pasajero buscarPasajero(String dni) throws SQLException {
        String sql = "SELECT * FROM pasajeros WHERE dni = ?";

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, dni);
            java.sql.ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Pasajero pasajero = new Pasajero(
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("telefono"),
                        VueloDAO.buscarVuelo(rs.getString("cod_vuelo"))
                );
                DBConnection.closeConnection();
                return pasajero;
            } else {
                System.out.println(" (DAO) No se encontró ningún pasajero con el DNI proporcionado.");
                DBConnection.closeConnection();
                return null;
            }
        } catch (Exception e) {
            System.out.println(" (DAO) Error al buscar pasajero: " + e.getMessage());
            return null;
        }
    }
}

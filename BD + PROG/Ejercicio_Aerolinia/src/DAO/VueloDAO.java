package DAO;

import Modelo.Vuelo;

import java.sql.Connection;
import java.sql.SQLException;


public class VueloDAO {

        public static void anadirVuelo(Modelo.Vuelo v) {
            String sql = "INSERT INTO vuelos (cod_vuelo, origen, destino, fecha_salida) VALUES (?, ?, ?, ?)";

            try {
                java.sql.Connection conn = Utilidades.DBConnection.getConnection();
                java.sql.PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1, v.getCod_vuelo());
                ps.setString(2, v.getOrigen());
                ps.setString(3, v.getDestino());
                ps.setDate(4, java.sql.Date.valueOf(v.getFecha_salida()));

                ps.executeUpdate();
                Utilidades.DBConnection.closeConnection();

            } catch (Exception e) {
                System.out.println(" (DAO) Error al insertar vuelo: " + e.getMessage());
            }
        }


        public static Vuelo buscarVuelo(String codigo) throws SQLException {
            String sql = "SELECT * FROM vuelos WHERE cod_vuelo = ?";

            try {
                java.sql.Connection conn = Utilidades.DBConnection.getConnection();
                java.sql.PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1, codigo);
                java.sql.ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String cod_vuelo = rs.getString("cod_vuelo");
                    String origen = rs.getString("origen");
                    String destino = rs.getString("destino");
                    java.sql.Date fecha_salida_sql = rs.getDate("fecha_salida");
                    java.time.LocalDate fecha_salida = fecha_salida_sql.toLocalDate();

                    return new Modelo.Vuelo(cod_vuelo, fecha_salida, destino, origen);
                } else {
                    System.out.println(" (DAO) No se encontró ningún vuelo con el código proporcionado.");
                    return null;
                }
            } catch (Exception e) {
                System.out.println(" (DAO) Error al buscar vuelo: " + e.getMessage());
                return null;
            } finally {
                Utilidades.DBConnection.closeConnection();
            }
        }

        public static void modificarVuelo(Vuelo vuelo) throws SQLException {
            String sql = "UPDATE vuelos SET origen = ?, destino = ?, fecha_salida = ? WHERE cod_vuelo = ?";

            try {
                Connection conn = Utilidades.DBConnection.getConnection();
                java.sql.PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1, vuelo.getOrigen());
                ps.setString(2, vuelo.getDestino());
                ps.setDate(3, java.sql.Date.valueOf(vuelo.getFecha_salida()));
                ps.setString(4, vuelo.getCod_vuelo());

                int n = ps.executeUpdate();
                if (n != 1) {
                    System.out.println(" (DAO) Vuelo no modificado.");
                    // Mensaje para el usuario
                    throw new Exception(" No se encontró ningún vuelo con el código proporcionado.");
                } else {
                    System.out.println(" (DAO) Vuelo modificado correctamente.");
                }
            } catch (Exception e) {
                System.out.println(" (DAO) Error al modificar vuelo: " + e.getMessage());
            } finally {
                Utilidades.DBConnection.closeConnection();
            }
        }

        public static void borrar(String codigo) throws Exception {
            String sql = "DELETE FROM vuelos WHERE cod_vuelo = ?";

            try {
                Connection conn = Utilidades.DBConnection.getConnection();
                java.sql.PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1, codigo);

                int n = ps.executeUpdate();
                if (n != 1) {
                    System.out.println(" (DAO) Vuelo no borrado.");
                    // Mensaje para el usuario
                    throw new Exception(" No se encontró ningún vuelo con el código proporcionado.");
                } else {
                    System.out.println(" (DAO) Vuelo borrado correctamente.");
                }
            } catch (Exception e) {
                System.out.println(" (DAO) Error al borrar vuelo: " + e.getMessage());
            } finally {
                Utilidades.DBConnection.closeConnection();
            }
        }


}

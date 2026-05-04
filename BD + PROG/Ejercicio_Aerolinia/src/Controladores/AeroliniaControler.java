package Controladores;

import DAO.PasajeroDAO;
import DAO.VueloDAO;
import Modelo.Pasajero;
import Modelo.Vuelo;

import java.sql.SQLException;
import java.time.LocalDate;

public class AeroliniaControler {

  // Metodos para Vuelos

    public static void añadirVuelo(String codigo, LocalDate fechaSalida, String destino, String procedencia) {
        Vuelo v = new Vuelo(codigo, fechaSalida, destino, procedencia);
        VueloDAO.anadirVuelo(v);
    }

    public static Vuelo buscarVueloPorCodigo(String codigo) throws SQLException {
        return VueloDAO.buscarVuelo(codigo);
    }

    public Vuelo modificarVuelo(Vuelo vuelo, LocalDate nuevaFechaSalida, String nuevoDestino, String nuevaProcedencia) throws SQLException {
        vuelo.setFecha_salida(nuevaFechaSalida);
        vuelo.setDestino(nuevoDestino);
        vuelo.setOrigen(nuevaProcedencia);
        VueloDAO.modificarVuelo(vuelo);
        return vuelo;
    }

     public static void borrarVuelos(String codigo) throws Exception {
        VueloDAO.borrar(codigo);
    }


    // Metodos para Pasajeros

    public static void añadirPasajero(String dni, String nombre, String telefono, Vuelo vuelo) {
        Pasajero p = new Pasajero(dni, nombre, telefono, vuelo);
        PasajeroDAO.anadirPasajero(p);
    }

    public static void buscarPasajeroPorDni(String dni) throws SQLException {
        PasajeroDAO.buscarPasajero(dni);
    }

     public static void modificarPasajero(Pasajero pasajero, String nuevoNombre, String nuevoTelefono) throws Exception {
        pasajero.setNombre(nuevoNombre);
        pasajero.setTelefono(nuevoTelefono);
        PasajeroDAO.modificarPasajero(pasajero);
    }

     public static void eliminarPasajero(String dni) throws Exception {
        PasajeroDAO.borrar(dni);
    }

}

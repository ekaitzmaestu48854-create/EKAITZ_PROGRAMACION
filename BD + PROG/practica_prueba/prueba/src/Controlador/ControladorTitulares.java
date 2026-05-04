package Controlador;

import DAO.TitularDao;
import Modelo.Titulares;
import Vista.TitularesVista;

public class ControladorTitulares {

    public static void crearTitulares(String nombre, String dni){

        Titulares titular = new Titulares(null,nombre, dni);
        TitularDao.agregarTitular(titular);





    }




}



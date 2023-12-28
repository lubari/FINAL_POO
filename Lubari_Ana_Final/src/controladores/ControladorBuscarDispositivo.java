package controladores;

import Views.DispositivoView;
import exepciones.NoSeEncontroDispositivo;
import facade.ConectividadObjetosa;
import models.Dispositivo;

import javax.swing.*;

public class ControladorBuscarDispositivo {
    private static ControladorBuscarDispositivo instance = null;

    public static ControladorBuscarDispositivo getInstance() {
        if(instance == null){
            instance = new ControladorBuscarDispositivo();
        }
        return instance;
    }

    public static DispositivoView buscarDispositivo(String id){
        try {
            ConectividadObjetosa conectividadObjetosa = ConectividadObjetosa.getInstance();
            Dispositivo dispositivo = conectividadObjetosa.buscarDispositivo(id);
            return conectividadObjetosa.mostrarDispositivo(dispositivo);
        }catch (NoSeEncontroDispositivo e){
            JOptionPane.showMessageDialog(null, "Error: No se encontro el dispositivo:  " + id, "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return null;
    }
}

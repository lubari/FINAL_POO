package facade;

import Views.DispositivoView;
import exepciones.NoSeEncontroDispositivo;
import models.*;


import java.util.ArrayList;
import java.util.List;

public class ConectividadObjetosa {
    private List<Red> redes;
    private List<Dispositivo> dispositivos;
    private static ConectividadObjetosa INSTANCIA;

    ConectividadObjetosa(){
        this.redes = new ArrayList<>();
        this.dispositivos = new ArrayList<>();
    }
    public static ConectividadObjetosa getInstance() {
        if (INSTANCIA == null) {
            INSTANCIA = new ConectividadObjetosa();
        }
        return INSTANCIA;
    }

    public Inalambrico crearRedInalambrica(String nombre, int velocidad, Estandar estandarConectividad){
        Inalambrico red = new Inalambrico(nombre, velocidad, estandarConectividad);
        this.redes.add(red);
        return red;
    }

    public Cableado crearRedCableada(String nombre, int velocidad, Estandar estandarConectividad){
        return new Cableado(nombre, velocidad, estandarConectividad);
    }

    public Notebook crearNotebook(int macAddress, int velocidadPropia, Red red){
        Notebook notebook = new Notebook( macAddress,  velocidadPropia,  red);
        this.dispositivos.add(notebook);
        return notebook;
    }

    public Tablet crearTablet(int macAddress, int velocidadPropia, Red red){
        Tablet tablet = new Tablet( macAddress,  velocidadPropia,  red);
        this.dispositivos.add(tablet);
        return tablet;
    }

    public Celular crearCelular(int macAddress, int velocidadPropia, Red red){
        Celular celular = new Celular( macAddress,  velocidadPropia,  red);
        this.dispositivos.add(celular);
        return celular;
    }

    public Dispositivo buscarDispositivo(String idDispositivo) throws NoSeEncontroDispositivo {
            int mcAddress = Integer.parseInt(idDispositivo);
            if (dispositivos.size()>0){
                for (Dispositivo d : this.dispositivos){
                    if(d.getMacAddress() == mcAddress){
                        return d;
                    }
                }
            }
            throw new NoSeEncontroDispositivo("No se Encontró el dispositivo: "+ idDispositivo);
    }

    public void cambiarEstandarRes(Red red, Estandar estandar){
        red.cambiarEstandar(estandar);
    }

    public DispositivoView mostrarDispositivo(Dispositivo dispositivo){
        return dispositivo.toView();
    }

    public int velocidadMaximaDispositivo(String mcAddress) throws NoSeEncontroDispositivo {
        return buscarDispositivo(mcAddress).getVelocidadMaxima();
    }
}

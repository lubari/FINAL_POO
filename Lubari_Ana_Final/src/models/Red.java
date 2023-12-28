package models;

import java.util.ArrayList;
import java.util.List;

public abstract class Red {
    protected String nombre;
    protected int velocidad;
    protected Estandar estandar;
    protected List<Dispositivo> dispositivos;

    public Red(String nombre, int velocidad, Estandar estandar){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.estandar = estandar;
        this.dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(Dispositivo dispositivo){
        if(dispositivo != null){
            this.dispositivos.add(dispositivo);
        }
    }

    public void cambiarEstandar(Estandar estandar){
        this.estandar = estandar;
    }

    public int getCantDispositivos(){
        return this.dispositivos.size();
    }

    int getVelocidadmbps() {
        return this.estandar.getVelocidadmbps(this.getCantDispositivos());
    }

    public String getNombre() {
        return nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public Estandar getEstandar() {
        return estandar;
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

}

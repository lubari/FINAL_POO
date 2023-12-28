package Views;

public class DispositivoView {
    private int macAddress;
    private String nombreRed;
    private String nombreDispositivo;
    private int velocidadMaxima;

    public DispositivoView(int macAddress, String nombreRed, String nombreDispositivo, int velocidadMaxima) {
        this.macAddress = macAddress;
        this.nombreRed = nombreRed;
        this.nombreDispositivo = nombreDispositivo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getMacAddress() {
        return macAddress;
    }

    public String getNombreRed() {
        return nombreRed;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}

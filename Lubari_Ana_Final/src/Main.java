import Interfaz.InterfazBuscarDispositivo;
import exepciones.NoSeEncontroDispositivo;
import facade.ConectividadObjetosa;
import models.*;

public class Main {
    public static void main(String[] args) throws NoSeEncontroDispositivo {
        ConectividadObjetosa conectividadObjetosa = ConectividadObjetosa.getInstance();


        Estandar801a estandar801a = new Estandar801a();
        Estandar801b estandar801b = new Estandar801b();
        CAT5 estandarCAT5 = new CAT5();
        CAT6 estandarCAT6 = new CAT6();
        Inalambrico inalambrico = conectividadObjetosa.crearRedInalambrica("Telecentro", 1000000, estandar801a);
        Cableado cableado = conectividadObjetosa.crearRedCableada("fibertel", 50000, estandarCAT5);
        Cableado cableado2 = conectividadObjetosa.crearRedCableada("arnet", 50000, estandarCAT6);
        Inalambrico inalambrico2 = conectividadObjetosa.crearRedInalambrica("iplan", 3000000, estandar801b);

        Notebook notebook = conectividadObjetosa.crearNotebook(1, 4000000, inalambrico);
        Notebook notebook2 = conectividadObjetosa.crearNotebook(2, 4000000, inalambrico2);
        Notebook notebook3 = conectividadObjetosa.crearNotebook(3, 4000000, cableado);
        Notebook notebook4 = conectividadObjetosa.crearNotebook(3, 4000000, cableado2);

        Celular celular1 = conectividadObjetosa.crearCelular(4, 2000, inalambrico);
        Celular celular2 = conectividadObjetosa.crearCelular(5, 2000, inalambrico2);
        Celular celular3 = conectividadObjetosa.crearCelular(6, 2000, cableado);
        Celular celular4 = conectividadObjetosa.crearCelular(7, 2000, cableado2);

        Tablet tablet = conectividadObjetosa.crearTablet(8, 80000, inalambrico);
        Tablet tablet2 = conectividadObjetosa.crearTablet(9, 8000, inalambrico2);
        Tablet tablet3 = conectividadObjetosa.crearTablet(10, 6000, cableado);
        Tablet tablet4 = conectividadObjetosa.crearTablet(11, 7000, cableado2);


        inalambrico.agregarDispositivo(notebook);
        inalambrico.agregarDispositivo(tablet);
        inalambrico.agregarDispositivo(celular1);

        inalambrico2.agregarDispositivo(notebook2);
        inalambrico2.agregarDispositivo(tablet2);
        inalambrico2.agregarDispositivo(celular2);

        cableado.agregarDispositivo(notebook3);
        cableado.agregarDispositivo(tablet3);
        cableado.agregarDispositivo(celular3);

        cableado2.agregarDispositivo(notebook4);
        cableado2.agregarDispositivo(tablet4);
        cableado2.agregarDispositivo(celular4);

        conectividadObjetosa.velocidadMaximaDispositivo("4");
        InterfazBuscarDispositivo interfazBuscarDispositivo = new InterfazBuscarDispositivo();
    }
}
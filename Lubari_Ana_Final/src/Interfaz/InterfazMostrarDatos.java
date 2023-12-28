package Interfaz;

import Views.DispositivoView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class InterfazMostrarDatos extends JFrame{
    private JTable table;

    public InterfazMostrarDatos(DispositivoView dispositvoView){
        setTitle("Datos dispositivo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        table = new JTable(new DefaultTableModel(new Object[]{"Mac Address", "Nombre de la Red", "Nombre del dispositivo", "Velocidad maxima" }, 0));
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
        setLocationRelativeTo(null);
        setVisible(true);

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{dispositvoView.getMacAddress(), dispositvoView.getNombreRed(), dispositvoView.getNombreDispositivo(), dispositvoView.getVelocidadMaxima()});
    }
}

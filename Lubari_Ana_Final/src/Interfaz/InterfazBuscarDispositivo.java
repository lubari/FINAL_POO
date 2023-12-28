package Interfaz;

import Views.DispositivoView;
import controladores.ControladorBuscarDispositivo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InterfazBuscarDispositivo extends JFrame{
    private JTable table;

    private JTextField textField;
    private JLabel resultadoLabel;

    private JTabbedPane tabbedPane_8;
    private JTextField campoTexto;

    public InterfazBuscarDispositivo() {

        setTitle("Conectividad Objetosa");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        resultadoLabel = new JLabel();

        // Crear un campo de texto
        campoTexto = new JTextField(20);
        panel.add(new JLabel("Ingrese el id del dispositivo:"));
        panel.add(campoTexto);

        // Crear un botón
        JButton obtenerDatoButton = new JButton("Buscar");

        obtenerDatoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorBuscarDispositivo controladorBuscarDispositivo = ControladorBuscarDispositivo.getInstance();
                if(campoTexto == null){
                    alert("Tiene que agregar un ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    try {
                        DispositivoView dispositivoView = ControladorBuscarDispositivo.buscarDispositivo(campoTexto.getText());
                        if(dispositivoView != null){
                            resultadoLabel.setText("¡Dispositivo encontrado!");
                            abrirVentanaTabla(dispositivoView);
                        }
                    }catch (Exception e1){
                        alert(e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        panel.add(obtenerDatoButton);
        panel.add(resultadoLabel);
        add(panel);

        setVisible(true);
    }

    private void abrirVentanaTabla(DispositivoView dispositivoView) {
        InterfazMostrarDatos mostrarDatos = new InterfazMostrarDatos(dispositivoView);
        mostrarDatos.setVisible(true);
    }

    private void alert(String msg, String type, int pane) {
        JOptionPane.showMessageDialog(tabbedPane_8, msg, type, pane);
    }
}

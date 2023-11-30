package Estudiantes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AltaEstudiantesApp extends JFrame {
    private JTextField nombreField, apellidoField, fechaNacimientoField, dniField, telefonoField, cursoField, direccionField;

    public AltaEstudiantesApp() {
        setTitle("Alta de Estudiantes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes
        nombreField = new JTextField(20);
        apellidoField = new JTextField(20);
        fechaNacimientoField = new JTextField(20);
        dniField = new JTextField(20);
        telefonoField = new JTextField(20);
        cursoField = new JTextField(20);
        direccionField = new JTextField(20);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarEstudiante();
            }
        });

        // Crear panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(nombreField);
        panel.add(new JLabel("Apellido:"));
        panel.add(apellidoField);
        panel.add(new JLabel("Fecha de Nacimiento:"));
        panel.add(fechaNacimientoField);
        panel.add(new JLabel("DNI:"));
        panel.add(dniField);
        panel.add(new JLabel("Teléfono:"));
        panel.add(telefonoField);
        panel.add(new JLabel("Curso:"));
        panel.add(cursoField);
        panel.add(new JLabel("Dirección:"));
        panel.add(direccionField);
        panel.add(btnGuardar);

        // Agregar panel al marco
        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void guardarEstudiante() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/puntodigital", "tu_usuario", "tu_contraseña");

            String sql = "INSERT INTO estudiantes (nombre, apellido, fecha_nacimiento, dni, telefono, curso, direccion) VALUES (" + nombreField + ", " + apellidoField + ", " + fechaNacimientoField + ", " + dniField + ", " + telefonoField + ", " + cursoField + ", " + direccionField + ")";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombreField.getText());
            statement.setString(2, apellidoField.getText());
            statement.setString(3, fechaNacimientoField.getText());
            statement.setString(4, dniField.getText());
            statement.setString(5, telefonoField.getText());
            statement.setString(6, cursoField.getText());
            statement.setString(7, direccionField.getText());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Estudiante agregado correctamente");
                // Puedes limpiar los campos después de agregar el estudiante
                limpiarCampos();
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al ingresar estudiante");
            limpiarCampos();
        }
    }

    private void limpiarCampos() {
        nombreField.setText("");
        apellidoField.setText("");
        fechaNacimientoField.setText("");
        dniField.setText("");
        telefonoField.setText("");
        cursoField.setText("");
        direccionField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AltaEstudiantesApp();
            }
        });
    }
}
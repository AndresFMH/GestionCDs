/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestioncds;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author andre
 */
public class Ventana extends javax.swing.JFrame {
    ArrayList<Registro> r = new ArrayList<>();
    private ArrayList<String> canciones = new ArrayList<>();
    


    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtRegistro = new javax.swing.JLabel();
        txtArtista = new javax.swing.JLabel();
        txtNomArtista = new javax.swing.JTextField();
        txtAlbum = new javax.swing.JLabel();
        txtNomAlbum = new javax.swing.JTextField();
        txtGenero = new javax.swing.JLabel();
        txtGeneros = new javax.swing.JComboBox<>();
        txtCanciones = new javax.swing.JLabel();
        txtNomCanciones = new javax.swing.JTextField();
        btnAñadir = new javax.swing.JButton();
        txtCancionCD = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtCD = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtBuscador = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        txtBuscarpor = new javax.swing.JLabel();
        txtBusquedapor = new javax.swing.JComboBox<>();
        txtBusquedaresult = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(900, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 720));

        txtRegistro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRegistro.setText("REGISTRO DE CD");

        txtArtista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtArtista.setText("Nombre Artista:");

        txtAlbum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAlbum.setText("Nombre Album:");

        txtGenero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtGenero.setText("Genero:");

        txtGeneros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rock", "Electronica", "Pop", "Metal", "Reggaeton", "Rap", "Jazz", "Heavy Metal", "Ranchera" }));

        txtCanciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCanciones.setText("Canciones:");

        btnAñadir.setText("Añadir Cancion");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        txtCancionCD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCancionCD.setText("Canciones del CD");

        txtCD.setEditable(false);
        txtCD.setColumns(20);
        txtCD.setRows(5);
        jScrollPane7.setViewportView(txtCD);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtBuscador.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtBuscador.setText("BUSCADOR");

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBuscar.setText("Buscar:");

        txtBuscarpor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBuscarpor.setText("Buscar por:");

        txtBusquedapor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Artista", "Album"}));

        txtBusquedaresult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBusquedaresult.setText("Resultado de busqueda");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(txtBuscador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(186, 186, 186)
                                .addComponent(txtBuscarpor)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusquedapor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtArtista)
                            .addComponent(txtGenero))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(txtCancionCD))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomArtista)
                                    .addComponent(txtGeneros, 0, 130, Short.MAX_VALUE))
                                .addGap(143, 143, 143)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCanciones)
                                    .addComponent(txtAlbum))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomCanciones)
                                    .addComponent(txtNomAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnAñadir))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(txtRegistro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(txtBusquedaresult))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(btnGuardar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRegistro)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArtista)
                    .addComponent(txtNomArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlbum)
                    .addComponent(txtNomAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenero)
                    .addComponent(txtCanciones)
                    .addComponent(txtNomCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadir)
                    .addComponent(txtGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(txtCancionCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscador)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarpor)
                    .addComponent(txtBusquedapor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtBusquedaresult)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "¡CD REGISTRADO CON EXITO!");
        txtNomArtista.setText("");
        txtNomAlbum.setText("");
        txtNomCanciones.setText("");
        txtCD.setText("");
        canciones.clear();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
        String nomArtista, nomAlbum, Genero, Canciones;
        nomArtista = txtNomArtista.getText();
        nomAlbum = txtNomAlbum.getText();
        Canciones = txtNomCanciones.getText();
        Genero = txtGeneros.getSelectedItem().toString();
        canciones.add(Canciones);
        String texto = "Artista: " + nomArtista + "\nAlbum: " + nomAlbum + "\nGenero: " + Genero + "\nCanciones:\n";
        for (String cancion : canciones){
            texto += cancion + "\n";
        }
        txtCD.setText(texto);
        Registro r1 = new Registro(nomArtista, nomAlbum, Genero, Canciones);
        r.add(r1);

    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Obtiene el criterio de búsqueda y el campo a buscar
        String criterio = txtBusqueda.getText().trim();
        String buscarPor = txtBusquedapor.getSelectedItem().toString();

        // Variable para almacenar el resultado de la búsqueda
        StringBuilder resultado = new StringBuilder();

        // Itera a través de los registros y busca coincidencias
        boolean encontrado = false;
        for (Registro registro : r) {
            if (("Artista".equals(buscarPor) && registro.getNomArtista().equalsIgnoreCase(criterio)) ||
                ("Album".equals(buscarPor) && registro.getNomAlbum().equalsIgnoreCase(criterio))) {
                resultado.append("Artista: ").append(registro.getNomArtista()).append("\n");
                resultado.append("Album: ").append(registro.getNomAlbum()).append("\n");
                resultado.append("Genero: ").append(registro.getGenero()).append("\n");
                resultado.append("Canciones: ").append(registro.getCanciones()).append("\n\n");
                encontrado = true;
            }
        }

         // Si se encontraron resultados, muestra el resultado en el JTextArea
         // Si no se encontraron resultados, muestra un mensaje en JOptionPane y borra el contenido del JTextArea
        if (encontrado) {
            txtResultado.setText(resultado.toString());
        } else {
            JOptionPane.showMessageDialog(this, "CD NO REGISTRADO");
            txtResultado.setText(""); // Borra el contenido del JTextArea
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtAlbum;
    private javax.swing.JLabel txtArtista;
    private javax.swing.JLabel txtBuscador;
    private javax.swing.JLabel txtBuscar;
    private javax.swing.JLabel txtBuscarpor;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JComboBox<String> txtBusquedapor;
    private javax.swing.JLabel txtBusquedaresult;
    private javax.swing.JTextArea txtCD;
    private javax.swing.JLabel txtCancionCD;
    private javax.swing.JLabel txtCanciones;
    private javax.swing.JLabel txtGenero;
    private javax.swing.JComboBox<String> txtGeneros;
    private javax.swing.JTextField txtNomAlbum;
    private javax.swing.JTextField txtNomArtista;
    private javax.swing.JTextField txtNomCanciones;
    private javax.swing.JLabel txtRegistro;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
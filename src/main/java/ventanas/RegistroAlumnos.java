/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;
import java.sql.*;
import javax.swing.JOptionPane;
//importamos esto de pdf
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

//esto para manejar insersion de imagenes 
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;


import java.io.FileOutputStream;
/**
 *
 * @author Lenovo
 */
public class RegistroAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form RegistroAlumnos
     */
    public RegistroAlumnos() {
        initComponents();
        //centrar la apicacion
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_grupo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        brnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo_alumno = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Grupo:");

        txt_grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_grupoActionPerformed(evt);
            }
        });

        btnAgregar.setText("Registrar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        brnModificar.setText("Modificar");
        brnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresa el codigo del alumno:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnReporte.setText("Generar reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAgregar)
                                        .addGap(18, 18, 18)
                                        .addComponent(brnModificar)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnEliminar)
                                        .addGap(27, 27, 27)
                                        .addComponent(btnReporte))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_codigo_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label_status))
                            .addComponent(btnBuscar))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(brnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnReporte))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_codigo_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_status)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_grupoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txt_grupoActionPerformed

    private void brnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnModificarActionPerformed
        // TODO add your handling code here:
        
         try{
            //obtenemos los datos del formulario
            String id=txt_codigo_alumno.getText().trim();
            String nombre=txt_nombre.getText().trim();
            String grupo=txt_grupo.getText().trim();
            //conexion a base de datos
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/javawikipedia","root","");
            PreparedStatement pst= cn.prepareStatement("UPDATE  alumnos SET nombreAlumno=?,grupo=? WHERE id="+id);
            
           
           
            //SE PASAN YA NO ES COMO EN DB SI NO EN EL ORDEN ES MAS TIPO PYTHON 1NOMBRE,2GRUPO 3 ID EN EL ORDEN DEL QUERY
            pst.setString(1, nombre);
            pst.setString(2, grupo);
            pst.executeUpdate();
            
            label_status.setText("actualizado exitosamente");
            
            
           
           
         }catch(Exception e){
             
         }
    }//GEN-LAST:event_brnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
         try{
            //conexion a base de datos
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/javawikipedia","root","");
            PreparedStatement pst= cn.prepareStatement("SELECT * FROM alumnos WHERE id=?");
            //1 es el campo id en la tabla 1 id 2 nombre 3 grupo y estamos buscando por id
            pst.setString(1, txt_codigo_alumno.getText().trim());
            //nos permite recibir el resultado de la consulta que realizo
            ResultSet rs=pst.executeQuery();
            //si encuentra registro
            if(rs.next()){
                //asignamos al input el campo de la db
                txt_nombre.setText(rs.getString("nombreAlumno"));
                txt_grupo.setText(rs.getString("grupo"));
            }else{
                
                //si no esta sacamos una alerta de que no existe
                JOptionPane.showMessageDialog(rootPane, "Alumno no registrado");
                
            }
            
            
                    
            
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        try{
            //conexion a base de datos
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/javawikipedia","root","");
            PreparedStatement pst= cn.prepareStatement("INSERT INTO alumnos VALUES(?,?,?)");
            //LOS CAMPOS DE LA DB COMO POSICIONES 1 ES ID Y PASAMOS UN VALOR CERO YA QUE ES AUTO INCREMENTAL
            pst.setString(1, "0");
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_grupo.getText().trim());
            //ejecutamos query
            pst.executeUpdate();
            
            //limpiamos los cajones para meter nuevos datos
            txt_nombre.setText("");
            txt_grupo.setText("");
            label_status.setText("agregado exitosamente");
            
            
                    
            
            
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        
         try{
            //conexion a base de datos
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/javawikipedia","root","");
            PreparedStatement pst= cn.prepareStatement("DELETE FROM alumnos WHERE id=?");
            //1 es el campo id en la tabla 1 id 2 nombre 3 grupo y estamos buscando por id
            pst.setString(1, txt_codigo_alumno.getText().trim());
            //ejecutamos el query
            pst.executeUpdate();
            
            
            //dejamos los campos en blanco y luego mostramos el laborl de eliminado exitoso
            txt_codigo_alumno.setText("");
            txt_grupo.setText("");
            txt_nombre.setText("");
            
            label_status.setText("Eliminado exitosamente");
                    
            
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
        Document documento= new Document();
        try{
            
            String ruta=System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Desktop/reporte_alumnos.pdf"));
            //ruta donde esta la imagen
         
            Image header = Image.getInstance("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\crudwikipedia\\src\\main\\java\\imagenheader\\header.png");
            //escala de visualizacion de la imagen
            header.scaleToFit(650,1000);
            //la alineamos al centro
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            //agregamos el parrafo
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("formato creado por camilo \n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma",18,Font.BOLD,BaseColor.DARK_GRAY));
            parrafo.add("alumnos registrados \n\n");
            
            //abrimos el docu para trabajarlo
            documento.open();
            //agregamos la imagen y el parrafo
            documento.add(header);
            documento.add(parrafo);
            
            //le decimos que tenemos 3 columnas
            PdfPTable tabla= new PdfPTable(3);
            //esto es para escribir celdas entonces iniciamos con los encabezados
            tabla.addCell("Codigo");
            tabla.addCell("Alumno");
            tabla.addCell("Grupo");
            
            
                        //ahora creamos la conexion
                         try{
                        //conexion a base de datos
                        Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/javawikipedia","root","");
                        PreparedStatement pst= cn.prepareStatement("SELECT * FROM alumnos");
                        //obtenemos los datos
                        ResultSet rs = pst.executeQuery();
                        
                        //si encuentra datos
                        if(rs.next()){
                           do{
                               
                               //empezamos agregar los registros de la db
                               //LAS COLUMNAS DE DB 1 ES ID 2 NOMBRE 3 GRUPO
                               tabla.addCell(rs.getString(1));
                               tabla.addCell(rs.getString(2));
                               tabla.addCell(rs.getString(3));
                               
                           } while(rs.next());
                          //CUANDO TERMINE DE AGREGARLOS AHORA SI LO METEMOS A LA TABLA
                          documento.add(tabla);
                           
                           
                        }
                        
                       



                    }catch(Exception e){

                    }
                         
                         
            //cerramos el documento           
            documento.close();
            JOptionPane.showMessageDialog(rootPane, "Reporte generado exitosamente");
            
        }catch(Exception e){
            
            
        }        
    }//GEN-LAST:event_btnReporteActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnModificar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_codigo_alumno;
    private javax.swing.JTextField txt_grupo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appencriptaruserpassword;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hezeballos
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * VARIABLES GLOBALES PARA USO DE TODA LA PANTALLA.
     */    
    DefaultTableModel modeloTabla;
    public String Ruta="";
    public PantallaPrincipal() {
        
        initComponents();
        /**************************************************/   
        /************CREACION DE VARIABLE******************/   
        /**************************************************/           
        String retorna;        
        JFileChooser chooser = new JFileChooser(); 
        JFrame jFrame1 = null;
        modeloTabla = (DefaultTableModel) jTable1.getModel();                
        
        try {
                        
            chooser.setCurrentDirectory(new java.io.File("."));  //Indicamos la ruta para el JFileChooser
            chooser.setSelectedFile(new File(""));               
            chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            if (chooser.showOpenDialog(jFrame1) == JFileChooser.OPEN_DIALOG) 
                Ruta = ( chooser.getSelectedFile().toString() ); //Obtenemos el archivo.  

            /****** Realizamos la validacion que el Archivo Existe ******/
            File fichero = new File(Ruta);
            if (fichero.exists())
            {
                retorna = metodoControlEncriptacion("L",""); // Realiza lectura del metodo de encriptacion.
                if (validarAcceso(retorna))                  //Si logra retornar el archivo desencriptador 
                   agregarModeloTabla(retorna);              //Se agrega a la tabla.
            }                
            else
            {           
                JOptionPane.showMessageDialog(null,
                "El Archivo Seleccionado no existe!",
                "No Existe Archivo",
                JOptionPane.INFORMATION_MESSAGE);
                Ruta = "";
            }                   
        } catch (Exception ex) {
           System.out.println("[ERROR] - Constructor PantallaPrincipal: " +  ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contraseñas Encriptada");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "Aplicacion"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Usuario:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Contraseña:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hezeballos\\Documents\\NetBeansProjects\\AppEncriptarUserPassword\\src\\appencriptaruserpassword\\check.png")); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Aplicacion");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hezeballos\\Documents\\NetBeansProjects\\AppEncriptarUserPassword\\src\\appencriptaruserpassword\\delete.png")); // NOI18N
        jButton2.setText("Eliminar Registro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Buscar:");

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hezeballos\\Documents\\NetBeansProjects\\AppEncriptarUserPassword\\src\\appencriptaruserpassword\\menu.png")); // NOI18N
        jMenu1.setText("Menu");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hezeballos\\Documents\\NetBeansProjects\\AppEncriptarUserPassword\\src\\appencriptaruserpassword\\create.png")); // NOI18N
        jMenuItem1.setText("Crear Archivo Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hezeballos\\Documents\\NetBeansProjects\\AppEncriptarUserPassword\\src\\appencriptaruserpassword\\open.png")); // NOI18N
        jMenuItem2.setText("Abrir Archivo Existente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hezeballos\\Documents\\NetBeansProjects\\AppEncriptarUserPassword\\src\\appencriptaruserpassword\\help.png")); // NOI18N
        jMenuItem3.setText("Ayuda");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String usuario = jTextField1.getText();
        String passwor = jTextField2.getText();
        String aplicac = jTextField3.getText();
        String valorEncriptar = "";
        try {
            valorEncriptar = concatenaMensaje( usuario,  passwor,  aplicac );
            agregarModeloTabla(valorEncriptar);
            metodoControlEncriptacion("E", valorEncriptar);
            metodoControlEncriptacion("L","");
        } catch (Exception ex) {
             System.out.println("[ERROR] -- jButton1ActionPerformed: " + ex.getMessage() );
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    metodoLimpieza();    
    String sb = "";
    JFileChooser chooser = new JFileChooser();    
    chooser.setCurrentDirectory(new java.io.File("."));
    int retrival = chooser.showSaveDialog(null);
    if (retrival == JFileChooser.APPROVE_OPTION) {
        try {            
            Ruta = chooser.getSelectedFile()+".txt";            
            File fichero = new File(Ruta);
            if (fichero.exists())
            {
                  JOptionPane.showMessageDialog(null,
                  "El Archivo Existe No Podemos Sobre Escribirlo",
                  "La Ruta Existe",
                  JOptionPane.ERROR_MESSAGE);
                  Ruta = "";
            }                
              else
            {           
                FileWriter fw = new FileWriter(chooser.getSelectedFile()+".txt");
                fw.write(sb.toString());                
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("[ERROR] -- jMenuItem1ActionPerformed: " + chooser.getSelectedFile()+".txt");
        }
    }
    
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        metodoLimpieza();
        try {
            String retorna="";
            JFileChooser chooser = new JFileChooser(); 
            JFrame jFrame1 = null;
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setSelectedFile(new File(""));
            chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            if (chooser.showOpenDialog(jFrame1) == JFileChooser.OPEN_DIALOG) 
              Ruta = ( chooser.getSelectedFile().toString() );                                       
            
            /****** Realizamos la validacion que el Archivo Existe ******/
            File fichero = new File(Ruta);
            if (fichero.exists())
            {
                retorna = metodoControlEncriptacion("L",""); // Realiza lectura del metodo de encriptacion.
                if (validarAcceso(retorna))                  //Si logra retornar el archivo desencriptador 
                   agregarModeloTabla(retorna);              //Se agrega a la tabla.
            }                
            else
            {           
                JOptionPane.showMessageDialog(null,
                "El Archivo Seleccionado no existe!",
                "No Existe Archivo",
                JOptionPane.INFORMATION_MESSAGE);
                Ruta = "";
            } 
        } catch (Exception ex) {
           System.out.println("[ERROR] -- jMenuItem2ActionPerformed:" +  ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
                JOptionPane.showMessageDialog(null,
                "El menu tiene 2 opciones \n 1. Crear un archivo nuevo:\n\tSe crea un archivo nuevo en la ruta selecionada con el nombre proporcionado."
                                                                     + "\n\tLa primera contraseña que debemos guardar es la del admin del archivo ejemplo:"
                                                                     + "\n\tUsuario: admin -- Contraseña:miprimeracontraseña -- Aplicacion: Encriptacion en Java"
                                         +"\n\n 2. Abrir un archivo nuevo:\n\tAl abrir un archivo, debemos seleccionarlo en la opcion 'Abrir Archivo Existente'"
                                                                     + "\n\tLo primero que nos muestra es la opcion para seleccionar dicho archivo."
                                                                     + "\n\tAhora debemos colocar el primer password que hemos colocado cuando se creo el archivo.",
                "Ayuda",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if (jTable1.getSelectedRow() ==0)
            JOptionPane.showMessageDialog(null,
            "No puedes eliminar la clave del ARCHIVO!",
            "ERROR",
            JOptionPane.ERROR_MESSAGE);
        else
        if (jTable1.getSelectedRow() <0)
            JOptionPane.showMessageDialog(null,
            "Debes seleccionar un registro de la tabla!",
            "ERROR",
            JOptionPane.ERROR_MESSAGE);        
        else
        {
            metodoEliminaUnRegistro(jTable1.getSelectedRow());

            String valorEncriptar = "";
            try {
                valorEncriptar = concatenaMensaje( "",  "",  "" );
                agregarModeloTabla(valorEncriptar);
                metodoControlEncriptacion("E", valorEncriptar);
                metodoControlEncriptacion("L","");
            } catch (Exception ex) {
                 System.out.println("[ERROR] -- jButton2ActionPerformed: " + ex.getMessage() );
            }        
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    
    public String metodoControlEncriptacion(String operacion, String valorEncriptar) throws Exception
    {
        
            String  retorno = "";                     
            desencriptar obj = new desencriptar();
            try  
            {
                /******************ENCRIPTA LAS CONTRASEÑAS**********************/
                /****************************************************************/
                if (operacion.equals("E"))
                   obj.escribirArchivo(obj.cifra(valorEncriptar),Ruta);
                
                /******************DES-ENCRIPTA LAS CONTRASEÑAS**********************/
                /****************************************************************/                
                if (operacion.equals("L"))
                {
                  byte[] array = Files.readAllBytes(new File(Ruta).toPath()); 
                  retorno =obj.descifra(array);
                }
 
             } catch (IOException e) 
             {
                 System.out.println("[ERROR] -- metodoControlEncriptacion: " + e.getMessage() );
             }    
            
        return retorno;
    }
    public void metodoLimpieza()
    {
        int filas = modeloTabla.getRowCount();
        for (int indice = 1; indice<=filas; indice++)
           modeloTabla.removeRow(0);
    }
    
    public void metodoEliminaUnRegistro(Integer Elimina)
    {       
        if (Elimina > 0 )
          modeloTabla.removeRow(Elimina);
    }    

    
     public void agregarModeloTabla(String archivoLectura)
     {
         metodoLimpieza();
         String archivoLecturaArray [] = archivoLectura.split("\n");         
         for(int indice = 0; indice < archivoLecturaArray.length; indice++)
         {
          String lineaLecturaArray [] = archivoLecturaArray[indice].split("\\^");
          modeloTabla.addRow(new Object[]{lineaLecturaArray[0],lineaLecturaArray[1],lineaLecturaArray[2]});
         }     
    }
     
     public boolean validarAcceso(String archivoLectura)
     {
         metodoLimpieza();
         String archivoLecturaArray [] = archivoLectura.split("\n");              
         String lineaLecturaArray [] = archivoLecturaArray[0].split("\\^");
         String contraseñaAdmin = JOptionPane.showInputDialog("Contraseña admin:");
          if (contraseñaAdmin.equals(lineaLecturaArray[1]))
              return true;
          else 
          {
              Ruta="";
              return false;                     
          }    
     }     
     
     
 public String concatenaMensaje(String usuario, String passwor, String aplicac )
    {
        String concatena="";
             for (int indice = 0; indice < modeloTabla.getRowCount(); indice++)
                 concatena=concatena+modeloTabla.getValueAt(indice, 0) + "^" + modeloTabla.getValueAt(indice, 1) + "^" + modeloTabla.getValueAt(indice, 2) + "^"+"\n";             
             if (usuario.length()>0 && passwor.length()>0 && aplicac.length()>0)
                concatena=concatena+usuario + "^" + passwor + "^" + aplicac + "^"+"\n";      
             else
                System.out.println("usuario, pass, aplica en blacno");
       return concatena;
    }
 
 
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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

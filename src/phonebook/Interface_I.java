package phonebook;

import Conn_db.Conexion;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;




/**
 *
 * @author JEscalona
 */

public class Interface_I extends javax.swing.JFrame {

    //Instancia de conexion 
    Conexion cn =new Conexion();
    Connection Conn;
   // DefaultTableModel  modelo;
    
    
    /* PERTENECE A table_datos();
    // String [] Titulos = {"name", "surname", "GEO","phone", "extension"};
    // DefaultTableModel dtm_datos = new DefaultTableModel();
    // TableRowSorter<TableModel>trs;
    // String[][] M_datos;
    */
    
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    
 
    public Interface_I() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/1-ISOTIPO XDV pequeño.png")).getImage());
        setLocationRelativeTo(null);
        query();
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
        Pantalla = new javax.swing.JPanel();
        jBuscar = new javax.swing.JTextField();
        btn_log = new javax.swing.JButton();
        LOGOX = new javax.swing.JLabel();
        LOGOC = new javax.swing.JLabel();
        LOGOG = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Footer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pantalla.setBackground(new java.awt.Color(252, 249, 249));

        jBuscar.setBackground(new java.awt.Color(250, 237, 237));
        jBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBuscar.setForeground(new java.awt.Color(102, 102, 102));
        jBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jBuscar.setSelectionColor(new java.awt.Color(255, 102, 0));
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        jBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jBuscarKeyTyped(evt);
            }
        });

        btn_log.setBackground(new java.awt.Color(255, 204, 204));
        btn_log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log-in.png"))); // NOI18N
        btn_log.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_logMousePressed(evt);
            }
        });
        btn_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logActionPerformed(evt);
            }
        });

        LOGOX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1-ISOTIPO XDV pequeño.png"))); // NOI18N

        LOGOC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3-ISOTIPO LOGI pequeño.png"))); // NOI18N

        LOGOG.setBackground(new java.awt.Color(0, 0, 0));
        LOGOG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2-ISOTIPO CROMATIKA pequeño.png"))); // NOI18N

        Table.setBackground(new java.awt.Color(250, 237, 237));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        Table.setGridColor(new java.awt.Color(200, 200, 200));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        Footer.setBackground(new java.awt.Color(204, 204, 204));
        Footer.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Footer.setForeground(new java.awt.Color(102, 102, 102));
        Footer.setText("PhoneBook © Todos los derechos reservados. XDV | Designed by JE  ");

        javax.swing.GroupLayout PantallaLayout = new javax.swing.GroupLayout(Pantalla);
        Pantalla.setLayout(PantallaLayout);
        PantallaLayout.setHorizontalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaLayout.createSequentialGroup()
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_log, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PantallaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(LOGOX, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LOGOG, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(LOGOC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGap(26, 26, 26))
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addComponent(Footer)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        PantallaLayout.setVerticalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_log, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LOGOG, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LOGOC, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LOGOX, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jPanel1.add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 360, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/table.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logActionPerformed
        // btn_login
        
        Login Lg =new Login();
        Lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_logActionPerformed

    /*
    public void datos_tabla(){
        int contador = 0;
        try {
            Statement st_cont = Conn.createStatement();
            ResultSet rs_cont = st_cont.executeQuery(" SELECT *FROM p_list_phone");
            
            int cont = 0;
            M_datos = new String[contador][5];
            while (rs.next()){
                M_datos[cont][0] = rs.getString("name");
                M_datos[cont][1] = rs.getString("surname");
                M_datos[cont][2] = rs.getString("GEO");
                M_datos[cont][3] = rs.getString("phone");
                M_datos[cont][4] = rs.getString("extension");
                cont = cont + 1;
                
            }
            
            
        } catch (Exception e) {
           // Logger.getLogger(vistal.class.getName()).log(Level.SERVERE,null, ex);
        }
        
    }*/
    
    
    private void jBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarKeyReleased
        // Busqueda en tiempo real
            if(jBuscar.getText().trim().equals("")); {
            query();
    }
            
    }//GEN-LAST:event_jBuscarKeyReleased

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        // seatch
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarKeyTyped

    private void jBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarKeyPressed
        // TODO add your handling code here:
        if(evt.getExtendedKeyCode()== KeyEvent.VK_ENTER ){
            query();
        }
        
    }//GEN-LAST:event_jBuscarKeyPressed

    private void btn_logMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logMouseEntered
        // Efecto HOVER
        btn_log.setBackground(new Color(210,127,127));
    }//GEN-LAST:event_btn_logMouseEntered

    private void btn_logMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logMouseExited
        // Salida de Efecto HOVER:
        btn_log.setBackground(new Color(255,204,204));
    }//GEN-LAST:event_btn_logMouseExited

    private void btn_logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logMouseClicked

    private void btn_logMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logMousePressed
        // TODO add your handling code here:
        btn_log.setBackground(new Color(210,127,127));
    }//GEN-LAST:event_btn_logMousePressed

    private void TableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TableMouseEntered

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
            java.util.logging.Logger.getLogger(Interface_I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_I().setVisible(true);
            }
        });
    }
   

   private void query (){
       String busqueda = jBuscar.getText();
               
       DefaultTableModel modelo = new DefaultTableModel();
       
       modelo.addColumn("");
       //modelo.addColumn("Apellido");
       //modelo.addColumn("GEO");
       //modelo.addColumn("Phone");
       //modelo.addColumn("Extension");
       
       Table.setModel(modelo);
       Table.getColumnModel().getColumn(0);
       
       //Ajuste de Altura row
       Table.setRowHeight(50);
       Table.setEnabled(false);
       
       //Table.getColumnModel().getColumn(1);
       //Table.getColumnModel().getColumn(2);
       //Table.getColumnModel().getColumn(3);
       //Table.getColumnModel().getColumn(4);
       
       String sql = "SELECT *FROM p_list_phone WHERE NAME LIKE '%"+busqueda+"%' OR SURNAME LIKE '%"+busqueda+"%' OR GEO LIKE '%"+busqueda+"%' OR PHONE LIKE '%"+busqueda+"%' OR EXTENSION LIKE '%"+busqueda+"%' ";
       
       String datos [] = new String[5];
       
       try {
            Conn = cn.conectar();
            st = Conn.createStatement();
            rs = st.executeQuery(sql);
           
           while (rs.next()){
               datos [0] = ("  ").concat(rs.getString("name")).concat("  ").concat(rs.getString("surname")).concat("  ").concat(rs.getString("extension"));
               //datos [1] = rs.getString("surname");
               //datos [2] = rs.getString("GEO");
               //datos [3] = rs.getString("phone");
               //datos [4] = rs.getString("extension");
               
               modelo.addRow(datos);
           }
           
           Table.setModel(modelo);
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
       } /*finally {
           cn.desconectar();
       }*/
       
   }
   
   
    
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Footer;
    private javax.swing.JLabel LOGOC;
    private javax.swing.JLabel LOGOG;
    private javax.swing.JLabel LOGOX;
    private javax.swing.JPanel Pantalla;
    private javax.swing.JTable Table;
    private javax.swing.JButton btn_log;
    private javax.swing.JTextField jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

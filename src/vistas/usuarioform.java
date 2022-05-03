/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.UsurioDAO;
import modelo.entidadUsuario;

/**
 *
 * @author GAMER
 */
public class usuarioform extends javax.swing.JInternalFrame {

    
    entidadUsuario enu=new entidadUsuario();
    UsurioDAO udao= new UsurioDAO();
   DefaultTableModel modelo=new DefaultTableModel();
   
    public usuarioform() {
        initComponents();
        listaru();
    }
    public void listaru(){
    
     
   List <entidadUsuario> lista= udao.listarusuario();
    modelo = (DefaultTableModel)tablausuario.getModel();
        
        Object[] ob = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId_vendedor();
            ob[1] = lista.get(i).getIdentificacion();
            ob[2] = lista.get(i).getNomre();
            ob[3] = lista.get(i).getTelefono();
            ob[4] = lista.get(i).getEstado();
            ob[5] = lista.get(i).getUser();
           
            modelo.addRow(ob);

        }
       tablausuario.setModel(modelo);

    
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtid_us = new javax.swing.JTextField();
        txtnomusu = new javax.swing.JTextField();
        txtidentiusu = new javax.swing.JTextField();
        txttelusu = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        btbactualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btningresar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuario = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("usuario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("id");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Identificacion:");

        jLabel5.setText("telefono:");

        jLabel6.setText("Estado:");

        jLabel7.setText("Usuario:");

        btbactualizar.setText("ACTUALIZAR");
        btbactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbactualizarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btningresar.setText("INGRESAR");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR");
        btneliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarMouseClicked(evt);
            }
        });
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jButton5.setText("NUEVO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtid_us, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnomusu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtidentiusu, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txttelusu, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btbactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btningresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtid_us, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btningresar))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtidentiusu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnomusu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txttelusu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btbactualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, -1, -1));

        tablausuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_usuario", "identificacion", "nombre", "Telefono", "Estado", "Usuario"
            }
        ));
        tablausuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablausuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablausuario);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 288, -1, 236));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
          if (!"".equals(txtnomusu.getText()) || !"".equals(txtidentiusu.getText()) ) {

            
               
                enu.setIdentificacion(txtidentiusu.getText());
                 enu.setNomre(txtnomusu.getText());
                enu.setTelefono(txttelusu.getText());
                enu.setEstado(txtestado.getText());
               enu.setUser(txtuser.getText());
                udao.RegistrarU(enu);
                limpiarTabla();
                limppiaruausuario();
                listaru();
               
                 
                JOptionPane.showMessageDialog(null, "cliente regidtrado");

            } else {

                JOptionPane.showMessageDialog(null, "no se pudo registrrar ningun cliente");
            }
    }
            public void limpiarTabla (){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i=i-1;
        }
     
    }//GEN-LAST:event_btningresarActionPerformed

    private void btbactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbactualizarActionPerformed
    
            if ("".equals(txtid_us.getText())) {
            JOptionPane.showMessageDialog(null, "selecione una fila");

        } else {
            if (((!"".equals(txtidentiusu.getText()) || !"".equals(txtnomusu.getText())) || !"".equals(txttelusu.getText()) || !"".equals(txtestado.getText()) || !"".equals(txtuser.getText()))) {
                
                enu.setIdentificacion(txtidentiusu.getText());
                enu.setNomre(txtnomusu.getText());
                enu.setTelefono(txttelusu.getText());
               enu.setEstado(txtestado.getText());
                  enu.setUser(txtuser.getText());
                enu.setId_vendedor(Integer.parseInt(txtid_us.getText()));
                
                udao.Modificarusuario(enu);
                limpiarTabla();
                limppiaruausuario();
                try {
                    listaru();
                } catch (Exception e) {
                }

            } else {
                if ((("".equals(txtid_us.getText()) || "".equals(txtidentiusu.getText()) || "".equals(txtnomusu.getText())  || "".equals(txttelusu.getText()) || "".equals(txtestado.getText()) || "".equals(txtuser.getText())))) {
                    
                }else{
                JOptionPane.showMessageDialog(null, "los campos estan vacios");
                
            }

        }
            }
    }//GEN-LAST:event_btbactualizarActionPerformed

    private void tablausuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablausuarioMouseClicked
        int fila=tablausuario.rowAtPoint(evt.getPoint());
        txtid_us.setText(tablausuario.getValueAt(fila,0).toString());
       
      txtidentiusu.setText(tablausuario.getValueAt(fila,1).toString());
       txtnomusu.setText(tablausuario.getValueAt(fila,2).toString());
        txttelusu.setText(tablausuario.getValueAt(fila,3).toString());
        txtestado.setText(tablausuario.getValueAt(fila,4).toString());
       txtuser.setText(tablausuario.getValueAt(fila,5).toString());
    }//GEN-LAST:event_tablausuarioMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
       
        // TODO add your handling code here:
        if ("".equals(txtid_us.getText())) {
            JOptionPane.showMessageDialog(null, "seleccione una fila");

        }else{
        
        
        if ( !"".equals(txtid_us.getText())){
        
        int pregunta=JOptionPane.showConfirmDialog(null, "¡Desea eliminar");
            if (pregunta==0) {
                int id=Integer.parseInt(txtid_us.getText());
                udao.eliminarusuario(id);
                limpiarTabla();
                limppiaruausuario();
                listaru();
                
            }
        }
                
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarUsuario();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btneliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       limppiaruausuario();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   principal p= new principal();
   p.setVisible(true);
   
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btbactualizar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btneliminar;
    public javax.swing.JButton btningresar;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton5;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablausuario;
    public javax.swing.JTextField txtestado;
    public javax.swing.JTextField txtid_us;
    public javax.swing.JTextField txtidentiusu;
    public javax.swing.JTextField txtnomusu;
    public javax.swing.JTextField txttelusu;
    public javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables

private void limppiaruausuario(){
    txtid_us.setText("");

txtidentiusu.setText("");
txtnomusu.setText("");
txttelusu.setText("");
txtestado.setText("");
txtuser.setText("");
}
public void buscarUsuario() {

        if (!"".equals(txtidentiusu.getText())) {
            String identificacion = txtidentiusu.getText();
          udao.BuscarUsuario(identificacion);

            if (enu.getNomre()!= null) {
              txtnomusu.setText(" " + enu.getNomre());
                txttelusu.setText(" " + enu.getTelefono());
                txtestado.setText(" " + enu.getEstado());
                txtuser.setText(" " + enu.getUser());
               

            } else {

                txtidentiusu.requestFocus();

            }

        }

    }
}
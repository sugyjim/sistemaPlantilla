/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.producto;
import modelo.productoDAO;

/**
 *
 * @author GAMER
 */
public class productoform extends javax.swing.JInternalFrame {
producto p= new producto();
    productoDAO pdao= new productoDAO();
   
      DefaultTableModel modelo= new DefaultTableModel();
   
    public productoform() {
        initComponents();
        listarp();
    }
    
    
    public void listarp(){
    
     List <producto> lista;
    lista = pdao.listarproducto();
    modelo = (DefaultTableModel)tablapro.getModel();
        
        Object[] ob = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId_producto();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getPrecio();
             ob[3] = lista.get(i).getStock();
            ob[4] = lista.get(i).getEstado();
           
            modelo.addRow(ob);

        }
       tablapro.setModel(modelo);

    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapro = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtidp = new javax.swing.JTextField();
        txtnombrep = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        btningrep = new javax.swing.JButton();
        btnbusp = new javax.swing.JButton();
        btnnuevp = new javax.swing.JButton();
        txtelimp = new javax.swing.JButton();
        btnactuap = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("producto");

        tablapro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_producto", "Nombre", "Precio", "Stock", "estado"
            }
        ));
        tablapro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablapro);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        jLabel1.setText("id");

        jLabel2.setText("nombre");

        jLabel3.setText("precio");

        jLabel4.setText("stock");

        jLabel5.setText("estado");

        txtidp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpActionPerformed(evt);
            }
        });

        btningrep.setText("ingresar");
        btningrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningrepActionPerformed(evt);
            }
        });

        btnbusp.setText("buscar");
        btnbusp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuspActionPerformed(evt);
            }
        });

        btnnuevp.setText("nuevo");
        btnnuevp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevpActionPerformed(evt);
            }
        });

        txtelimp.setText("eliminar");
        txtelimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtelimpActionPerformed(evt);
            }
        });

        btnactuap.setText("actualizar");
        btnactuap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactuapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtidp, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(txtnombrep)
                    .addComponent(txtprecio)
                    .addComponent(txtstock)
                    .addComponent(txtestado))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btningrep)
                    .addComponent(btnbusp)
                    .addComponent(btnactuap))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnuevp)
                    .addComponent(txtelimp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnactuap))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtidp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btningrep)
                            .addComponent(btnnuevp))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtnombrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnbusp)
                                    .addComponent(txtelimp))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuspActionPerformed
        buscarproducto();
    }//GEN-LAST:event_btnbuspActionPerformed

    private void btningrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningrepActionPerformed
        ingresar();
    }//GEN-LAST:event_btningrepActionPerformed

    private void txtidpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpActionPerformed

    private void btnnuevpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevpActionPerformed
       limpiarproducto();
    }//GEN-LAST:event_btnnuevpActionPerformed

    private void txtelimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtelimpActionPerformed
        if (!"".equals(txtidp.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "??estas seguro de eliminar producto?");

            if (pregunta == 0) {
                int id = Integer.parseInt(txtidp.getText());
               pdao.eliminarproducto(id);
              limpiarTabla();
              limpiarproducto();
                listarp();
                 

            }

        }    
    }//GEN-LAST:event_txtelimpActionPerformed

    private void tablaproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproMouseClicked
         int fila = tablapro.rowAtPoint(evt.getPoint());
        txtidp.setText(tablapro.getValueAt(fila, 0).toString());
        txtnombrep.setText(tablapro.getValueAt(fila, 1).toString());
        txtprecio.setText(tablapro.getValueAt(fila, 2).toString());
     
        txtstock.setText(tablapro.getValueAt(fila, 3).toString());
        txtestado.setText(tablapro.getValueAt(fila, 4).toString());  
    }//GEN-LAST:event_tablaproMouseClicked

    private void btnactuapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactuapActionPerformed
         if ("".equals(txtidp.getText())) {
            JOptionPane.showMessageDialog(null, "seleccione una fila");

        } else {

            if (!"".equals(txtnombrep.getText()) || !"".equals(txtprecio.getText())  || !"".equals(txtstock.getText()) || !"".equals(txtestado.getText())) {

                p.setNombre(txtnombrep.getText());
                p.setPrecio(Double.parseDouble(txtprecio.getText()));
               
                p.setStock(Integer.parseInt(txtstock.getText()));
                p.setEstado(txtestado.getText());
                p.setId_producto(Integer.parseInt(txtidp.getText()));
                pdao.Modificarproducto(p);
                JOptionPane.showMessageDialog(null, "producto actualizado");
               limpiarTabla();
                limpiarproducto();
               listarp();

            }
        }
    }//GEN-LAST:event_btnactuapActionPerformed
void buscarproducto(){

        if (!"".equals(txtidp.getText())) {
           int cod = Integer.parseInt(txtidp.getText());
            p = pdao.BuscarPro(cod);
            if (p.getId_producto()!= 0) {
                txtnombrep.setText(p.getNombre());
                txtprecio.setText(" " + p.getPrecio());
                txtstock.setText(" " + p.getStock());
                txtestado.setText(p.getEstado());
               
                txtnombrep.requestFocus();

            } else {

               

            


            }
    
        }
}
    
   void ingresar(){
     if (!"".equals(txtnombrep.getText()) || !"".equals(txtprecio.getText()) ) {

            

                p.setNombre(txtnombrep.getText());
                p.setPrecio(Integer.parseInt(txtprecio.getText()));
                p.setStock(Integer.parseInt(txtstock.getText()));
                p.setEstado(txtestado.getText());
               
                pdao.RegistrarProducto(p);
              limpiarTabla();
              limpiarproducto();
               listarp();
                 
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
      }
    private void limpiarproducto(){
    txtidp.setText("");
txtnombrep.setText("");
txtprecio.setText("");
txtstock.setText("");
txtestado.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactuap;
    private javax.swing.JButton btnbusp;
    private javax.swing.JButton btningrep;
    private javax.swing.JButton btnnuevp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablapro;
    private javax.swing.JButton txtelimp;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtidp;
    private javax.swing.JTextField txtnombrep;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrab1;

import javax.swing.JOptionPane;
import java.math.*;
/**
 *
 * @author Jorge Salazar
 */
public class Hoja extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Hoja() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        result = new javax.swing.JTextField();
        opera1 = new javax.swing.JButton();
        opera2 = new javax.swing.JButton();
        opera3 = new javax.swing.JButton();
        opera4 = new javax.swing.JButton();
        input1 = new javax.swing.JTextField();
        input2 = new javax.swing.JTextField();
        input3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Input 1");

        jLabel3.setText("Input 2");

        jLabel4.setText("Input 3");

        jLabel5.setText("Resultado");

        opera1.setText("Operacion1");
        opera1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opera1ActionPerformed(evt);
            }
        });

        opera2.setText("Operacion2");
        opera2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opera2ActionPerformed(evt);
            }
        });

        opera3.setText("Operacion3");
        opera3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opera3ActionPerformed(evt);
            }
        });

        opera4.setText("Operacion4");
        opera4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opera4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Hoja de Trabajo 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(opera3)
                            .addComponent(opera1))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(opera2)
                            .addComponent(opera4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(result)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(input2)
                                .addComponent(input1)
                                .addComponent(input3)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opera1)
                    .addComponent(opera2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opera3)
                    .addComponent(opera4))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opera1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opera1ActionPerformed
        // TODO add your handling code here:
        hipotenusa();
    }//GEN-LAST:event_opera1ActionPerformed

    private void opera2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opera2ActionPerformed
        // TODO add your handling code here:
        verificarLetra();

    }//GEN-LAST:event_opera2ActionPerformed

    private void opera3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opera3ActionPerformed
        // TODO add your handling code here:
        invertir();
    }//GEN-LAST:event_opera3ActionPerformed

    private void opera4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opera4ActionPerformed
        reglade3();
    }//GEN-LAST:event_opera4ActionPerformed

    //Metodos de las operaciones
    
    
    
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
            java.util.logging.Logger.getLogger(Hoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hoja().setVisible(true);
            }
        });
    }
    
        public void hipotenusa(){
        try {
                double  hipotenusa = Math.sqrt(Math.pow(Integer.parseInt(input1.getText()), 2) + Math.pow(Integer.parseInt(input2.getText()), 2));
       result.setText(String.valueOf(hipotenusa));
      
      System.out.println("la hipotenusa es: "+ hipotenusa);  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ingrese datos numericos o no deje los campos vacios");
        }

    }
        
        
        //Operacion 2
            
    //Operacion2
    public boolean verificarLetra(){
    String palabraV=input1.getText();
    if(palabraV.contains("a")&& palabraV.contains("e") && palabraV.contains("i") && palabraV.contains("o") && palabraV.contains("u")){
        result.setText("Cumple ");
        return true;
    }else{
    result.setText("No cumple");
    return false;
    }
    }
    
        //operacion3
    public void invertir(){
    String nombre= input1.getText();
    String apellido = input2.getText();
    String invertido ="";
    String invertido2 ="";
            
            
    for(int i = nombre.length()-1; i >=0; i --)
      invertido += nombre.charAt(i);
   
       for(int j = apellido.length()-1; j >=0; j --)
      invertido += apellido.charAt(j);
       
        
       String completa = invertido  +invertido2;
       JOptionPane.showMessageDialog(null, invertido +" "+ invertido2 +" 201404215");
       result.setText(completa);
    
    
    }
    
        //operacion4
    public void reglade3(){
     int a,x,b,y;
     a= Integer.parseInt(input1.getText());
     x=Integer.parseInt(input2.getText());
     b=Integer.parseInt(input3.getText());
     y = ((b*x)/a);
     
     result.setText(String.valueOf(y));
        System.out.println(y);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField input1;
    public javax.swing.JTextField input2;
    public javax.swing.JTextField input3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton opera1;
    private javax.swing.JButton opera2;
    private javax.swing.JButton opera3;
    private javax.swing.JButton opera4;
    public javax.swing.JTextField result;
    // End of variables declaration//GEN-END:variables
}

import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class NewJFrame14 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame14
     */
    public NewJFrame14() {
        initComponents();
    }
// Global variables
    Statement stmt = null;
    ResultSet rs = null;
    String SQL = "SELECT * FROM publisher";
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        first = new javax.swing.JButton();
        next = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        last = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        txtpno = new javax.swing.JTextField();
        txtpname = new javax.swing.JTextField();
        txtpadd = new javax.swing.JTextField();
        txtph1 = new javax.swing.JTextField();
        txtph2 = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        first.setText("FIRST");
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        next.setText("NEXT");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        previous.setText("PREVIOUS");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        last.setText("LAST");
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setText("PUBLISHER NO./ID");

        jLabel2.setText("NAME");

        jLabel3.setText("ADDRESS");

        jLabel4.setText("PHONE/MOBILE");

        jLabel5.setText("PHONE/MOBILE");

        jLabel6.setText("STATUS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(first)
                        .addGap(18, 18, 18)
                        .addComponent(next))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(previous)
                        .addGap(18, 18, 18)
                        .addComponent(last)
                        .addGap(18, 18, 18)
                        .addComponent(exit))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtpname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addComponent(txtpadd, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtph1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtph2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtstatus, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtpno, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpname))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpadd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtph1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtph2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtstatus)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first)
                    .addComponent(next)
                    .addComponent(previous)
                    .addComponent(last)
                    .addComponent(exit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        
try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","opjs");
             String s1="select * from publisher order by Pub_Id limit 1;";
             Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(s1);
 if (rs.first()) {
                String PubN = rs.getString("Pub_Id");
                String PubName = rs.getString("Pub_Name");
                String PubAdd = rs.getString("Pub_Address");
                String PubPh1 = rs.getString("Pub_Phone1");
                String PubPh2 = rs.getString("Pub_Phone2");
                String PStatus = rs.getString("Status");
                // Displaying the contents in respective text boxes.
                txtpno.setText(PubN);
                txtpname.setText(PubName);
                txtpadd.setText(PubAdd);
                txtph1.setText(PubPh1);
                txtph2.setText(PubPh2);
                txtstatus.setText(PStatus);
               
            } else {
                            JOptionPane.showMessageDialog(this, "There is no record in table", "Student",0);}
   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_firstActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
 int a=Integer.parseInt(txtpno.getText());
String b,c,d,g,f;
b=txtpname.getText();
c=txtpadd.getText();
d=txtph1.getText();
g=txtph2.getText();
f=txtstatus.getText();
int h=a+1;        
try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","opjs");
             String s1="select * from publisher where Pub_Id= "+h+";";
             Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(s1);
while(rs.next()){
                String PubN = rs.getString("Pub_Id");
                String PubName = rs.getString("Pub_Name");
                String PubAdd = rs.getString("Pub_Address");
                String PubPh1 = rs.getString("Pub_Phone1");
                String PubPh2 = rs.getString("Pub_Phone2");
                String PStatus = rs.getString("Status");
                // Displaying the contents in respective text boxes.
                txtpno.setText(PubN);
                txtpname.setText(PubName);
                txtpadd.setText(PubAdd);
                txtph1.setText(PubPh1);
                txtph2.setText(PubPh2);
                txtstatus.setText(PStatus);}
               
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }  // TODO add your handling code here:
    }//GEN-LAST:event_nextActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
 int a=Integer.parseInt(txtpno.getText());
String b,c,d,g,f;
b=txtpname.getText();
c=txtpadd.getText();
d=txtph1.getText();
g=txtph2.getText();
f=txtstatus.getText();
int h=a-1;        
try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","opjs");
             String s1="select * from publisher where Pub_Id= "+h+";";
             Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(s1);
while(rs.next()){
                String PubN = rs.getString("Pub_Id");
                String PubName = rs.getString("Pub_Name");
                String PubAdd = rs.getString("Pub_Address");
                String PubPh1 = rs.getString("Pub_Phone1");
                String PubPh2 = rs.getString("Pub_Phone2");
                String PStatus = rs.getString("Status");
                // Displaying the contents in respective text boxes.
                txtpno.setText(PubN);
                txtpname.setText(PubName);
                txtpadd.setText(PubAdd);
                txtph1.setText(PubPh1);
                txtph2.setText(PubPh2);
                txtstatus.setText(PStatus);}
               
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }    // TODO add your handling code here:
    }//GEN-LAST:event_previousActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","opjs");
           String s1="select * from publisher order by Pub_Id desc limit 1;  ";
           Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery(s1);
            if (rs.last()) {
                String PubN = rs.getString("Pub_Id");
                String PubName = rs.getString("Pub_Name");
                String PubAdd = rs.getString("Pub_Address");
                String PubPh1 = rs.getString("Pub_Phone1");
                String PubPh2 = rs.getString("Pub_Phone2");
                String PStatus = rs.getString("Status");
                // Displaying the contents in respective text boxes.
                txtpno.setText(PubN);
                txtpname.setText(PubName);
                txtpadd.setText(PubAdd);
                txtph1.setText(PubPh1);
                txtph2.setText(PubPh2);
                txtstatus.setText(PStatus);
            } else {
                JOptionPane.showMessageDialog(this, "You are already at last record", "Student",0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
                                       
    
        // TODO add your handling code here:
    }//GEN-LAST:event_lastActionPerformed
                                       
        
                                        
                                        
                           
     
                                       
   
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
            java.util.logging.Logger.getLogger(NewJFrame14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton first;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton last;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    private javax.swing.JTextField txtpadd;
    private javax.swing.JTextField txtph1;
    private javax.swing.JTextField txtph2;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtpno;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables
}
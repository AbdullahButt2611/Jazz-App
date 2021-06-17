/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

import javax.swing.JOptionPane;

/**
 *
 * @author DEll
 */
public class RetrieveMoney extends javax.swing.JFrame {

    
    int index = -1;
    int in =-1;
    String contact="";
    
    /**
     * Creates new form RetrieveMoney
     */
    public RetrieveMoney() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();
        invalidAmount = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        sendButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Retrieve Money");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jazz/jazzbgd.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 72)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 255, 0));
        jLabel2.setText("Management System");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("RETRIEVE MONEY FROM USER'S ACCOUNT");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(251, 255, 0));
        jLabel4.setText("Contact :");

        contactText.setBackground(new java.awt.Color(153, 153, 153));
        contactText.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        contactText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 255, 0)));

        searchButton.setBackground(new java.awt.Color(0, 0, 0));
        searchButton.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        searchButton.setForeground(new java.awt.Color(251, 255, 0));
        searchButton.setText("SEARCH");
        searchButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 4));
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(251, 255, 0));
        jLabel5.setText("Amount to Withdraw :");

        amountText.setBackground(new java.awt.Color(153, 153, 153));
        amountText.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        amountText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 255, 0)));

        invalidAmount.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        invalidAmount.setForeground(new java.awt.Color(153, 153, 153));
        invalidAmount.setText("Amount should be between 50 to 20,000");

        cancelButton.setBackground(new java.awt.Color(204, 0, 0));
        cancelButton.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 255, 0), 3));
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        sendButton.setBackground(new java.awt.Color(0, 0, 204));
        sendButton.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        sendButton.setForeground(new java.awt.Color(255, 255, 255));
        sendButton.setText("Send");
        sendButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 255, 0), 3, true));
        sendButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contactText, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(invalidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(46, 46, 46)
                                .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contactText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        AdminCashMenu menu=new AdminCashMenu();
        menu.setVisible(true);
        this.dispose();
         
          
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // TODO add your handling code here:
        
        if(contact.equals("") || contact.equals(null) || amountText.getText().equals(null) || amountText.getText().equals(null))
          {
              JOptionPane.showMessageDialog(this,"You input box is Empty\nYou first need to enter the account and click on the search button\nThen enter the amount and click on the Send button","Empty Input",JOptionPane.ERROR_MESSAGE);
          }
          else
          {
              for(int i=0;i<amountText.getText().length();i++)
              {
                  if(amountText.getText().charAt(i)>='0' && amountText.getText().charAt(i)<='9')
                  {
                      in=1;
                      break;
                  }
                  else
                  {
                      in=-1;
                  }
              }
              if(in==1)
              {
                  int amount = Integer.parseInt(amountText.getText());
                  if(amount >= 50 && amount <=20000)
                  {
                    if(JazzCash.cashInstance().getCredit().get(index).isMoneyAvaialbe(amount)) 
                    {
                        
                        RetrieveMoneyConfirmation confirm = new RetrieveMoneyConfirmation(index,amount);
                        confirm.setVisible(true);
                        this.dispose();
                    }
                    else
                        JOptionPane.showMessageDialog(this,"You dont have Enough credit to carry out the Transaction","Credit Lack",JOptionPane.ERROR_MESSAGE);
                  }
                  else
                      JOptionPane.showMessageDialog(this,"The amount Does not lie in range","Error",JOptionPane.ERROR_MESSAGE);
              }
              else
                  JOptionPane.showMessageDialog(this,"Only digits are allowed in Amount box","Digits Exception",JOptionPane.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        contact = contactText.getText();
        if(contact.equals("") || contact.equals(null))
            JOptionPane.showMessageDialog(this,"You input box is Empty","Empty Input",JOptionPane.ERROR_MESSAGE);
        else
        {
            if(RegisteredAccounts.getUsersInstance().getUsers().size()>0)
            {
                for(int i =0;i<RegisteredAccounts.getUsersInstance().getUsers().size();i++)
                {
                    if(RegisteredAccounts.getUsersInstance().getUsers().get(i).getContact().equals(contact))
                    {
                        index=i;
                        break;
                    }
                }
                if(index==-1)
                    JOptionPane.showMessageDialog(this,"You have Entered Unregistered Number","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(this,"No Data to Delete","Empty List",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_searchButtonActionPerformed
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
            java.util.logging.Logger.getLogger(RetrieveMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetrieveMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetrieveMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetrieveMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetrieveMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField contactText;
    private javax.swing.JLabel invalidAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables
}

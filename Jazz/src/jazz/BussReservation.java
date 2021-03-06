/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author DEll
 */
public class BussReservation extends javax.swing.JFrame {

    
    int index = -1;
    String company = "";
    String route = "";
    String timing = "";
    String type = "";
    int seats = -1;
    int amount = -1;
//    String 
    
    /**
     * Creates new form BussReservation
     */
    public BussReservation() {
        initComponents();
    }
    
    public BussReservation(int index) {
        initComponents();
        this.index = index;
        mradio.setSelected(true);
        acRadio.setSelected(true);
    }
    
    public void writeBusData()
    {
        try
        {
            FileWriter fr = new FileWriter("Bus.txt",true);
            BufferedWriter br = new BufferedWriter(fr);
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDateTime now = LocalDateTime.now();
            String a=now.format(format);
            br.write(a+","+RegisteredAccounts.getUsersInstance().getUsers().get(index).getUsername()+","+RegisteredAccounts.getUsersInstance().getUsers().get(index).getContact()+","+company+","+route+","+timing+","+type+","+seats+","+amount+"\n");
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Null");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        companyBox = new javax.swing.JComboBox<>();
        routeBox = new javax.swing.JComboBox<>();
        mradio = new javax.swing.JRadioButton();
        eradio = new javax.swing.JRadioButton();
        acRadio = new javax.swing.JRadioButton();
        nonRadio = new javax.swing.JRadioButton();
        seatsBox = new javax.swing.JComboBox<>();
        reserveButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();
        receiptButton = new javax.swing.JButton();
        cacelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buss Ticket Reservation");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jazz/jazzbgd.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 2, 2));
        jLabel3.setText("BUSS RESERVATION");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 255, 0));
        jLabel2.setText("Management System");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(251, 255, 0));
        jLabel4.setText("Company :");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(251, 255, 0));
        jLabel5.setText(" Route :");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(251, 255, 0));
        jLabel6.setText("Timing :");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(251, 255, 0));
        jLabel7.setText("Type :");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(251, 255, 0));
        jLabel8.setText("No. of Seats :");

        companyBox.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        companyBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daewoo", "Niazi Express", "Local" }));

        routeBox.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        routeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lahore to Karachi", "Lahore to Narowal", "Lahore to Sahiwal", "Lahore to Peshawar", "Lahore to Patoki", "Lahore to Islamabad", "Lahore to Quetta" }));

        mradio.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(mradio);
        mradio.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        mradio.setForeground(new java.awt.Color(204, 204, 204));
        mradio.setText("Morning");
        mradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mradioActionPerformed(evt);
            }
        });

        eradio.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(eradio);
        eradio.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        eradio.setForeground(new java.awt.Color(204, 204, 204));
        eradio.setText("Evening");

        acRadio.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(acRadio);
        acRadio.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        acRadio.setForeground(new java.awt.Color(204, 204, 204));
        acRadio.setText("A/C");

        nonRadio.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(nonRadio);
        nonRadio.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        nonRadio.setForeground(new java.awt.Color(204, 204, 204));
        nonRadio.setText("Non A/C");

        seatsBox.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        seatsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "Complete" }));
        seatsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatsBoxActionPerformed(evt);
            }
        });

        reserveButton.setBackground(new java.awt.Color(0, 0, 0));
        reserveButton.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        reserveButton.setForeground(new java.awt.Color(255, 255, 255));
        reserveButton.setText("Reserve");
        reserveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 255, 0), 3));
        reserveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(companyBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(routeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mradio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eradio))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(acRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nonRadio))
                    .addComponent(seatsBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reserveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(companyBox)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(routeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mradio)
                        .addComponent(eradio)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(acRadio)
                        .addComponent(nonRadio)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(seatsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(reserveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(251, 255, 0));
        jLabel9.setText("You amount will be :");

        amountText.setBackground(new java.awt.Color(0, 0, 0));
        amountText.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        amountText.setForeground(new java.awt.Color(251, 255, 0));
        amountText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        amountText.setEnabled(false);

        receiptButton.setBackground(new java.awt.Color(0, 0, 204));
        receiptButton.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        receiptButton.setForeground(new java.awt.Color(255, 255, 255));
        receiptButton.setText("Receipt");
        receiptButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 255, 0), 3));
        receiptButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        receiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptButtonActionPerformed(evt);
            }
        });

        cacelButton.setBackground(new java.awt.Color(255, 0, 0));
        cacelButton.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        cacelButton.setForeground(new java.awt.Color(255, 255, 255));
        cacelButton.setText("Cancel");
        cacelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 255, 0), 3));
        cacelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cacelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cacelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(68, 68, 68)
                        .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cacelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(receiptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receiptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cacelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mradioActionPerformed

    private void cacelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cacelButtonActionPerformed
        // TODO add your handling code here:
        TicketReservatiob ticket = new TicketReservatiob(index);
        ticket.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cacelButtonActionPerformed

    private void receiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptButtonActionPerformed
        // TODO add your handling code here:
       

            if(company.equals("") || company.equals(null) || route.equals("") ||route.equals(null) || timing.equals("") || timing.equals(null) || type.equals("") || (company.equals("") || company.equals(null) || route.equals("") ||route.equals(null) || timing.equals("") || timing.equals(null) || type.equals("") || type.equals(null) || seats == -1))
            {
                JOptionPane.showMessageDialog(this,"You have unfilled boxes","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                if(JazzCash.cashInstance().getCredit().get(index).isMoneyAvaialbe(amount))
                {
                    JazzCash.cashInstance().getCredit().get(index).retrieveAmount(amount);
                    writeBusData();
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDateTime now = LocalDateTime.now();
                    String a=now.format(format);
                    String receipt="";
                    receipt+="*******************************************************************************\n";
                    receipt+="                          BUS RESERVATION RECEIPT\n";
                    receipt+="*******************************************************************************\n";
                    receipt+=a+"\n\n";
                    receipt+="Company:         "+company+"\n";
                    receipt+="Route: "+route+"           Timing:"+timing+"\n";
                    receipt+="Type: "+type+"              No. of Seats: "+seats+"\n\n\n";
                    receipt+="Your Bill is : "+amount;

                    JazzCash.cashInstance().writeCreditData();
                    JOptionPane.showMessageDialog(this,receipt,"Receipt",JOptionPane.INFORMATION_MESSAGE);
                    CustomerCashMenu menu=new CustomerCashMenu(index);
                    menu.setVisible(true);
                    this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null,"You wallet does not contain enough money");
                
            }
    }//GEN-LAST:event_receiptButtonActionPerformed

    private void reserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveButtonActionPerformed
        // TODO add your handling code here:
        
        company = companyBox.getSelectedItem().toString();
        route = routeBox.getSelectedItem().toString();
        if(mradio.isSelected())
            timing = "Morning";
        else if(eradio.isSelected())
            timing = "Evening";
        
        if(acRadio.isSelected())
            type = "A/C";
        else if (nonRadio.isSelected())
            type = "Non A/C";
        
        if(seatsBox.getSelectedIndex()==16)
            seats=32;
        else
            seats=seatsBox.getSelectedIndex()+1;
            
        int price = -1;
        if(company.equals("Daewoo"))
            price = 950;
        else if(company.equals("Niazi Express"))
            price = 750;
        else 
            price = 500;
        
        price = price +(routeBox.getSelectedIndex()*100);
        
        if(mradio.isSelected())
            price+=50;
        else if(eradio.isSelected())
            price = price;
        
        if(acRadio.isSelected())
            price += 200;
        
        price = seats*price;
        amountText.setText(price+"");
            this.amount=price;
            
            
    }//GEN-LAST:event_reserveButtonActionPerformed

    private void seatsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatsBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatsBoxActionPerformed

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
            java.util.logging.Logger.getLogger(BussReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BussReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BussReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BussReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BussReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton acRadio;
    private javax.swing.JTextField amountText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cacelButton;
    private javax.swing.JComboBox<String> companyBox;
    private javax.swing.JRadioButton eradio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton mradio;
    private javax.swing.JRadioButton nonRadio;
    private javax.swing.JButton receiptButton;
    private javax.swing.JButton reserveButton;
    private javax.swing.JComboBox<String> routeBox;
    private javax.swing.JComboBox<String> seatsBox;
    // End of variables declaration//GEN-END:variables
}

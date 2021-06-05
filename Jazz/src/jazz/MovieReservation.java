/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DEll
 */
public class MovieReservation extends javax.swing.JFrame {

    int index = -1;
    
    String ID="";
    int seats = -1;
    String type = "";
    int amount =-1;
    String movieName="";
    
    /**
     * Creates new form MovieReservation
     */
    public MovieReservation() {
        initComponents();
        tableSet();
       addDatatoRow();
    }
    
    public MovieReservation(int index) {
        initComponents();
        tableSet();
        addDatatoRow();
       this.index=index;
    }
    
    public void addDatatoRow()
    {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object rowData[] = new Object[4];
        model.setRowCount(0);
        for(int i=0;i<JazzCash.cashInstance().movie.size();i++)
        {
            Movies m = JazzCash.cashInstance().movie.remove();
            rowData[0]=m.getID();
            rowData[1]=m.getName();
            rowData[2]=m.getTiming();
            rowData[3]=m.getSeats();
            model.addRow(rowData);
        }
    }
    
    public void tableSet()
    {
        jScrollPane1.setBackground(new Color(0,0,0,0));
       jScrollPane1.setOpaque(false);
       jTable1.setOpaque(false);
       ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
       jScrollPane1.getViewport().setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        seatsBox = new javax.swing.JComboBox<>();
        typeBox = new javax.swing.JComboBox<>();
        amountText = new javax.swing.JTextField();
        checkButton = new javax.swing.JButton();
        bookButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinema Ticket Reservation");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        jTable1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(251, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Moring/Evening", "Seats Available"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jazz/jazzbgd.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 130));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Emporium Cinema");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(251, 255, 0));
        jLabel4.setText("Movie ID :");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(251, 255, 0));
        jLabel5.setText("No of Seats :");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(251, 255, 0));
        jLabel6.setText("Type :");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(251, 255, 0));
        jLabel7.setText("Amount to Pay :");

        idText.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        seatsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        typeBox.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        typeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silver", "Gold", "Platinum" }));

        amountText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        amountText.setEnabled(false);

        checkButton.setBackground(new java.awt.Color(0, 0, 0));
        checkButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        checkButton.setForeground(new java.awt.Color(255, 255, 255));
        checkButton.setText("Check");
        checkButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 4));
        checkButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        bookButton.setBackground(new java.awt.Color(204, 0, 0));
        bookButton.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        bookButton.setForeground(new java.awt.Color(255, 255, 255));
        bookButton.setText("Book Tickets");
        bookButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));
        bookButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(0, 0, 153));
        cancelButton.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idText)
                            .addComponent(seatsBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typeBox, 0, 190, Short.MAX_VALUE)
                            .addComponent(amountText)
                            .addComponent(checkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(seatsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(typeBox)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 480, 430));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jazz/F9.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        setSize(new java.awt.Dimension(1088, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        TicketReservatiob ticket = new TicketReservatiob(index);
        ticket.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        // TODO add your handling code here:

        if(ID.equals("") || ID.equals(null) || seats==-1 || type.equals("") || type.equals(null) || amount==-1 || movieName.equals("") || movieName.equals(null))
        {
            JOptionPane.showMessageDialog(this,"The input fields must be filled first","Wrong input",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDateTime now = LocalDateTime.now();
            String a=now.format(format);
            String receipt = "";
            receipt+="********************************************************************************\n";
            receipt+="                        Movie Reservation Receipt\n";
            receipt+="********************************************************************************\n";
            receipt+=a+"\n\n\n";
            receipt+="Name: "+RegisteredAccounts.getUsersInstance().getUsers().get(index).getUsername()+"                         Contact: "+RegisteredAccounts.getUsersInstance().getUsers().get(index).getContact()+"\n";
            receipt+="Movie Name: "+movieName+"                  Movie-ID: "+ID+"\n";
            receipt+="No of Seats: "+seats+"("+type+") type\n\n\n";
            receipt+="Total Bill: "+amount;
            if(JazzCash.cashInstance().getCredit().get(index).isMoneyAvaialbe(amount))
            {
                JazzCash.cashInstance().getCredit().get(index).retrieveAmount(amount);
                JOptionPane.showMessageDialog(this,receipt,"Receipt",JOptionPane.INFORMATION_MESSAGE);
                CustomerCashMenu menu=new CustomerCashMenu(index);
                menu.setVisible(true);
                this.dispose();
            }
            else
                JOptionPane.showMessageDialog(this,"You Dont have Enough Money in your Wallet","Error",JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_bookButtonActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
        String ID=idText.getText();
        int seats = Integer.parseInt(seatsBox.getSelectedItem().toString());
        this.seats=seats;
        String type = typeBox.getSelectedItem().toString();
        this.type=type;
        int price =500;
        int in=-1;
        int inc=-1;
        if(ID.equals(null) || ID.equals(""))
            JOptionPane.showMessageDialog(this,"Input Box is Empty","Empty Input",JOptionPane.ERROR_MESSAGE);
        else
        {
            for(int i = 0; i<JazzCash.cashInstance().movie.size();i++)
            {
                Movies m=JazzCash.cashInstance().movie.remove();
                if(m.getID().equals(ID))
                {
                    in=1;
                    this.ID=ID;
                    this.movieName=m.getName();
                    price+=(typeBox.getSelectedIndex()*200);
                    price=price*(seatsBox.getSelectedIndex()+1);
                    if(m.getSeats()>=seats)
                        inc=1;
                    else
                        inc=-1;
                    
                    break;
                }
                else
                    in=-1;
            }
            if(in==-1)
            {
                JOptionPane.showMessageDialog(this,"Movie not found","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(in==1 && inc==1)
            {
                
                this.amount=price;
                amountText.setText(price+"");
            }
            else if(inc==-1)
                JOptionPane.showMessageDialog(this,"Seats are not available","Seats Occupied",JOptionPane.ERROR_MESSAGE);
                
        }
    }//GEN-LAST:event_checkButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MovieReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountText;
    private javax.swing.JButton bookButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton checkButton;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> seatsBox;
    private javax.swing.JComboBox<String> typeBox;
    // End of variables declaration//GEN-END:variables
}

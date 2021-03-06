import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OrderCurry extends javax.swing.JFrame {
    
    private void setTable() {
        String columnname[] = {"#", "OrderID", "FoodID", "FoodName", "Quantity", "Price", "Amount"};
        DefaultTableModel model = new DefaultTableModel(columnname, 0);
        try {
            String noworder = this.txtOrdercode.getText();
            String query ="SELECT bluedetail.orderid, bluefood.foodid, bluefood.foodname, bluedetail.unit, bluefood.price\n" +
            "FROM bluefood INNER JOIN bluedetail ON bluefood.foodid = bluedetail.foodid\n" +
            "WHERE (((bluedetail.orderid)='"+noworder+"'));";
            DBConnect conn = new DBConnect();
            ResultSet rs = conn.getResult(query);
            int i = 1; //firstblueuse0beforeadd test 0 a na
            while(rs.next()) {
               // i++;
                String num = String.valueOf(i);
                String idorder = rs.getString("orderid");
                String idfood = rs.getString("foodid");
                String namefood = rs.getString("foodname");
                String detailunit = rs.getString("unit");
                String foodprice = rs.getString("price");
                int total = Integer.parseInt(foodprice)*Integer.parseInt(detailunit);
                
                if(Integer.parseInt(detailunit)>0) { //test 0
                    i++;
                String row[] = {num, idorder, idfood, namefood, detailunit, foodprice, total+""};
                model.addRow(row);
                }
            }
            /////tst
            String sumQ = "SELECT bluedetail.orderid, SUM(bluedetail.unit*bluefood.price) AS sumT "
                        + "FROM bluefood INNER JOIN bluedetail ON bluefood.foodid = bluedetail.foodid WHERE (((bluedetail.orderid)='"+noworder+"'))";
            ResultSet sq = conn.getResult(sumQ);
            sq.next();
            this.txtAllSum.setText(sq.getString("sumT"));
            /////tst
            conn.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR : "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.tbAllDetail.setModel(model);
    }
    
    public OrderCurry() {
        setUndecorated(true);
        setLocationRelativeTo(null);
        this.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
        
        initComponents();
        setTable();
        tbAllDetail.getTableHeader().setFont(new Font("Segoe 01", Font.BOLD, 12));
        tbAllDetail.getTableHeader().setOpaque(false);
        tbAllDetail.getTableHeader().setBackground(new Color(153,204,255));
        tbAllDetail.getTableHeader().setForeground(Color.GRAY);
        tbAllDetail.setRowHeight(25);
    }

    public void setForm() {//void is no return
        this.setVisible(true);
        setTable();
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new RoundedPanel(30);
        jPanel1 = new RoundedPanel(15);
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtOrdercode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAllDetail = new javax.swing.JTable();
        txtAllSum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btRemove = new javax.swing.JButton();
        jPanel3 = new RoundedPanel(30);
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new RoundedPanel(30);
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(760, 540));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setOpaque(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Print");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 70, 30));

        jLabel4.setFont(new java.awt.Font("LuloCleanW01-OneBold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("BLUEZOCURRY");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 29, -1, -1));

        jLabel5.setText("thank you for your order <3");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 76, -1, -1));

        txtDate.setEditable(false);
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setText(java.time.LocalDate.now()+"");
        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jPanel2.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 80, 30));

        jLabel2.setText("Date :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 110, -1, -1));

        jLabel1.setText("Order ID :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 147, -1, -1));

        txtOrdercode.setEditable(false);
        txtOrdercode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOrdercode.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        txtOrdercode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdercodeActionPerformed(evt);
            }
        });
        jPanel2.add(txtOrdercode, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, 30));

        tbAllDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbAllDetail.setFocusable(false);
        tbAllDetail.setGridColor(new java.awt.Color(254, 236, 73));
        tbAllDetail.setOpaque(false);
        tbAllDetail.setRowHeight(25);
        tbAllDetail.setSelectionBackground(new java.awt.Color(254, 236, 73));
        tbAllDetail.setShowVerticalLines(false);
        tbAllDetail.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbAllDetail);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 181, 650, 230));

        txtAllSum.setEditable(false);
        txtAllSum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAllSum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAllSum.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtAllSum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 135, 47));

        jLabel3.setText("Total :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 481, -1, -1));

        btRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/ic_remove.png"))); // NOI18N
        btRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveActionPerformed(evt);
            }
        });
        jPanel2.add(btRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 28, 28));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("x");
        jLabel6.setToolTipText("Close");
        jLabel6.setPreferredSize(new java.awt.Dimension(10, 15));
        jLabel6.setRequestFocusEnabled(false);
        jLabel6.setVerifyInputWhenFocusTarget(false);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-");
        jLabel7.setToolTipText("Minimize");
        jLabel7.setPreferredSize(new java.awt.Dimension(10, 15));
        jLabel7.setRequestFocusEnabled(false);
        jLabel7.setVerifyInputWhenFocusTarget(false);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrdercodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdercodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrdercodeActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
        //Delete
        try {
            String list2remove = this.tbAllDetail.getValueAt(this.tbAllDetail.getSelectedRow(), 1).toString();
            String food2remove = this.tbAllDetail.getValueAt(this.tbAllDetail.getSelectedRow(), 2).toString();
            String query = String.format("DELETE FROM bluedetail WHERE orderid = '%1s' AND foodid = '%2s'", list2remove, food2remove);
            
            System.out.println(query);
            
            DBConnect conn = new DBConnect();
            boolean rs = conn.execute(query);
            if(rs) {
                JOptionPane.showMessageDialog(this, "Complete", "Complete", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Fail", "Try again", JOptionPane.WARNING_MESSAGE);
            }
            conn.close();
            setTable();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR : "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btRemoveActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(255,229,116));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(255,229,116));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        //Print
        MessageFormat header = new MessageFormat("BLUEZOCURRY "+java.time.LocalDate.now()+" Order ID : "+txtOrdercode.getText()+" Total : "+txtAllSum.getText()+" Baht.");
//        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        MessageFormat footer = new MessageFormat("Thank You");
        
        try {
            boolean print = tbAllDetail.print(JTable.PrintMode.NORMAL, header, footer);
            if (!print) {
                JOptionPane.showMessageDialog(null, "Unable To Print !!..");
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        //Print
        MessageFormat header = new MessageFormat("BLUEZOCURRY "+java.time.LocalDate.now()+" Order ID : "+txtOrdercode.getText()+" Total : "+txtAllSum.getText()+" Baht.");
//        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        MessageFormat footer = new MessageFormat("Thank You");
        
        try {
            boolean print = tbAllDetail.print(JTable.PrintMode.NORMAL, header, footer);
            if (!print) {
                JOptionPane.showMessageDialog(null, "Unable To Print !!..");
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_jPanel1MouseExited

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(153,102,255));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(153,102,255));
    }//GEN-LAST:event_jPanel1MouseEntered

    int xMouse;
    int yMouse;
    
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

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
            java.util.logging.Logger.getLogger(OrderCurry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderCurry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderCurry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderCurry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderCurry().setVisible(true);
            }
        });
    }
    
    class RoundedPanel extends JPanel {
        private Color backgroundColor;
        private int cornerRadius = 15;
        
        public RoundedPanel (LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        
        public RoundedPanel (LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        
        public RoundedPanel (int radius) {
            super();
            cornerRadius = radius;
        }
        
        public RoundedPanel (int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        
        @Override
        protected void paintComponent (Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            //Draws the rounded panel with borders.
            if(backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAllDetail;
    private javax.swing.JTextField txtAllSum;
    private javax.swing.JTextField txtDate;
    public static javax.swing.JTextField txtOrdercode;
    // End of variables declaration//GEN-END:variables
}

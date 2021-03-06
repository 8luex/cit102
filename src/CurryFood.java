import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class CurryFood extends javax.swing.JFrame {

    /**
     * Creates new form CurryFood
     */
    public CurryFood() {
        setUndecorated(true);
        setLocationRelativeTo(null);
        this.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
        
        initComponents();
//        Border grayBorder = BorderFactory.createLineBorder(Color.GRAY, 2, true);
//        pic1.setBorder(grayBorder);
//        pic2.setBorder(grayBorder);
//        pic3.setBorder(grayBorder);
//        pic4.setBorder(grayBorder);
//        pic5.setBorder(grayBorder);
//        pic6.setBorder(grayBorder);
//        pic7.setBorder(grayBorder);
//        pic8.setBorder(grayBorder);
    }
    
    public void setForm() {//void is no return
        this.setVisible(true);
    }
    
    private int ucurryrice;
    private int umiso;
    private int uome;
    private int usalad;
    private int ukimchi;
    private int uwater;
    private int upepsi;
    private int utea;
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new RoundedPanel(30);
        jLabel9 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        codeorderfromstart = new javax.swing.JTextField();
        spKimchi = new javax.swing.JSpinner();
        spWater = new javax.swing.JSpinner();
        spPepsi = new javax.swing.JSpinner();
        spTea = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();
        pic5 = new javax.swing.JLabel();
        pic3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pic4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spCurryrice = new javax.swing.JSpinner();
        spMiso = new javax.swing.JSpinner();
        spOme = new javax.swing.JSpinner();
        spSalad = new javax.swing.JSpinner();
        pic6 = new javax.swing.JLabel();
        pic7 = new javax.swing.JLabel();
        pic8 = new javax.swing.JLabel();
        jPanel2 = new RoundedPanel(30);
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new RoundedPanel(15);
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 35));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtDate.setEditable(false);
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setText(java.time.LocalDate.now()+"");
        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 66, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Order ID :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        codeorderfromstart.setEditable(false);
        codeorderfromstart.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codeorderfromstart.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        codeorderfromstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeorderfromstartActionPerformed(evt);
            }
        });
        jPanel1.add(codeorderfromstart, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 90, 30));

        spKimchi.setBorder(null);
        jPanel1.add(spKimchi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 70, -1));

        spWater.setBorder(null);
        jPanel1.add(spWater, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 70, -1));

        spPepsi.setBorder(null);
        jPanel1.add(spPepsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 70, -1));

        spTea.setBorder(null);
        jPanel1.add(spTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 70, -1));

        jLabel1.setText("Curry Rice");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/water.png"))); // NOI18N
        jPanel1.add(pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        pic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/pepsi.png"))); // NOI18N
        jPanel1.add(pic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        pic5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/miso.png"))); // NOI18N
        jPanel1.add(pic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        pic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/tea.png"))); // NOI18N
        jPanel1.add(pic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        jLabel2.setText("Miso Soup");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        pic4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/curryrice.png"))); // NOI18N
        jPanel1.add(pic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setText("Omelette");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jLabel4.setText("Salad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        jLabel5.setText("Tea");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, -1, -1));

        jLabel6.setText("Pepsi");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, -1, -1));

        jLabel7.setText("Water");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        jLabel8.setText("Kimchi");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        spCurryrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(spCurryrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 70, -1));

        spMiso.setBorder(null);
        jPanel1.add(spMiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 70, -1));

        spOme.setBorder(null);
        jPanel1.add(spOme, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 70, -1));

        spSalad.setBorder(null);
        jPanel1.add(spSalad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 70, -1));

        pic6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/omelette.png"))); // NOI18N
        jPanel1.add(pic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        pic7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/salad.png"))); // NOI18N
        jPanel1.add(pic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        pic8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/kimchi.png"))); // NOI18N
        jPanel1.add(pic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("x");
        jLabel11.setToolTipText("Close");
        jLabel11.setPreferredSize(new java.awt.Dimension(10, 15));
        jLabel11.setRequestFocusEnabled(false);
        jLabel11.setVerifyInputWhenFocusTarget(false);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(110, 200, 50));
        jPanel3.setOpaque(false);
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

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Ok");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 600, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codeorderfromstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeorderfromstartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeorderfromstartActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        ucurryrice = Integer.parseInt(this.spCurryrice.getValue().toString());
        umiso = Integer.parseInt(this.spMiso.getValue().toString());
        uome = Integer.parseInt(this.spOme.getValue().toString());
        usalad = Integer.parseInt(this.spSalad.getValue().toString());
        ukimchi = Integer.parseInt(this.spKimchi.getValue().toString());
        uwater = Integer.parseInt(this.spWater.getValue().toString());
        upepsi = Integer.parseInt(this.spPepsi.getValue().toString());
        utea = Integer.parseInt(this.spTea.getValue().toString());

        int fpricearray[] = {uwater, upepsi, utea, ucurryrice, umiso, uome, usalad, ukimchi};
        String idf[] = {"F01", "F02", "F03", "F04", "F05", "F06", "F07", "F08"};

        String orderidinapp = codeorderfromstart.getText();

        String query;
        query = String.format("INSERT INTO bluedetail(orderid, foodid, unit) VALUES('%1$s', '%2$s', '%3$s'), ('%4$s', '%5$s', '%6$s'), ('%7$s', '%8$s', '%9$s'), ('%10$s', '%11$s', '%12$s'), ('%13$s', '%14$s', '%15$s'), ('%16$s', '%17$s', '%18$s'), ('%19$s', '%20$s', '%21$s'), ('%22$s', '%23$s', '%24$s');"
                , orderidinapp, idf[0], fpricearray[0], orderidinapp, idf[1], fpricearray[1],
                orderidinapp, idf[2], fpricearray[2], orderidinapp, idf[3], fpricearray[3], orderidinapp, idf[4], fpricearray[4], orderidinapp, idf[5], fpricearray[5],
                orderidinapp, idf[6], fpricearray[6], orderidinapp, idf[7], fpricearray[7]);
        System.out.println(query);

//        String query;
//        query = String.format("INSERT INTO bluedetail(orderid, foodid, unit) VALUES('%1$s', '%2$s', '%3$s')",orderidinapp, idf[7], fpricearray[7]);
//        System.out.println(query);

        try {
            DBConnect conn = new DBConnect();
            boolean rs = conn.execute(query);
            if(rs) {
                JOptionPane.showMessageDialog(this, "Complete", "Complete", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Fail", "Try again", JOptionPane.WARNING_MESSAGE);
            }
            conn.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR : "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //New 15/3/2021
        OrderCurry oc = new OrderCurry(); //(this, true)
        oc.txtOrdercode.setText(orderidinapp);
        this.dispose();
        oc.setForm();
        //oc.setVisible(true);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        ucurryrice = Integer.parseInt(this.spCurryrice.getValue().toString());
        umiso = Integer.parseInt(this.spMiso.getValue().toString());
        uome = Integer.parseInt(this.spOme.getValue().toString());
        usalad = Integer.parseInt(this.spSalad.getValue().toString());
        ukimchi = Integer.parseInt(this.spKimchi.getValue().toString());
        uwater = Integer.parseInt(this.spWater.getValue().toString());
        upepsi = Integer.parseInt(this.spPepsi.getValue().toString());
        utea = Integer.parseInt(this.spTea.getValue().toString());

        int fpricearray[] = {uwater, upepsi, utea, ucurryrice, umiso, uome, usalad, ukimchi};
        String idf[] = {"F01", "F02", "F03", "F04", "F05", "F06", "F07", "F08"};

        String orderidinapp = codeorderfromstart.getText();

        String query;
        query = String.format("INSERT INTO bluedetail(orderid, foodid, unit) VALUES('%1$s', '%2$s', '%3$s'), ('%4$s', '%5$s', '%6$s'), ('%7$s', '%8$s', '%9$s'), ('%10$s', '%11$s', '%12$s'), ('%13$s', '%14$s', '%15$s'), ('%16$s', '%17$s', '%18$s'), ('%19$s', '%20$s', '%21$s'), ('%22$s', '%23$s', '%24$s');"
                , orderidinapp, idf[0], fpricearray[0], orderidinapp, idf[1], fpricearray[1],
                orderidinapp, idf[2], fpricearray[2], orderidinapp, idf[3], fpricearray[3], orderidinapp, idf[4], fpricearray[4], orderidinapp, idf[5], fpricearray[5],
                orderidinapp, idf[6], fpricearray[6], orderidinapp, idf[7], fpricearray[7]);
        System.out.println(query);

//        String query;
//        query = String.format("INSERT INTO bluedetail(orderid, foodid, unit) VALUES('%1$s', '%2$s', '%3$s')",orderidinapp, idf[7], fpricearray[7]);
//        System.out.println(query);

        try {
            DBConnect conn = new DBConnect();
            boolean rs = conn.execute(query);
            if(rs) {
                JOptionPane.showMessageDialog(this, "Complete", "Complete", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Fail", "Try again", JOptionPane.WARNING_MESSAGE);
            }
            conn.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR : "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //New 15/3/2021
        OrderCurry oc = new OrderCurry(); //(this, true)
        oc.txtOrdercode.setText(orderidinapp);
        this.dispose();
        oc.setForm();
        //oc.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(110,200,50));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(110,200,50));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(64,135,20));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(64,135,20));
    }//GEN-LAST:event_jLabel12MouseEntered

    int xMouse;
    int yMouse;    
    
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

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
            java.util.logging.Logger.getLogger(CurryFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurryFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurryFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurryFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurryFood().setVisible(true);
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
    public static javax.swing.JTextField codeorderfromstart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    private javax.swing.JLabel pic5;
    private javax.swing.JLabel pic6;
    private javax.swing.JLabel pic7;
    private javax.swing.JLabel pic8;
    public static javax.swing.JSpinner spCurryrice;
    public static javax.swing.JSpinner spKimchi;
    public static javax.swing.JSpinner spMiso;
    public static javax.swing.JSpinner spOme;
    public static javax.swing.JSpinner spPepsi;
    public static javax.swing.JSpinner spSalad;
    public static javax.swing.JSpinner spTea;
    public static javax.swing.JSpinner spWater;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}

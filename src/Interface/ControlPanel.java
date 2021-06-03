/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;



public class ControlPanel extends javax.swing.JFrame {
    private Controller controller;
    private int x, y;
    
    public ControlPanel(Controller controller) {
        initComponents();
        this.controller = controller;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        qBP = new javax.swing.JLabel();
        hireBP = new javax.swing.JButton();
        fireBP = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        sB = new javax.swing.JLabel();
        panaDelivery = new javax.swing.JLabel();
        deliveryDays = new javax.swing.JLabel();
        timerS = new javax.swing.JLabel();
        managerS = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        hireAP = new javax.swing.JButton();
        fireAP = new javax.swing.JButton();
        qAP = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        sA = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        qLP = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        sL = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        qBodP = new javax.swing.JLabel();
        sBod = new javax.swing.JLabel();
        hireLP = new javax.swing.JButton();
        fireLP = new javax.swing.JButton();
        hireBodP = new javax.swing.JButton();
        fireBodP = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        qAss = new javax.swing.JLabel();
        hireAss = new javax.swing.JButton();
        fireAss = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("MATTEL");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Producción de Panas");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Botones");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Brazos");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Piernas");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Cuerpo");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Ensambladores");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Panas por entregar:");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Días para la entrega:");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Estado jefe:");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("Productores:");

        qBP.setText("jLabel13");

        hireBP.setBackground(new java.awt.Color(102, 102, 102));
        hireBP.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        hireBP.setText("+");
        hireBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireBPActionPerformed(evt);
            }
        });

        fireBP.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        fireBP.setText("-");
        fireBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireBPActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Estado Manager:");

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 102));
        jLabel15.setText("Stock:");

        sB.setText("jLabel16");

        panaDelivery.setText("jLabel17");

        deliveryDays.setText("jLabel18");

        timerS.setText("jLabel19");

        managerS.setText("jLabel20");

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 102, 102));
        jLabel21.setText("Productores:");

        hireAP.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        hireAP.setText("+");
        hireAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireAPActionPerformed(evt);
            }
        });

        fireAP.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        fireAP.setText("-");
        fireAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireAPActionPerformed(evt);
            }
        });

        qAP.setText("jLabel23");

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 102, 102));
        jLabel24.setText("Stock:");

        sA.setText("jLabel25");

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 102, 102));
        jLabel26.setText("Productores:");

        qLP.setText("jLabel27");

        jLabel28.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 102, 102));
        jLabel28.setText("Stock:");

        sL.setText("jLabel29");

        jLabel30.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 102, 102));
        jLabel30.setText("Stock:");

        jLabel31.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 102, 102));
        jLabel31.setText("Productores:");

        qBodP.setText("jLabel32");

        sBod.setText("jLabel33");

        hireLP.setText("+");
        hireLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireLPActionPerformed(evt);
            }
        });

        fireLP.setText("-");
        fireLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireLPActionPerformed(evt);
            }
        });

        hireBodP.setText("+");
        hireBodP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireBodPActionPerformed(evt);
            }
        });

        fireBodP.setText("-");
        fireBodP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireBodPActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 102, 102));
        jLabel34.setText("Cantidad:");

        qAss.setText("jLabel11");

        hireAss.setText("+");
        hireAss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireAssActionPerformed(evt);
            }
        });

        fireAss.setText("-");
        fireAss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireAssActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel34))
                                    .addComponent(hireAss))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fireAss)
                                    .addComponent(qAss))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel21)
                                .addGap(26, 26, 26)
                                .addComponent(qAP))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jSeparator7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(qBP))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel26))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel31)))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qLP)
                                    .addComponent(qBodP))))
                        .addGap(10, 10, 10)))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(managerS))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timerS))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(panaDelivery))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deliveryDays))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(sBod))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(sB))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sA))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sL)))))
                        .addGap(65, 65, 65)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(hireAP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fireAP, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(hireBP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fireBP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(hireBodP, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fireBodP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(hireLP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fireLP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator5))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12)
                    .addComponent(qBP)
                    .addComponent(jLabel15)
                    .addComponent(sB)
                    .addComponent(hireBP)
                    .addComponent(fireBP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qAP)
                        .addComponent(jLabel21)
                        .addComponent(jLabel24)
                        .addComponent(sA)
                        .addComponent(hireAP)
                        .addComponent(fireAP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel26)
                            .addComponent(qLP)
                            .addComponent(jLabel28)
                            .addComponent(sL)
                            .addComponent(hireLP)
                            .addComponent(fireLP))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hireBodP)
                            .addComponent(fireBodP)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel31)
                            .addComponent(qBodP)
                            .addComponent(jLabel30)
                            .addComponent(sBod))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(qAss))
                        .addGap(42, 42, 42)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hireAss)
                            .addComponent(fireAss)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(panaDelivery))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(deliveryDays))
                        .addGap(19, 19, 19)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(timerS))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(managerS))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
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

    private void hireBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireBPActionPerformed
        this.controller.factory.hireBP();
    }//GEN-LAST:event_hireBPActionPerformed

    private void fireAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireAPActionPerformed
        this.controller.factory.fireAP();
    }//GEN-LAST:event_fireAPActionPerformed

    private void fireBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireBPActionPerformed
        this.controller.factory.rmvBP();
    }//GEN-LAST:event_fireBPActionPerformed

    private void hireAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireAPActionPerformed
        this.controller.factory.hireAP();
    }//GEN-LAST:event_hireAPActionPerformed

    private void hireLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireLPActionPerformed
        this.controller.factory.hireLP();
    }//GEN-LAST:event_hireLPActionPerformed

    private void fireLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireLPActionPerformed
        this.controller.factory.rmvLP();
    }//GEN-LAST:event_fireLPActionPerformed

    private void hireBodPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireBodPActionPerformed
        this.controller.factory.hireBodP();
    }//GEN-LAST:event_hireBodPActionPerformed

    private void fireBodPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireBodPActionPerformed
        this.controller.factory.fireBodP();
    }//GEN-LAST:event_fireBodPActionPerformed

    private void hireAssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireAssActionPerformed
        this.controller.factory.hireAss();
    }//GEN-LAST:event_hireAssActionPerformed

    private void fireAssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireAssActionPerformed
        this.controller.factory.fireAss();
    }//GEN-LAST:event_fireAssActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel deliveryDays;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton fireAP;
    private javax.swing.JButton fireAss;
    private javax.swing.JButton fireBP;
    private javax.swing.JButton fireBodP;
    private javax.swing.JButton fireLP;
    private javax.swing.JButton hireAP;
    private javax.swing.JButton hireAss;
    private javax.swing.JButton hireBP;
    private javax.swing.JButton hireBodP;
    private javax.swing.JButton hireLP;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    public javax.swing.JLabel managerS;
    public javax.swing.JLabel panaDelivery;
    public javax.swing.JLabel qAP;
    public javax.swing.JLabel qAss;
    public javax.swing.JLabel qBP;
    public javax.swing.JLabel qBodP;
    public javax.swing.JLabel qLP;
    public javax.swing.JLabel sA;
    public javax.swing.JLabel sB;
    public javax.swing.JLabel sBod;
    public javax.swing.JLabel sL;
    public javax.swing.JLabel timerS;
    // End of variables declaration//GEN-END:variables
}

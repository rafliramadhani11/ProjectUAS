package Project;

import javax.swing.JOptionPane;

public final class FormBioskop extends javax.swing.JFrame {

    public FormBioskop() {
        initComponents();
        bersih();

//      Metode Bayar
        bgCaraBayar.add(rbUang);
        bgCaraBayar.add(rbOvo);
        bgCaraBayar.add(rbBni);
        bgCaraBayar.add(rbBca);

//      Jam Tayang
        bgJAM1.add(jRadioButton1);
        bgJAM1.add(jRadioButton2);
        bgJAM2.add(jRadioButton3);
        bgJAM2.add(jRadioButton4);
        bgJAM3.add(jRadioButton7);
        bgJAM3.add(jRadioButton8);
        bgJAM4.add(jRadioButton9);
        bgJAM4.add(jRadioButton10);

    }

    void bersih() {
        cbFILM1.setSelected(false);
        cbFILM2.setSelected(false);
        cbFILM3.setSelected(false);
        cbFILM4.setSelected(false);
        tfSpiderman.setText("0");
        tfDoctor.setText("0");
        tfThor.setText("0");
        tfTop.setText("0");
        tfSpiderman.setEditable(false);
        tfDoctor.setEditable(false);
        tfThor.setEditable(false);
        tfTop.setEditable(false);
        rbUang.setSelected(true);
        bgJAM1.clearSelection();
        bgJAM2.clearSelection();
        bgJAM3.clearSelection();
        bgJAM4.clearSelection();
        lblTotal.setText("Rp. 0");
        lblMetode.setText("Metode Pembayaran");

    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox3 = new javax.swing.JCheckBox();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        bgJAM1 = new javax.swing.ButtonGroup();
        bgJAM2 = new javax.swing.ButtonGroup();
        bgJAM3 = new javax.swing.ButtonGroup();
        bgJAM4 = new javax.swing.ButtonGroup();
        bgCaraBayar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbFILM1 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        cbFILM2 = new javax.swing.JCheckBox();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        cbFILM3 = new javax.swing.JCheckBox();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        cbFILM4 = new javax.swing.JCheckBox();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfSpiderman = new javax.swing.JTextField();
        tfTop = new javax.swing.JTextField();
        tfDoctor = new javax.swing.JTextField();
        tfThor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        rbOvo = new javax.swing.JRadioButton();
        rbUang = new javax.swing.JRadioButton();
        bTotal = new javax.swing.JButton();
        rbBni = new javax.swing.JRadioButton();
        rbBca = new javax.swing.JRadioButton();
        lblMetode = new javax.swing.JLabel();
        bPesan = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();

        jCheckBox3.setBackground(new java.awt.Color(25, 43, 77));
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 212, 129));
        jCheckBox3.setText("Doctor Strange : Multiverse of Madness");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(25, 43, 77));
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("13:00");

        jRadioButton6.setBackground(new java.awt.Color(25, 43, 77));
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("16:00");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 212, 129));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 43, 77), 5, true));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CINEMA");
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 50));

        jLabel7.setFont(new java.awt.Font("Goudy Old Style", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("XX1");
        jLabel7.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel7.setMinimumSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(442, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jPanel6.setBackground(new java.awt.Color(25, 43, 77));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 212, 129), 5, true));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ramad\\Pictures\\From Download\\film2.jpg")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ramad\\Pictures\\From Download\\film3.jpg")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\ramad\\Pictures\\From Download\\film1.jpg")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ramad\\Pictures\\From Download\\film5.jpg")); // NOI18N

        cbFILM1.setBackground(new java.awt.Color(25, 43, 77));
        cbFILM1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbFILM1.setForeground(new java.awt.Color(255, 212, 129));
        cbFILM1.setText("Spiderman : No Way Home");
        cbFILM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFILM1ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(25, 43, 77));
        bgJAM1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("13:00");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(25, 43, 77));
        bgJAM1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("16:00");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        cbFILM2.setBackground(new java.awt.Color(25, 43, 77));
        cbFILM2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbFILM2.setForeground(new java.awt.Color(255, 212, 129));
        cbFILM2.setText("Doctor Strange : Multiverse of Madness");
        cbFILM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFILM2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(25, 43, 77));
        bgJAM2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("13:00");

        jRadioButton4.setBackground(new java.awt.Color(25, 43, 77));
        bgJAM2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("16:00");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        cbFILM3.setBackground(new java.awt.Color(25, 43, 77));
        cbFILM3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbFILM3.setForeground(new java.awt.Color(255, 212, 129));
        cbFILM3.setText("Thor : Love and Thunder");
        cbFILM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFILM3ActionPerformed(evt);
            }
        });

        jRadioButton7.setBackground(new java.awt.Color(25, 43, 77));
        bgJAM3.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("13:00");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setBackground(new java.awt.Color(25, 43, 77));
        bgJAM3.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("16:00");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        cbFILM4.setBackground(new java.awt.Color(25, 43, 77));
        cbFILM4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbFILM4.setForeground(new java.awt.Color(255, 212, 129));
        cbFILM4.setText("Top Gun : Maverick");
        cbFILM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFILM4ActionPerformed(evt);
            }
        });

        jRadioButton9.setBackground(new java.awt.Color(25, 43, 77));
        bgJAM4.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("13:00");

        jRadioButton10.setBackground(new java.awt.Color(25, 43, 77));
        bgJAM4.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setText("16:00");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 212, 129));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("JUMLAH TIKET");
        jLabel6.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel6.setMinimumSize(new java.awt.Dimension(50, 50));

        tfSpiderman.setBackground(new java.awt.Color(25, 43, 77));
        tfSpiderman.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfSpiderman.setForeground(new java.awt.Color(255, 212, 129));
        tfSpiderman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSpidermanActionPerformed(evt);
            }
        });

        tfTop.setBackground(new java.awt.Color(25, 43, 77));
        tfTop.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfTop.setForeground(new java.awt.Color(255, 212, 129));

        tfDoctor.setBackground(new java.awt.Color(25, 43, 77));
        tfDoctor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfDoctor.setForeground(new java.awt.Color(255, 212, 129));

        tfThor.setBackground(new java.awt.Color(25, 43, 77));
        tfThor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfThor.setForeground(new java.awt.Color(255, 212, 129));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSpiderman, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfThor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSpiderman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfThor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("METODE PEMBAYARAN");
        jLabel11.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel11.setMinimumSize(new java.awt.Dimension(50, 50));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TAYANG SEKARANG");
        jLabel12.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel12.setMinimumSize(new java.awt.Dimension(50, 50));

        jPanel7.setBackground(new java.awt.Color(255, 212, 129));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        rbOvo.setBackground(new java.awt.Color(25, 43, 77));
        bgCaraBayar.add(rbOvo);
        rbOvo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbOvo.setForeground(new java.awt.Color(255, 255, 255));
        rbOvo.setText("OVO");
        rbOvo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOvoActionPerformed(evt);
            }
        });

        rbUang.setBackground(new java.awt.Color(25, 43, 77));
        bgCaraBayar.add(rbUang);
        rbUang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbUang.setForeground(new java.awt.Color(255, 255, 255));
        rbUang.setText("UANG TUNAI");
        rbUang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUangActionPerformed(evt);
            }
        });

        bTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bTotal.setText("TOTAL");
        bTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTotalActionPerformed(evt);
            }
        });

        rbBni.setBackground(new java.awt.Color(25, 43, 77));
        bgCaraBayar.add(rbBni);
        rbBni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbBni.setForeground(new java.awt.Color(255, 255, 255));
        rbBni.setText("DEBIT BNI");
        rbBni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBniActionPerformed(evt);
            }
        });

        rbBca.setBackground(new java.awt.Color(25, 43, 77));
        bgCaraBayar.add(rbBca);
        rbBca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbBca.setForeground(new java.awt.Color(255, 255, 255));
        rbBca.setText("DEBIT BCA");
        rbBca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBcaActionPerformed(evt);
            }
        });

        lblMetode.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblMetode.setForeground(new java.awt.Color(255, 255, 255));
        lblMetode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMetode.setText("METODE");
        lblMetode.setMaximumSize(new java.awt.Dimension(50, 50));
        lblMetode.setMinimumSize(new java.awt.Dimension(50, 50));

        bPesan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bPesan.setText("PESAN LAGI");
        bPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesanActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Rp. 0 ");
        lblTotal.setMaximumSize(new java.awt.Dimension(50, 50));
        lblTotal.setMinimumSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbUang)
                            .addComponent(rbOvo))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbBca)
                            .addComponent(rbBni))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(bTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(bPesan))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMetode, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbFILM2)
                                            .addComponent(cbFILM3)
                                            .addComponent(cbFILM1)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addComponent(cbFILM4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jRadioButton9)
                                                    .addGap(48, 48, 48)
                                                    .addComponent(jRadioButton10))
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                            .addComponent(jRadioButton3)
                                                            .addGap(48, 48, 48)
                                                            .addComponent(jRadioButton4))
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                            .addComponent(jRadioButton7)
                                                            .addGap(48, 48, 48)
                                                            .addComponent(jRadioButton8))
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                            .addComponent(jRadioButton1)
                                                            .addGap(48, 48, 48)
                                                            .addComponent(jRadioButton2))))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(139, 139, 139)))
                                        .addGap(18, 18, 18))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFILM1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFILM2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFILM3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton8)
                                    .addComponent(jRadioButton7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cbFILM4)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton10)
                                            .addComponent(jRadioButton9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbUang)
                                    .addComponent(rbBni))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbOvo)
                                    .addComponent(rbBca))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMetode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void cbFILM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFILM3ActionPerformed
        // TODO add your handling code here:
        if (cbFILM3.isSelected()) {
            tfThor.setEditable(true);
            tfThor.setText("1");
        } else {
            tfThor.setEditable(false);
            tfThor.setText("");
        }
    }//GEN-LAST:event_cbFILM3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void cbFILM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFILM2ActionPerformed
        // TODO add your handling code here:
        if (cbFILM2.isSelected()) {
            tfDoctor.setEditable(true);
            tfDoctor.setText("1");
        } else {
            tfDoctor.setEditable(false);
            tfDoctor.setText("");
        }
    }//GEN-LAST:event_cbFILM2ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void rbOvoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOvoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOvoActionPerformed

    private void rbUangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbUangActionPerformed

    private void rbBniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBniActionPerformed

    private void rbBcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBcaActionPerformed

    private void cbFILM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFILM4ActionPerformed
        // TODO add your handling code here:
        if (cbFILM4.isSelected()) {
            tfTop.setEditable(true);
            tfTop.setText("1");
        } else {
            tfTop.setEditable(false);
            tfTop.setText("");
        }
    }//GEN-LAST:event_cbFILM4ActionPerformed

    private void cbFILM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFILM1ActionPerformed
        // TODO add your handling code here:
        if (cbFILM1.isSelected()) {
            tfSpiderman.setEditable(true);
            tfSpiderman.setText("1");
        } else {
            tfSpiderman.setEditable(false);
            tfSpiderman.setText("");
        }

    }//GEN-LAST:event_cbFILM1ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void bTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTotalActionPerformed
        // TODO add your handling code here:
        int nfilm1, nfilm2, nfilm3, nfilm4 ;
        int nTotal ;

//      MEMBUAT VARIABLE UNTUK MENG TOTALKAN
        nfilm1 = Integer.parseInt(tfSpiderman.getText());
        nfilm2 = Integer.parseInt(tfDoctor.getText());
        nfilm3 = Integer.parseInt(tfThor.getText());
        nfilm4 = Integer.parseInt(tfTop.getText());        

//      TOTAL
        nTotal = (30000 * nfilm1)+(35000 * nfilm2)+(35000 * nfilm3)+(35000 * nfilm4);
        lblTotal.setText("Rp. "+nTotal);
        
//      METODE PEMBAYARAN
        if (rbUang.isSelected()) {
            lblMetode.setText(rbUang.getActionCommand());
        }else if (rbOvo.isSelected()) {
            lblMetode.setText(rbOvo.getActionCommand());
        }else if (rbBni.isSelected()) {
            lblMetode.setText(rbBni.getActionCommand());
        }else if (rbBca.isSelected()) {
            lblMetode.setText(rbBca.getActionCommand());
        }
    }//GEN-LAST:event_bTotalActionPerformed

    private void bPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesanActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_bPesanActionPerformed

    private void tfSpidermanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSpidermanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSpidermanActionPerformed

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
            java.util.logging.Logger.getLogger(FormBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBioskop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPesan;
    private javax.swing.JButton bTotal;
    private javax.swing.ButtonGroup bgCaraBayar;
    private javax.swing.ButtonGroup bgJAM1;
    private javax.swing.ButtonGroup bgJAM2;
    private javax.swing.ButtonGroup bgJAM3;
    private javax.swing.ButtonGroup bgJAM4;
    private javax.swing.JCheckBox cbFILM1;
    private javax.swing.JCheckBox cbFILM2;
    private javax.swing.JCheckBox cbFILM3;
    private javax.swing.JCheckBox cbFILM4;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JLabel lblMetode;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rbBca;
    private javax.swing.JRadioButton rbBni;
    private javax.swing.JRadioButton rbOvo;
    private javax.swing.JRadioButton rbUang;
    private javax.swing.JTextField tfDoctor;
    private javax.swing.JTextField tfSpiderman;
    private javax.swing.JTextField tfThor;
    private javax.swing.JTextField tfTop;
    // End of variables declaration//GEN-END:variables
}

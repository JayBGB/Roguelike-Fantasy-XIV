package com.project.ui;


import com.project.game.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ruben
 */
public class UIpointAllocation extends javax.swing.JFrame implements ActionListener{


    public static int points = 0;

    /**
     * Creates new form characterCreationUI
     */
    public UIpointAllocation() {
        initComponents();
    }

    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        pointsLeftLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        reassignButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        chaTextLabel = new javax.swing.JLabel();
        strTextLabel = new javax.swing.JLabel();
        dexTextLabel = new javax.swing.JLabel();
        conTextLabel = new javax.swing.JLabel();
        wisTextLabel = new javax.swing.JLabel();
        itlTextLabel = new javax.swing.JLabel();
        chaStatLabel = new javax.swing.JLabel();
        strStatLabel = new javax.swing.JLabel();
        dexStatLabel = new javax.swing.JLabel();
        conStatLabel = new javax.swing.JLabel();
        wisStatLabel = new javax.swing.JLabel();
        itlStatLabel = new javax.swing.JLabel();
        addChaButton = new javax.swing.JButton();
        addStrButton = new javax.swing.JButton();
        addDexButton = new javax.swing.JButton();
        addConButton = new javax.swing.JButton();
        addWisButton = new javax.swing.JButton();
        addItlButton = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        titleLabel.setText("POINT ALLOCATION");
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 30));

        classLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        classLabel.setText("Bard");
        jPanel1.add(classLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, -1));

        pointsLeftLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pointsLeftLabel.setText("Points Left :  10");
        jPanel1.add(pointsLeftLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, 20));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setText("Bibillyro Zazallyro");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, -1));

        reassignButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        reassignButton.setText("Reassign");
        reassignButton.addActionListener((ActionListener) this);

        jPanel1.add(reassignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 110, 40));

        okButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(this);

        jPanel1.add(okButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 100, 40));

        chaTextLabel.setFont(new java.awt.Font("BIZ UDPGothic", 0, 16)); // NOI18N
        chaTextLabel.setText("Charisma :");
        jPanel1.add(chaTextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 150, 30));

        strTextLabel.setFont(new java.awt.Font("BIZ UDPGothic", 0, 16)); // NOI18N
        strTextLabel.setText("Strength :");
        jPanel1.add(strTextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 150, 30));

        dexTextLabel.setFont(new java.awt.Font("BIZ UDPGothic", 0, 16)); // NOI18N
        dexTextLabel.setText("Dexterity :");
        jPanel1.add(dexTextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 150, 30));

        conTextLabel.setFont(new java.awt.Font("BIZ UDPGothic", 0, 16)); // NOI18N
        conTextLabel.setText("Constitution :");
        jPanel1.add(conTextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 150, 30));

        wisTextLabel.setFont(new java.awt.Font("BIZ UDPGothic", 0, 16)); // NOI18N
        wisTextLabel.setText("Wisdom :");
        jPanel1.add(wisTextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 150, 30));

        itlTextLabel.setFont(new java.awt.Font("BIZ UDPGothic", 0, 16)); // NOI18N
        itlTextLabel.setText("Intelligence :");
        jPanel1.add(itlTextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 150, 30));

        chaStatLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chaStatLabel.setText(String.valueOf(Main.data.getAttCharisma()));
        chaStatLabel.setPreferredSize(new java.awt.Dimension(12, 17));
        jPanel1.add(chaStatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 30, 30));

        strStatLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        strStatLabel.setText(String.valueOf(Main.data.getAttStrength()));
        strStatLabel.setPreferredSize(new java.awt.Dimension(12, 17));
        jPanel1.add(strStatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 30, 30));

        dexStatLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dexStatLabel.setText(String.valueOf(Main.data.getAttDexterity()));
        dexStatLabel.setPreferredSize(new java.awt.Dimension(12, 17));
        jPanel1.add(dexStatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 30, 30));

        conStatLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        conStatLabel.setText(String.valueOf(Main.data.getAttConstitution()));
        conStatLabel.setPreferredSize(new java.awt.Dimension(12, 17));
        jPanel1.add(conStatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 30, 30));

        wisStatLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        wisStatLabel.setText(String.valueOf(Main.data.getAttWisdom()));
        wisStatLabel.setPreferredSize(new java.awt.Dimension(12, 17));
        jPanel1.add(wisStatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 30, 30));

        itlStatLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itlStatLabel.setText(String.valueOf(Main.data.getAttIntelligence()));
        itlStatLabel.setPreferredSize(new java.awt.Dimension(12, 17));
        jPanel1.add(itlStatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 30, 30));

        addChaButton.setText("+");
        addChaButton.setToolTipText("");
        addChaButton.addActionListener(this);
        jPanel1.add(addChaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 70, 20));

        addStrButton.setText("+");
        addStrButton.setToolTipText("");
        addStrButton.addActionListener(this);
        jPanel1.add(addStrButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 70, 20));

        addDexButton.setText("+");
        addDexButton.setToolTipText("");
        addDexButton.addActionListener(this);
        jPanel1.add(addDexButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 70, 20));

        addConButton.setText("+");
        addConButton.setToolTipText("");
        addConButton.addActionListener(this);
        jPanel1.add(addConButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 70, 20));

        addWisButton.setText("+");
        addWisButton.setToolTipText("");
        addWisButton.addActionListener(this);
        jPanel1.add(addWisButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 70, 20));

        addItlButton.setText("+");
        addItlButton.setToolTipText("");
        addItlButton.addActionListener(this);
        jPanel1.add(addItlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 70, 20));

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
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addChaButton;
    private javax.swing.JButton addConButton;
    private javax.swing.JButton addDexButton;
    private javax.swing.JButton addItlButton;
    private javax.swing.JButton addStrButton;
    private javax.swing.JButton addWisButton;
    private javax.swing.JLabel chaStatLabel;
    private javax.swing.JLabel chaTextLabel;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel conStatLabel;
    private javax.swing.JLabel conTextLabel;
    private javax.swing.JLabel dexStatLabel;
    private javax.swing.JLabel dexTextLabel;
    private javax.swing.JLabel itlStatLabel;
    private javax.swing.JLabel itlTextLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel pointsLeftLabel;
    private javax.swing.JButton reassignButton;
    private javax.swing.JLabel strStatLabel;
    private javax.swing.JLabel strTextLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel wisStatLabel;
    private javax.swing.JLabel wisTextLabel;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addStrButton){

        }
    }

}
package com.project.ui;


import com.project.game.Main;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author ruben
 */
public class UIpointAllocation extends javax.swing.JFrame implements ActionListener{


    public static int points = 0;
    public static int maxPoints = 0;

    int tempStr = Main.data.getAttStrength();
    int tempDex = Main.data.getAttDexterity();
    int tempCon = Main.data.getAttConstitution();
    int tempWis = Main.data.getAttWisdom();
    int tempItl = Main.data.getAttIntelligence();
    int tempCha = Main.data.getAttCharisma();
    final int STR=1, DEX=2, CON=3, ITL=4, WIS=5, CHA=6;
    /**
     * Creates new form characterCreationUI
     */
    public UIpointAllocation() {
        initComponents();
    }

    private void initComponents() {

        jButton2 = new JButton();
        jPanel1 = new JPanel();
        titleLabel = new JLabel();
        classLabel = new JLabel();
        pointsLeftLabel = new JLabel();
        nameLabel = new JLabel();
        reassignButton = new JButton();
        okButton = new JButton();
        chaTextLabel = new JLabel();
        strTextLabel = new JLabel();
        dexTextLabel = new JLabel();
        conTextLabel = new JLabel();
        wisTextLabel = new JLabel();
        itlTextLabel = new JLabel();
        chaStatLabel = new JLabel();
        strStatLabel = new JLabel();
        dexStatLabel = new JLabel();
        conStatLabel = new JLabel();
        wisStatLabel = new JLabel();
        itlStatLabel = new JLabel();
        addChaButton = new JButton();
        addStrButton = new JButton();
        addDexButton = new JButton();
        addConButton = new JButton();
        addWisButton = new JButton();
        addItlButton = new JButton();
        backGround = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(new java.awt.Dimension(1280, 720));

        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

        int posX = (pantalla.width - this.getWidth()) / 2;
        int posY = (pantalla.height - this.getHeight()) / 2;

        this.setLocation(posX, posY);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        titleLabel.setText("POINT ALLOCATION");
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 30));

        classLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        classLabel.setText(Main.data.getJobName());
        jPanel1.add(classLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, -1));

        pointsLeftLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pointsLeftLabel.setText("Points Left : " + points);
        jPanel1.add(pointsLeftLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, 20));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setText(Main.data.getName() + " " + Main.data.getSurname());
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, -1));

        reassignButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        reassignButton.setText("Reassign");
        reassignButton.addActionListener((ActionListener) this);

        jPanel1.add(reassignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 110, 40));

        okButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        okButton.setText("OK");
        if (points > 0){
            okButton.setEnabled(false);
        }else
            okButton.setEnabled(true);
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

        if (points < 1){
            addStrButton.setEnabled(false);
            addDexButton.setEnabled(false);
            addConButton.setEnabled(false);
            addWisButton.setEnabled(false);
            addItlButton.setEnabled(false);
            addChaButton.setEnabled(false);
        }else {
            addStrButton.setEnabled(true);
            addDexButton.setEnabled(true);
            addConButton.setEnabled(true);
            addWisButton.setEnabled(true);
            addItlButton.setEnabled(true);
            addChaButton.setEnabled(true);
        }
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


        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("RoguelikeFantasyXIV/src/com/project/images/font/AdventureRequest-j8W9.ttf"));

            GraphicsEnvironment graphic = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphic.registerFont(customFont);

            String fontName = customFont.getFamily();

            titleLabel.setFont(new Font(fontName, Font.PLAIN,24));
            classLabel.setFont(new Font(fontName, Font.PLAIN,14));
            nameLabel.setFont(new Font(fontName, Font.PLAIN,14));
            pointsLeftLabel.setFont(new Font(fontName, Font.PLAIN,18));
            reassignButton.setFont(new Font(fontName, Font.PLAIN,14));
            okButton.setFont(new Font(fontName, Font.PLAIN,18));
            strStatLabel.setFont(new Font(fontName, Font.PLAIN,16));
            strTextLabel.setFont(new Font(fontName, Font.PLAIN,16));
            dexStatLabel.setFont(new Font(fontName, Font.PLAIN,16));
            dexTextLabel.setFont(new Font(fontName, Font.PLAIN,16));
            conStatLabel.setFont(new Font(fontName, Font.PLAIN,16));
            conTextLabel.setFont(new Font(fontName, Font.PLAIN,16));
            itlStatLabel.setFont(new Font(fontName, Font.PLAIN,16));
            itlTextLabel.setFont(new Font(fontName, Font.PLAIN,16));
            wisStatLabel.setFont(new Font(fontName, Font.PLAIN,16));
            wisTextLabel.setFont(new Font(fontName, Font.PLAIN,16));
            chaStatLabel.setFont(new Font(fontName, Font.PLAIN,16));
            chaTextLabel.setFont(new Font(fontName, Font.PLAIN,16));


        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }

        backGround.setIcon(new javax.swing.ImageIcon("RoguelikeFantasyXIV/src/com/project/images/backgrounds/backgroundCC.png"));
        jPanel1.add(backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 510));

        pack();
    }

    // Variables declaration - do not modify
    private JButton addChaButton;
    private JButton addConButton;
    private JButton addDexButton;
    private JButton addItlButton;
    private JButton addStrButton;
    private JButton addWisButton;
    private JLabel chaStatLabel;
    private JLabel chaTextLabel;
    private JLabel classLabel;
    private JLabel conStatLabel;
    private JLabel conTextLabel;
    private JLabel dexStatLabel;
    private JLabel dexTextLabel;
    private JLabel itlStatLabel;
    private JLabel itlTextLabel;
    private JButton jButton2;
    private JPanel jPanel1;
    private JLabel nameLabel;
    private JButton okButton;
    private JLabel pointsLeftLabel;
    private JButton reassignButton;
    private JLabel strStatLabel;
    private JLabel strTextLabel;
    private JLabel titleLabel;
    private JLabel wisStatLabel;
    private JLabel wisTextLabel;
    private JLabel backGround;

    public void refreshPAUI(){
        strStatLabel.setText(String.valueOf(Main.data.getAttStrength()));
        dexStatLabel.setText(String.valueOf(Main.data.getAttDexterity()));
        conStatLabel.setText(String.valueOf(Main.data.getAttConstitution()));
        wisStatLabel.setText(String.valueOf(Main.data.getAttWisdom()));
        itlStatLabel.setText(String.valueOf(Main.data.getAttIntelligence()));
        chaStatLabel.setText(String.valueOf(Main.data.getAttCharisma()));
        pointsLeftLabel.setText("Points Left :" + points);
        if (points > 0){
            okButton.setEnabled(false);
        }else
            okButton.setEnabled(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addStrButton){
            alocatePoint(STR);
        }else if (e.getSource() == addDexButton){
            alocatePoint(DEX);
        }else if (e.getSource() == addConButton){
            alocatePoint(CON);
        }else if (e.getSource() == addWisButton){
            alocatePoint(WIS);
        }else if (e.getSource() == addItlButton){
            alocatePoint(ITL);
        } else if (e.getSource() == addChaButton) {
            alocatePoint(CHA);
        } else if (e.getSource() == reassignButton) {
            Main.data.setAttStrength(tempStr);
            Main.data.setAttDexterity(tempDex);
            Main.data.setAttConstitution(tempCon);
            Main.data.setAttWisdom(tempWis);
            Main.data.setAttIntelligence(tempItl);
            Main.data.setAttCharisma(tempCha);
            addStrButton.setEnabled(true);
            addDexButton.setEnabled(true);
            addConButton.setEnabled(true);
            addWisButton.setEnabled(true);
            addItlButton.setEnabled(true);
            addChaButton.setEnabled(true);
            points = maxPoints;
            refreshPAUI();
        } else if (e.getSource() == okButton) {
            refreshPAUI();
            maxPoints = points;
            Main.charCreation.calculateHP();
            Main.charCreation.calculateDamage();
            Main.charCreation.calculateDefense();
            Main.charCreation.calculateMana();
            Main.menuUI = new UIMenu();
            Main.menuUI.setVisible(true);
            this.dispose();
        }
    }

    public void alocatePoint(int stat){
            switch (stat) {
                case STR:
                    Main.data.setAttStrength(Main.data.getAttStrength() + 1);
                    refreshPAUI();
                    break;
                case DEX:
                    Main.data.setAttDexterity(Main.data.getAttDexterity() + 1);
                    refreshPAUI();
                    break;
                case CON:
                    Main.data.setAttConstitution(Main.data.getAttConstitution() + 1);
                    refreshPAUI();
                    break;
                case WIS:
                    Main.data.setAttWisdom(Main.data.getAttWisdom() + 1);
                    refreshPAUI();
                    break;
                case ITL:
                    Main.data.setAttIntelligence(Main.data.getAttIntelligence() + 1);
                    refreshPAUI();
                    break;
                case CHA:
                    Main.data.setAttCharisma(Main.data.getAttCharisma() + 1);
                    refreshPAUI();
                    break;
            }
            points --;
        if (points < 1){
            addStrButton.setEnabled(false);
            addDexButton.setEnabled(false);
            addConButton.setEnabled(false);
            addWisButton.setEnabled(false);
            addItlButton.setEnabled(false);
            addChaButton.setEnabled(false);
            refreshPAUI();
        }else {
            addStrButton.setEnabled(true);
            addDexButton.setEnabled(true);
            addConButton.setEnabled(true);
            addWisButton.setEnabled(true);
            addItlButton.setEnabled(true);
            addChaButton.setEnabled(true);
            refreshPAUI();
        }
    }

}

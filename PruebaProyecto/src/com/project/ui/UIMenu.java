package com.project.ui;

import com.project.game.CharacterCreation;
import com.project.game.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author heath
 */
public class UIMenu extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form UIMenu
     */
    public UIMenu() {
        initComponents();
    }

    private void initComponents(){

        jPanel1 = new javax.swing.JPanel();
        menuPhoto = new javax.swing.JLabel();
        menuNameSurname = new javax.swing.JLabel();
        menuJobName = new javax.swing.JLabel();
        menuChaName = new javax.swing.JLabel();
        menuDexName = new javax.swing.JLabel();
        menuConName = new javax.swing.JLabel();
        menuIntName = new javax.swing.JLabel();
        menuWisName = new javax.swing.JLabel();
        menuStrName = new javax.swing.JLabel();
        menuStrAtt = new javax.swing.JLabel();
        menuDexAtt = new javax.swing.JLabel();
        menuConAtt = new javax.swing.JLabel();
        menuIntAtt = new javax.swing.JLabel();
        menuWisAtt = new javax.swing.JLabel();
        menuFightButton = new javax.swing.JButton();
        menuManaPotButton = new javax.swing.JButton();
        menuHpPotButton = new javax.swing.JButton();
        menuManaPotAmmount = new javax.swing.JLabel();
        menuShopText = new javax.swing.JLabel();
        menuGoldText = new javax.swing.JLabel();
        menuGoldAmmount = new javax.swing.JLabel();
        menuHpPotName = new javax.swing.JLabel();
        menuManaPotName = new javax.swing.JLabel();
        menuAllocationButton = new javax.swing.JButton();
        menuPointsLeftAmmount = new javax.swing.JLabel();
        menuChaAtt = new javax.swing.JLabel();
        menuAttPointsText = new javax.swing.JLabel();
        menuHpPotAmmount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(new java.awt.Dimension(1280, 720));

        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

        int posX = (pantalla.width - this.getWidth()) / 2;
        int posY = (pantalla.height - this.getHeight()) / 2;

        this.setLocation(posX, posY);

        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 730));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPhoto.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuPhoto.setForeground(new java.awt.Color(204, 204, 255));
        menuPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuPhoto.setIcon(new ImageIcon(CharacterCreation.heroImgUrl + ".png"));
        menuPhoto.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 204, 255)));
        jPanel1.add(menuPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 246, 250));

        menuNameSurname.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuNameSurname.setForeground(new java.awt.Color(204, 204, 255));
        menuNameSurname.setText(Main.data.getName() + " " + Main.data.getSurname());
        jPanel1.add(menuNameSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, 30));

        menuJobName.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuJobName.setForeground(new java.awt.Color(204, 204, 255));
        menuJobName.setText(Main.data.getJobName());
        jPanel1.add(menuJobName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 150, 30));

        menuChaName.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuChaName.setForeground(new java.awt.Color(204, 204, 255));
        menuChaName.setText("Charisma");
        jPanel1.add(menuChaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 80, 20));

        menuDexName.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuDexName.setForeground(new java.awt.Color(204, 204, 255));
        menuDexName.setText("Dexterity");
        jPanel1.add(menuDexName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 20));

        menuConName.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuConName.setForeground(new java.awt.Color(204, 204, 255));
        menuConName.setText("Constitution");
        jPanel1.add(menuConName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 100, 20));

        menuIntName.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuIntName.setForeground(new java.awt.Color(204, 204, 255));
        menuIntName.setText("Intelligence");
        jPanel1.add(menuIntName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 100, 20));

        menuWisName.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuWisName.setForeground(new java.awt.Color(204, 204, 255));
        menuWisName.setText("Wisdom");
        jPanel1.add(menuWisName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 80, 20));

        menuStrName.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuStrName.setForeground(new java.awt.Color(204, 204, 255));
        menuStrName.setText("Strength");
        jPanel1.add(menuStrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, 20));

        menuStrAtt.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuStrAtt.setForeground(new java.awt.Color(204, 204, 255));
        menuStrAtt.setText(String.valueOf(Main.data.getAttStrength()));
        jPanel1.add(menuStrAtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 80, 20));

        menuDexAtt.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuDexAtt.setForeground(new java.awt.Color(204, 204, 255));
        menuDexAtt.setText(String.valueOf(Main.data.getAttDexterity()));
        jPanel1.add(menuDexAtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 80, 20));

        menuConAtt.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuConAtt.setForeground(new java.awt.Color(204, 204, 255));
        menuConAtt.setText(String.valueOf(Main.data.getAttConstitution()));
        jPanel1.add(menuConAtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 80, 20));

        menuIntAtt.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuIntAtt.setForeground(new java.awt.Color(204, 204, 255));
        menuIntAtt.setText(String.valueOf(Main.data.getAttIntelligence()));
        jPanel1.add(menuIntAtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 80, 20));

        menuWisAtt.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuWisAtt.setForeground(new java.awt.Color(204, 204, 255));
        menuWisAtt.setText(String.valueOf(Main.data.getAttWisdom()));
        jPanel1.add(menuWisAtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 80, 20));

        menuFightButton.setBackground(new java.awt.Color(204, 204, 255));
        menuFightButton.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuFightButton.setText("ADVENTURE TIME!");
        menuFightButton.addActionListener(this);
        jPanel1.add(menuFightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 630, 230, 70));

        menuManaPotButton.setIcon(new ImageIcon("PruebaProyecto/src/com/project/images/items/manaPotion.png"));
        menuManaPotButton.addActionListener(this);
        jPanel1.add(menuManaPotButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 340, 80, 80));

        menuHpPotButton.setIcon(new ImageIcon("PruebaProyecto/src/com/project/images/items/hpPotion.png"));
        menuHpPotButton.addActionListener(this);
        jPanel1.add(menuHpPotButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 340, 80, 80));

        menuManaPotAmmount.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuManaPotAmmount.setForeground(new java.awt.Color(204, 204, 255));
        menuManaPotAmmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuManaPotAmmount.setText("Ammount: " + Main.manaPotion.getQuantity());
        jPanel1.add(menuManaPotAmmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 450, 80, -1));

        menuShopText.setFont(new java.awt.Font("Adventure ReQuest", 0, 36)); // NOI18N
        menuShopText.setForeground(new java.awt.Color(204, 204, 255));
        menuShopText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuShopText.setText("SHOP");
        jPanel1.add(menuShopText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 200, 240, 50));

        menuGoldText.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuGoldText.setForeground(new java.awt.Color(204, 204, 255));
        menuGoldText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuGoldText.setText("Your Gold:");
        jPanel1.add(menuGoldText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 270, 70, 30));

        menuGoldAmmount.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuGoldAmmount.setForeground(new java.awt.Color(204, 204, 255));
        Main.inv.load();
        menuGoldAmmount.setText(String.valueOf(Main.gold.getQuantity()));
        jPanel1.add(menuGoldAmmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 270, 50, 30));

        menuHpPotName.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuHpPotName.setForeground(new java.awt.Color(204, 204, 255));
        menuHpPotName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuHpPotName.setText("HP");
        jPanel1.add(menuHpPotName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 430, 60, -1));

        menuManaPotName.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuManaPotName.setForeground(new java.awt.Color(204, 204, 255));
        menuManaPotName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuManaPotName.setText("MANA");
        jPanel1.add(menuManaPotName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 430, 60, -1));

        menuAllocationButton.setBackground(new java.awt.Color(204, 204, 255));
        menuAllocationButton.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuAllocationButton.setText("POINT ALLOCATION");
        menuAllocationButton.addActionListener(this);
        if (UIpointAllocation.points < 1){
            menuAllocationButton.setEnabled(false);
        }else
            menuAllocationButton.setEnabled(true);
        jPanel1.add(menuAllocationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 230, 70));

        menuPointsLeftAmmount.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuPointsLeftAmmount.setForeground(new java.awt.Color(204, 204, 255));
        menuPointsLeftAmmount.setText(String.valueOf(UIpointAllocation.points));
        jPanel1.add(menuPointsLeftAmmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 100, 30));

        menuChaAtt.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuChaAtt.setForeground(new java.awt.Color(204, 204, 255));
        menuChaAtt.setText(String.valueOf(Main.data.getAttCharisma()));
        jPanel1.add(menuChaAtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 80, 20));

        menuAttPointsText.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuAttPointsText.setForeground(new java.awt.Color(204, 204, 255));
        menuAttPointsText.setText("Attribute points: ");
        jPanel1.add(menuAttPointsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 130, 30));

        menuHpPotAmmount.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuHpPotAmmount.setForeground(new java.awt.Color(204, 204, 255));
        menuHpPotAmmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuHpPotAmmount.setText("Ammount: " + Main.hpPotion.getQuantity());
        jPanel1.add(menuHpPotAmmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 450, 80, -1));

        jLabel1.setFont(new java.awt.Font("Adventure ReQuest", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ROGUELIKE FANTASY XIV");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 730, 80));

        menuBackgroundLabel.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        menuBackgroundLabel.setIcon(new javax.swing.ImageIcon("PruebaProyecto/src/com/project/images/backgrounds/menuBG.jpeg")); // NOI18N
        jPanel1.add(menuBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menuAllocationButton;
    private javax.swing.JLabel menuAttPointsText;
    private javax.swing.JLabel menuBackgroundLabel;
    private javax.swing.JLabel menuChaAtt;
    private javax.swing.JLabel menuChaName;
    private javax.swing.JLabel menuConAtt;
    private javax.swing.JLabel menuConName;
    private javax.swing.JLabel menuDexAtt;
    private javax.swing.JLabel menuDexName;
    private javax.swing.JButton menuFightButton;
    private javax.swing.JLabel menuGoldAmmount;
    private javax.swing.JLabel menuGoldText;
    private javax.swing.JLabel menuHpPotAmmount;
    private javax.swing.JButton menuHpPotButton;
    private javax.swing.JLabel menuHpPotName;
    private javax.swing.JLabel menuIntAtt;
    private javax.swing.JLabel menuIntName;
    private javax.swing.JLabel menuJobName;
    private javax.swing.JLabel menuManaPotAmmount;
    private javax.swing.JButton menuManaPotButton;
    private javax.swing.JLabel menuManaPotName;
    private javax.swing.JLabel menuNameSurname;
    private javax.swing.JLabel menuPhoto;
    private javax.swing.JLabel menuPointsLeftAmmount;
    private javax.swing.JLabel menuShopText;
    private javax.swing.JLabel menuStrAtt;
    private javax.swing.JLabel menuStrName;
    private javax.swing.JLabel menuWisAtt;
    private javax.swing.JLabel menuWisName;

    public void refreshMenuUI(){
        Main.inv.load();
        menuGoldAmmount.setText(String.valueOf(Main.gold.getQuantity()));
        menuManaPotAmmount.setText("Ammount: " + Main.manaPotion.getQuantity());
        menuHpPotAmmount.setText("Ammount: " + Main.hpPotion.getQuantity());
        if (UIpointAllocation.points < 1){
            menuAllocationButton.setEnabled(false);
        }else
            menuAllocationButton.setEnabled(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuFightButton){
            Main.charCreation.calculateHP();
            Main.charCreation.calculateMana();
            Main.charCreation.calculateDefense();
            Main.charCreation.calculateDamage();
            Main.combat.setHeroIsAlive(true);
            Main.combat.addToSpellArrayList();
            Main.combatui = new UI();
            Main.combatui.setVisible(true);
            Main.combatui.startCombat();
            Main.combatui.refreshCombatUI();
            this.dispose();
        }else if (e.getSource() == menuAllocationButton){
            UIpointAllocation.points = 25;
            UIpointAllocation.maxPoints = 25;
            Main.paUI = new UIpointAllocation();
            Main.paUI.setVisible(true);
            this.dispose();
        }else if (e.getSource() == menuHpPotButton){
            if (Main.gold.getQuantity() >= 100) {
                Main.hpPotion.setQuantity(Main.hpPotion.getQuantity() + 1);
                Main.inv.load();
                Main.gold.setQuantity(Main.gold.getQuantity() - 100);
                Main.inv.save();
                refreshMenuUI();
            }
        }else if (e.getSource() == menuManaPotButton){
            if (Main.gold.getQuantity() >= 100) {
                Main.manaPotion.setQuantity(Main.manaPotion.getQuantity() + 1);
                Main.inv.load();
                Main.gold.setQuantity(Main.gold.getQuantity() - 100);
                Main.inv.save();
                refreshMenuUI();
            }
        }
    }
}

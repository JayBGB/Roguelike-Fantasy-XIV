

package com.project.ui;


import com.project.game.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UI extends javax.swing.JFrame implements ActionListener {


    public UI(){
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pjPanel = new javax.swing.JPanel();
        pjImgPanel = new javax.swing.JPanel();
        pj2Separator = new javax.swing.JSeparator();
        pjImgLabel = new javax.swing.JLabel();
        fightStats = new javax.swing.JPanel();
        hpText = new javax.swing.JLabel();
        manaText = new javax.swing.JLabel();
        degenseText = new javax.swing.JLabel();
        dmgText = new javax.swing.JLabel();
        hpStat = new javax.swing.JLabel();
        defStat = new javax.swing.JLabel();
        manaStat = new javax.swing.JLabel();
        dmgStat = new javax.swing.JLabel();
        charStats = new javax.swing.JPanel();
        pj3Separator = new javax.swing.JSeparator();
        strText = new javax.swing.JLabel();
        dexText = new javax.swing.JLabel();
        conText = new javax.swing.JLabel();
        wisText = new javax.swing.JLabel();
        itlText = new javax.swing.JLabel();
        chaText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        namePanel = new javax.swing.JPanel();
        pj1Separator = new javax.swing.JSeparator();
        jobText = new javax.swing.JLabel();
        nameShowText = new javax.swing.JLabel();
        fightingPanel = new javax.swing.JPanel();
        abilities = new javax.swing.JButton();
        attack = new javax.swing.JButton();
        run = new javax.swing.JButton();
        defense = new javax.swing.JButton();
        spellScroll = new javax.swing.JScrollPane();
        spellList = new javax.swing.JList<>();
        spellTextScroll = new javax.swing.JScrollPane();
        spellTextArea = new javax.swing.JTextArea();
        enemyPanel = new javax.swing.JPanel();
        eImgLabel = new javax.swing.JLabel();
        eHPText = new javax.swing.JLabel();
        eHPStat = new javax.swing.JLabel();
        potionPanel = new javax.swing.JPanel();
        useHPPotion = new javax.swing.JButton();
        useManaPotion = new javax.swing.JButton();
        hpPotionShowText = new javax.swing.JLabel();
        manaPotionShowText = new javax.swing.JLabel();
        hpPotionStat = new javax.swing.JLabel();
        manaPotionStat = new javax.swing.JLabel();
        eventPanel = new javax.swing.JPanel();
        eventScrollPane = new javax.swing.JScrollPane();
        eventTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 160, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pjPanel.setBackground(new java.awt.Color(150, 70, 200));
        pjPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        pjImgPanel.setOpaque(false);
        pjImgPanel.setPreferredSize(new java.awt.Dimension(0, 250));

        pj2Separator.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pjImgPanelLayout = new javax.swing.GroupLayout(pjImgPanel);
        pjImgPanel.setLayout(pjImgPanelLayout);
        pjImgPanelLayout.setHorizontalGroup(
                pjImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pj2Separator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addComponent(pjImgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pjImgPanelLayout.setVerticalGroup(
                pjImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pjImgPanelLayout.createSequentialGroup()
                                .addComponent(pjImgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pj2Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fightStats.setBackground(new java.awt.Color(102, 0, 102));
        fightStats.setAutoscrolls(true);
        fightStats.setOpaque(false);

        hpText.setText("HP :");

        manaText.setText("Mana :");

        degenseText.setText("Defense :");

        dmgText.setText("Damage :");

        hpStat.setText(Main.data.getHp()+"/"+Main.data.getMaxHp());

        defStat.setText(String.valueOf(Main.data.getDefense()));

        manaStat.setText(Main.data.getMana()+"/"+Main.data.getMaxMana());

        dmgStat.setText(String.valueOf(Main.data.getDamage()));

        javax.swing.GroupLayout fightStatsLayout = new javax.swing.GroupLayout(fightStats);
        fightStats.setLayout(fightStatsLayout);
        fightStatsLayout.setHorizontalGroup(
                fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fightStatsLayout.createSequentialGroup()
                                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(fightStatsLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(defStat))
                                        .addGroup(fightStatsLayout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(degenseText)
                                                        .addComponent(dmgText)
                                                        .addComponent(manaText)
                                                        .addComponent(hpText))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(fightStatsLayout.createSequentialGroup()
                                                                .addGap(47, 47, 47)
                                                                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(manaStat, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(hpStat, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                        .addComponent(dmgStat, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fightStatsLayout.setVerticalGroup(
                fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fightStatsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hpText)
                                        .addComponent(hpStat))
                                .addGap(18, 18, 18)
                                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(manaText, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(manaStat))
                                .addGap(18, 18, 18)
                                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(degenseText)
                                        .addComponent(defStat))
                                .addGap(18, 18, 18)
                                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dmgText)
                                        .addComponent(dmgStat))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        charStats.setOpaque(false);

        pj3Separator.setForeground(new java.awt.Color(255, 255, 255));

        strText.setText("Strength :");

        dexText.setText("Dexterity :");

        conText.setText("Constitution :");

        wisText.setText("Wisdom :");

        itlText.setText("Intelligence :");

        chaText.setText("Charisma :");

        jLabel2.setText(String.valueOf(Main.data.getAttStrength()));

        jLabel3.setText(String.valueOf(Main.data.getAttIntelligence()));

        jLabel4.setText(String.valueOf(Main.data.getAttDexterity()));

        jLabel5.setText(String.valueOf(Main.data.getAttConstitution()));

        jLabel6.setText(String.valueOf(Main.data.getAttWisdom()));

        jLabel7.setText(String.valueOf(Main.data.getAttCharisma()));

        javax.swing.GroupLayout charStatsLayout = new javax.swing.GroupLayout(charStats);
        charStats.setLayout(charStatsLayout);
        charStatsLayout.setHorizontalGroup(
                charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pj3Separator, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, charStatsLayout.createSequentialGroup()
                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(charStatsLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(charStatsLayout.createSequentialGroup()
                                                                .addComponent(chaText)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel7))
                                                        .addGroup(charStatsLayout.createSequentialGroup()
                                                                .addComponent(conText)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel5))
                                                        .addGroup(charStatsLayout.createSequentialGroup()
                                                                .addComponent(wisText)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel6))
                                                        .addGroup(charStatsLayout.createSequentialGroup()
                                                                .addComponent(itlText)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel3))))
                                        .addGroup(charStatsLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(dexText)
                                                        .addComponent(strText))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(33, 33, 33))
        );
        charStatsLayout.setVerticalGroup(
                charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(charStatsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pj3Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(strText)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dexText)
                                        .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(conText)
                                        .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(wisText)
                                        .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(itlText)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(chaText)
                                        .addComponent(jLabel7))
                                .addGap(41, 41, 41))
        );

        namePanel.setOpaque(false);

        pj1Separator.setForeground(new java.awt.Color(255, 255, 255));

        jobText.setText(Main.data.getJobName());

        nameShowText.setText(Main.data.getName() + " " + Main.data.getSurname());

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
                namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pj1Separator)
                        .addGroup(namePanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameShowText, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jobText, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(33, Short.MAX_VALUE))
        );
        namePanelLayout.setVerticalGroup(
                namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namePanelLayout.createSequentialGroup()
                                .addComponent(nameShowText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(jobText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pj1Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout pjPanelLayout = new javax.swing.GroupLayout(pjPanel);
        pjPanel.setLayout(pjPanelLayout);
        pjPanelLayout.setHorizontalGroup(
                pjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pjImgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addComponent(charStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(namePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pjPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fightStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        pjPanelLayout.setVerticalGroup(
                pjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pjPanelLayout.createSequentialGroup()
                                .addComponent(pjImgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fightStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(charStats, javax.swing.GroupLayout.PREFERRED_SIZE, 225, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel1.add(pjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1013, 2, 250, 700));

        fightingPanel.setBackground(new java.awt.Color(114, 78, 233));
        fightingPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        abilities.setBackground(new java.awt.Color(22, 5, 80));
        abilities.setText("Use Spell");
        abilities.addActionListener(this);

        attack.setBackground(new java.awt.Color(22, 5, 80));
        attack.setText("Attack");
        attack.addActionListener(this);

        run.setBackground(new java.awt.Color(22, 5, 80));
        run.setText("Run");
        run.addActionListener(this);

        defense.setBackground(new java.awt.Color(22, 5, 80));
        defense.setText("Defense");
        defense.addActionListener(this);

        spellScroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        spellList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Spell1","Spell2","Spell3","Spell4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        spellList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spellList.setToolTipText("");
        spellList.setName(""); // NOI18N
        spellList.setVisibleRowCount(4);
        spellScroll.setViewportView(spellList);
        spellList.getAccessibleContext().setAccessibleName("");

        spellTextArea.setColumns(20);
        spellTextArea.setRows(5);
        spellTextScroll.setViewportView(spellTextArea);

        javax.swing.GroupLayout fightingPanelLayout = new javax.swing.GroupLayout(fightingPanel);
        fightingPanel.setLayout(fightingPanelLayout);
        fightingPanelLayout.setHorizontalGroup(
                fightingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fightingPanelLayout.createSequentialGroup()
                                .addGroup(fightingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fightingPanelLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(defense, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(run, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fightingPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(attack, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(abilities, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(spellScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spellTextScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        fightingPanelLayout.setVerticalGroup(
                fightingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fightingPanelLayout.createSequentialGroup()
                                .addGroup(fightingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fightingPanelLayout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(fightingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(attack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(abilities, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(fightingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(run, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(defense, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(fightingPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(fightingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(spellScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                                        .addComponent(spellTextScroll))))
                                .addGap(58, 58, 58))
        );

        jPanel1.add(fightingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 1000, 150));

        eHPText.setText("HP:");

        eHPStat.setText("100/100");

        javax.swing.GroupLayout enemyPanelLayout = new javax.swing.GroupLayout(enemyPanel);
        enemyPanel.setLayout(enemyPanelLayout);
        enemyPanelLayout.setHorizontalGroup(
                enemyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(eImgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(enemyPanelLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(eHPText)
                                .addGap(18, 18, 18)
                                .addComponent(eHPStat)
                                .addContainerGap(75, Short.MAX_VALUE))
        );
        enemyPanelLayout.setVerticalGroup(
                enemyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(enemyPanelLayout.createSequentialGroup()
                                .addComponent(eImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(enemyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(eHPText)
                                        .addComponent(eHPStat))
                                .addGap(0, 20, Short.MAX_VALUE))
        );

        jPanel1.add(enemyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 240, 250));

        useHPPotion.setText("jButton1");
        useHPPotion.setMaximumSize(new java.awt.Dimension(65, 65));
        useHPPotion.setMinimumSize(new java.awt.Dimension(65, 65));
        useHPPotion.setPreferredSize(new java.awt.Dimension(65, 65));

        useManaPotion.setText("jButton1");
        useManaPotion.setMaximumSize(new java.awt.Dimension(65, 65));
        useManaPotion.setMinimumSize(new java.awt.Dimension(65, 65));
        useManaPotion.setPreferredSize(new java.awt.Dimension(65, 65));

        hpPotionShowText.setText("HP");

        manaPotionShowText.setText("MANA");

        hpPotionStat.setText("10");

        manaPotionStat.setText("10");

        javax.swing.GroupLayout potionPanelLayout = new javax.swing.GroupLayout(potionPanel);
        potionPanel.setLayout(potionPanelLayout);
        potionPanelLayout.setHorizontalGroup(
                potionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(potionPanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(hpPotionShowText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manaPotionShowText)
                                .addGap(46, 46, 46))
                        .addGroup(potionPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(useHPPotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(useManaPotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                        .addGroup(potionPanelLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(hpPotionStat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manaPotionStat)
                                .addGap(58, 58, 58))
        );
        potionPanelLayout.setVerticalGroup(
                potionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, potionPanelLayout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addGroup(potionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hpPotionShowText)
                                        .addComponent(manaPotionShowText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(potionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(useHPPotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(useManaPotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(potionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hpPotionStat)
                                        .addComponent(manaPotionStat))
                                .addGap(22, 22, 22))
        );

        jPanel1.add(potionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 240, 160));

        eventTextArea.setColumns(20);
        eventTextArea.setRows(5);
        eventScrollPane.setViewportView(eventTextArea);

        javax.swing.GroupLayout eventPanelLayout = new javax.swing.GroupLayout(eventPanel);
        eventPanel.setLayout(eventPanelLayout);
        eventPanelLayout.setHorizontalGroup(
                eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(eventScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        eventPanelLayout.setVerticalGroup(
                eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(eventScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        jPanel1.add(eventPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 620, 440));

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
    }// </editor-fold>

    private void abilitiesActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void attackActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void runActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void defenseActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify
    private javax.swing.JButton abilities;
    private javax.swing.JButton attack;
    private javax.swing.JLabel chaText;
    private javax.swing.JPanel charStats;
    private javax.swing.JLabel conText;
    private javax.swing.JLabel defStat;
    private javax.swing.JButton defense;
    private javax.swing.JLabel degenseText;
    private javax.swing.JLabel dexText;
    private javax.swing.JLabel dmgStat;
    private javax.swing.JLabel dmgText;
    private javax.swing.JLabel eHPStat;
    private javax.swing.JLabel eHPText;
    private javax.swing.JLabel eImgLabel;
    private javax.swing.JPanel enemyPanel;
    private javax.swing.JPanel eventPanel;
    private javax.swing.JScrollPane eventScrollPane;
    private javax.swing.JTextArea eventTextArea;
    private javax.swing.JPanel fightStats;
    private javax.swing.JPanel fightingPanel;
    private javax.swing.JLabel hpPotionShowText;
    private javax.swing.JLabel hpPotionStat;
    private javax.swing.JLabel hpStat;
    private javax.swing.JLabel hpText;
    private javax.swing.JLabel itlText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jobText;
    private javax.swing.JLabel manaPotionShowText;
    private javax.swing.JLabel manaPotionStat;
    private javax.swing.JLabel manaStat;
    private javax.swing.JLabel manaText;
    private javax.swing.JPanel namePanel;
    private javax.swing.JLabel nameShowText;
    private javax.swing.JSeparator pj1Separator;
    private javax.swing.JSeparator pj2Separator;
    private javax.swing.JSeparator pj3Separator;
    private javax.swing.JLabel pjImgLabel;
    private javax.swing.JPanel pjImgPanel;
    private javax.swing.JPanel pjPanel;
    private javax.swing.JPanel potionPanel;
    private javax.swing.JButton run;
    private javax.swing.JList<String> spellList;
    private javax.swing.JScrollPane spellScroll;
    private javax.swing.JTextArea spellTextArea;
    private javax.swing.JScrollPane spellTextScroll;
    private javax.swing.JLabel strText;
    private javax.swing.JButton useHPPotion;
    private javax.swing.JButton useManaPotion;
    private javax.swing.JLabel wisText;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == abilities){

        }else if (e.getSource() == attack){
            Main.enemy.seteHp(Main.ab.attack(Main.enemy.geteHp()));
            if (Main.enemy.geteHp() == 0){

            }
        }else if(e.getSource() == defense){

        }else if (e.getSource() == run){

        }
    }
    // End of variables declaration
}

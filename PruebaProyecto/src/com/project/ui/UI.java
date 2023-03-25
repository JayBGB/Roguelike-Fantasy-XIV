

package com.project.ui;


import com.project.game.Main;

import javax.swing.*;
import java.awt.event.*;

import com.project.combat.Combat;

import com.projectLibrary.mathematics.math;


public class UI extends javax.swing.JFrame implements ActionListener {

    boolean defenseCase = false;
    boolean noPotionsCase = false;
    boolean enemyDead = false;
    boolean notEnhoughManaCase = false;
    int enemyCount = 0;

    public UI(){
        initComponents();
    }

    private void initComponents() {

        float spellDmg;
        jPanel1 = new JPanel();
        pjPanel = new JPanel();
        pjImgPanel = new JPanel();
        pj2Separator = new javax.swing.JSeparator();
        pjImgLabel = new JLabel();
        fightStats = new JPanel();
        hpText = new JLabel();
        manaText = new JLabel();
        degenseText = new JLabel();
        dmgText = new JLabel();
        hpStat = new JLabel();
        defStat = new JLabel();
        manaStat = new JLabel();
        dmgStat = new JLabel();
        charStats = new JPanel();
        pj3Separator = new javax.swing.JSeparator();
        strText = new JLabel();
        dexText = new JLabel();
        conText = new JLabel();
        wisText = new JLabel();
        itlText = new JLabel();
        chaText = new JLabel();
        strStat = new JLabel();
        itlStat = new JLabel();
        dexStat = new JLabel();
        conStat = new JLabel();
        wisStat = new JLabel();
        chaStat = new JLabel();
        namePanel = new JPanel();
        pj1Separator = new javax.swing.JSeparator();
        jobText = new JLabel();
        nameShowText = new JLabel();
        fightingPanel = new JPanel();
        abilities = new JButton();
        attack = new JButton();
        run = new JButton();
        defense = new JButton();
        spellScroll = new JScrollPane();
        spellList = new javax.swing.JList<>();
        spellTextScroll = new JScrollPane();
        spellTextArea = new JTextArea();
        enemyPanel = new JPanel();
        eImgLabel = new JLabel();
        eHPText = new JLabel();
        eHPStat = new JLabel();
        potionPanel = new JPanel();
        useHPPotion = new JButton();
        useManaPotion = new JButton();
        hpPotionShowText = new JLabel();
        manaPotionShowText = new JLabel();
        hpPotionStat = new JLabel();
        manaPotionStat = new JLabel();
        eventPanel = new JPanel();
        eventScrollPane = new JScrollPane();
        eventTextArea = new JTextArea();

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
        pjImgLabel.setIcon(new ImageIcon("PruebaProyecto/src/com/project/images/vieraBLM.png"));

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

        dmgStat.setText(String.valueOf(math.floatFormat.format(Main.data.getDamage())));

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

        strStat.setText(String.valueOf(Main.data.getAttStrength()));

        itlStat.setText(String.valueOf(Main.data.getAttIntelligence()));

        dexStat.setText(String.valueOf(Main.data.getAttDexterity()));

        conStat.setText(String.valueOf(Main.data.getAttConstitution()));

        wisStat.setText(String.valueOf(Main.data.getAttWisdom()));

        chaStat.setText(String.valueOf(Main.data.getAttCharisma()));

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
                                                                .addComponent(chaStat))
                                                        .addGroup(charStatsLayout.createSequentialGroup()
                                                                .addComponent(conText)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(conStat))
                                                        .addGroup(charStatsLayout.createSequentialGroup()
                                                                .addComponent(wisText)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(wisStat))
                                                        .addGroup(charStatsLayout.createSequentialGroup()
                                                                .addComponent(itlText)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(itlStat))))
                                        .addGroup(charStatsLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(dexText)
                                                        .addComponent(strText))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(strStat, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(dexStat, javax.swing.GroupLayout.Alignment.TRAILING))))
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
                                        .addComponent(strStat))
                                .addGap(18, 18, 18)
                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dexText)
                                        .addComponent(dexStat))
                                .addGap(18, 18, 18)
                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(conText)
                                        .addComponent(conStat))
                                .addGap(18, 18, 18)
                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(wisText)
                                        .addComponent(wisStat))
                                .addGap(18, 18, 18)
                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(itlText)
                                        .addComponent(itlStat))
                                .addGap(18, 18, 18)
                                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(chaText)
                                        .addComponent(chaStat))
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
            String[] spellStringName = Main.combat.createSpellNameList();
            public int getSize() { return spellStringName.length; }
            public String getElementAt(int i) { return spellStringName[i]; }
        });

        spellList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spellList.setToolTipText("");
        spellList.setName("");
        spellList.setVisibleRowCount(4);
        MouseListener mouseListener = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    int selectedSpell = spellList.getSelectedIndex();
                    spellTextArea.setText(Combat.spellArray.get(selectedSpell).getSpellInfo());

                }
            }
        };
        spellList.addMouseListener(mouseListener);
        spellScroll.setViewportView(spellList);
        spellList.getAccessibleContext().setAccessibleName("");

        spellTextArea.setColumns(20);
        spellTextArea.setRows(5);
        spellTextArea.setEditable(false);
        spellTextArea.setLineWrap(true);
        spellTextArea.setWrapStyleWord(true);
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

        eHPText.setText(Main.enemyData.geteName() + ":");

        eHPStat.setText(Main.enemyData.geteHp() + "/" + Main.enemyData.geteMaxHp());

        javax.swing.GroupLayout enemyPanelLayout = new javax.swing.GroupLayout(enemyPanel);
        enemyPanel.setLayout(enemyPanelLayout);
        enemyPanelLayout.setHorizontalGroup(
                enemyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(eImgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(enemyPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
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
        useHPPotion.addActionListener(this);

        useManaPotion.setText("jButton1");
        useManaPotion.setMaximumSize(new java.awt.Dimension(65, 65));
        useManaPotion.setMinimumSize(new java.awt.Dimension(65, 65));
        useManaPotion.setPreferredSize(new java.awt.Dimension(65, 65));
        useManaPotion.addActionListener(this);

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
        eventTextArea.setEditable(false);
        eventTextArea.setLineWrap(true);
        eventTextArea.setWrapStyleWord(true);
        eventTextArea.setText("You encounter a " + Main.enemyData.geteName());
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


    // Variables declaration - do not modify
    private JButton abilities;
    private JButton attack;
    private JLabel chaText;
    private JPanel charStats;
    private JLabel conText;
    private JLabel defStat;
    private JButton defense;
    private JLabel degenseText;
    private JLabel dexText;
    private JLabel dmgStat;
    private JLabel dmgText;
    private JLabel eHPStat;
    private JLabel eHPText;
    private JLabel eImgLabel;
    private JPanel enemyPanel;
    private JPanel eventPanel;
    private JScrollPane eventScrollPane;
    private JTextArea eventTextArea;
    private JPanel fightStats;
    private JPanel fightingPanel;
    private JLabel hpPotionShowText;
    private JLabel hpPotionStat;
    private JLabel hpStat;
    private JLabel hpText;
    private JLabel itlText;
    private JLabel strStat;
    private JLabel itlStat;
    private JLabel dexStat;
    private JLabel conStat;
    private JLabel wisStat;
    private JLabel chaStat;
    private JPanel jPanel1;
    private JLabel jobText;
    private JLabel manaPotionShowText;
    private JLabel manaPotionStat;
    private JLabel manaStat;
    private JLabel manaText;
    private JPanel namePanel;
    private JLabel nameShowText;
    private javax.swing.JSeparator pj1Separator;
    private javax.swing.JSeparator pj2Separator;
    private javax.swing.JSeparator pj3Separator;
    private JLabel pjImgLabel;
    private JPanel pjImgPanel;
    private JPanel pjPanel;
    private JPanel potionPanel;
    private JButton run;
    private JList<String> spellList;
    private JScrollPane spellScroll;
    private JTextArea spellTextArea;
    private JScrollPane spellTextScroll;
    private JLabel strText;
    private JButton useHPPotion;
    private JButton useManaPotion;
    private JLabel wisText;

    public void combatUIRefresh(){

    }

    public void refreshCombatUI(){
        eHPStat.setText(String.valueOf(math.floatFormat.format(Main.enemyData.geteHp())));
        eHPText.setText(String.valueOf(Main.enemyData.geteName()));
        hpPotionStat.setText(String.valueOf(Main.hpPotions.getQuantity()));
        manaPotionStat.setText(String.valueOf(Main.manaPotions.getQuantity()));
        hpStat.setText(math.floatFormat.format(Main.data.getHp())+"/"+ math.floatFormat.format(Main.data.getMaxHp()));
        defStat.setText(String.valueOf(Main.data.getDefense()));
        manaStat.setText( math.floatFormat.format(Main.data.getMana())+"/"+ math.floatFormat.format(Main.data.getMaxMana()));
        dmgStat.setText(String.valueOf(math.floatFormat.format(Main.data.getDamage())));
        strStat.setText(String.valueOf(Main.data.getAttStrength()));
        dexStat.setText(String.valueOf(Main.data.getAttDexterity()));
        conStat.setText(String.valueOf(Main.data.getAttConstitution()));
        wisStat.setText(String.valueOf(Main.data.getAttWisdom()));
        chaStat.setText(String.valueOf(Main.data.getAttCharisma()));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == abilities){
            boolean checkSpell;
            checkSpell = Main.combat.useSpell(spellList.getSelectedIndex(),Combat.spellArray);
            if (checkSpell) {
                eventTextArea.append("\nYou use the spell " + spellList.getSelectedValue() + " on " + Main.enemyData.geteName() + "\n");
            }else if(!checkSpell) {
                notEnhoughManaCase = true;
                eventTextArea.append("\nYou don't have enough mana\n");
                refreshCombatUI();
            }
        }if (e.getSource() == attack){
               Main.combat.doDamage(Main.data.getDamage());
               eventTextArea.append("\nYou damage " + Main.enemyData.geteName() + " for " + math.floatFormat.format(Main.data.getDamage()) + " damage.\n");
               refreshCombatUI();
        }if(e.getSource() == defense){
                Main.combat.defense(Main.enemyData.geteDmg(),Main.data.getDefensePercentage());
                defenseCase = true;
                refreshCombatUI();
        }if (e.getSource() == run){

        }if (e.getSource() == useHPPotion){
            if (Main.hpPotions.getQuantity() - 1 <= 0) {
                Main.hpPotions.setQuantity(0);
                eventTextArea.append("\nYou don't have HP potions left\n");
                noPotionsCase = true;
            }else {
                Main.hpPotions.setQuantity(Main.hpPotions.getQuantity() - 1);
                Main.combat.doHeal(Main.hpPotions.getValue());
                eventTextArea.append("\nYou use an HP potion and restore " + math.floatFormat.format(Main.hpPotions.getValue()) + " health.\n");
            }
            refreshCombatUI();
        }if (e.getSource() == useManaPotion) {
            if (Main.manaPotions.getQuantity() - 1 <= 0) {
                Main.manaPotions.setQuantity(0);
                eventTextArea.append("\nYou don't have mana potions left\n");
                noPotionsCase = true;
            } else {
                Main.manaPotions.setQuantity(Main.manaPotions.getQuantity() - 1);
                Main.combat.doMana(Main.manaPotions.getValue());
                eventTextArea.append("\nYou use a Mana potion and restore " + math.floatFormat.format(-Main.manaPotions.getValue()) + " mana.\n");
            }
            refreshCombatUI();
        }
        try {
            if (Main.combat.checkStateCombat() == 2) {
                eventTextArea.setText("\n You won the fight and got " + Main.gold.addGold() + ".\n");
                enemyCount ++;
                enemyDead = true;
                if (enemyCount == 9){
                    Main.enemyData.createBoss();
                    enemyCount = 0;
                }else {
                    Main.enemyData.createEnemy();
                }
                Main.combat.setEnemyIsAlive(true);
                refreshCombatUI();
                eventTextArea.setText("You encounter a " + Main.enemyData.geteName());
            } else if (Main.combat.checkStateCombat() == 1) {
                eventTextArea.append("\n You lost the fight, going back to lobby \n");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        if (!defenseCase && !noPotionsCase && !enemyDead) {
            Main.combat.enemyTurn();
            refreshCombatUI();
        }else {
            defenseCase = false;
            noPotionsCase = false;
            enemyDead = false;
            notEnhoughManaCase = false;
        }
    }
}

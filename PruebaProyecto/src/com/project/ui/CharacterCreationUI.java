package com.project.ui;

import com.project.game.CharacterCreation;
import com.project.game.Main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterCreationUI extends javax.swing.JFrame implements ActionListener {

    public CharacterCreationUI() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        creationSurnameText = new javax.swing.JLabel();
        creationNameWrite = new javax.swing.JTextField();
        creationNameText = new javax.swing.JLabel();
        creationSurnameWrite = new javax.swing.JTextField();
        creationJobText = new javax.swing.JLabel();
        creationJobBox = new javax.swing.JComboBox<>();
        creationRaceText = new javax.swing.JLabel();
        creationJobDescPanel = new javax.swing.JScrollPane();
        creationJobDescription = new javax.swing.JTextArea();
        creationRaceDescPanel = new javax.swing.JScrollPane();
        creationRaceDescription = new javax.swing.JTextArea();
        creationPhoto = new javax.swing.JLabel();
        creationRaceBox = new javax.swing.JComboBox<>();
        creationTitle = new javax.swing.JLabel();
        creationContinueButton = new javax.swing.JButton();
        creationBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(new java.awt.Dimension(1280, 720));

        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

        int posX = (pantalla.width - this.getWidth()) / 2;
        int posY = (pantalla.height - this.getHeight()) / 2;

        this.setLocation(posX, posY);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creationSurnameText.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        creationSurnameText.setText("Character Surname :");
        jPanel1.add(creationSurnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        creationNameWrite.setBackground(new java.awt.Color(204, 204, 255));
        creationNameWrite.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        creationNameWrite.addActionListener(this);
        jPanel1.add(creationNameWrite, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 180, -1));

        creationNameText.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        creationNameText.setText("Character Name :");
        jPanel1.add(creationNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        creationSurnameWrite.setBackground(new java.awt.Color(204, 204, 255));
        creationSurnameWrite.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        creationSurnameWrite.addActionListener(this);
        creationSurnameWrite.setEditable(false);
        jPanel1.add(creationSurnameWrite, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, -1));

        creationJobText.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        creationJobText.setText("Character Job:");
        jPanel1.add(creationJobText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 180, -1));

        creationJobBox.setBackground(new java.awt.Color(204, 204, 255));
        creationJobBox.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        creationJobBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Warrior", "Bard", "Black Mage", "Astrologian" }));
        creationJobBox.addActionListener(this);
        creationJobBox.setEnabled(false);
        creationJobBox.setSelectedItem(null);
        jPanel1.add(creationJobBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 180, -1));

        creationRaceText.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        creationRaceText.setText("Character Race:");
        jPanel1.add(creationRaceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 180, -1));

        creationJobDescription.setBackground(new java.awt.Color(204, 204, 255));
        creationJobDescription.setColumns(20);
        creationJobDescription.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        creationJobDescription.setRows(5);
        creationJobDescription.setEditable(false);
        creationJobDescription.setLineWrap(true);
        creationJobDescription.setWrapStyleWord(true);
        creationRaceDescription.setText(CharacterCreation.raceDescription);
        creationJobDescPanel.setViewportView(creationJobDescription);

        jPanel1.add(creationJobDescPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 360, 100));

        creationRaceDescription.setBackground(new java.awt.Color(204, 204, 255));
        creationRaceDescription.setColumns(20);
        creationRaceDescription.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        creationRaceDescription.setRows(5);
        creationRaceDescription.setEditable(false);
        creationRaceDescription.setLineWrap(true);
        creationRaceDescription.setWrapStyleWord(true);
        creationRaceDescPanel.setViewportView(creationRaceDescription);

        jPanel1.add(creationRaceDescPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 360, 100));

        creationPhoto.setBackground(new java.awt.Color(0, 0, 0));
        creationPhoto.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 204, 255)));
        creationPhoto.setMaximumSize(new java.awt.Dimension(246, 250));
        creationPhoto.setMinimumSize(new java.awt.Dimension(246, 250));
        creationPhoto.setVisible(false);
        creationPhoto.setPreferredSize(new java.awt.Dimension(246, 250));
        jPanel1.add(creationPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 246, 250));

        creationRaceBox.setBackground(new java.awt.Color(204, 204, 255));
        creationRaceBox.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        creationRaceBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Hyur", "Elezen", "Miqo'te", "Roegadyn", "Lalafell", "Au Ra", "Viera", "Hrothgar"}));
        creationRaceBox.setEnabled(false);
        creationRaceBox.addActionListener(this);
        creationRaceBox.setSelectedItem(null);
        jPanel1.add(creationRaceBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, -1));

        creationTitle.setFont(new java.awt.Font("Adventure ReQuest", 0, 48)); // NOI18N
        creationTitle.setText("ROGUELIKE FANTASY XIV");
        jPanel1.add(creationTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 800, 90));

        creationContinueButton.setBackground(new java.awt.Color(204, 204, 255));
        creationContinueButton.setFont(new java.awt.Font("Adventure ReQuest", 0, 12)); // NOI18N
        creationContinueButton.setText("CONTINUE");
        creationContinueButton.setEnabled(false);
        creationContinueButton.addActionListener(this);
        jPanel1.add(creationContinueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 240, 70));

        creationBackground.setIcon(new javax.swing.ImageIcon("PruebaProyecto/src/com/project/images/backgrounds/backgroundCC.png")); // NOI18N
        jPanel1.add(creationBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

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
    private javax.swing.JLabel creationBackground;
    private javax.swing.JButton creationContinueButton;
    private javax.swing.JComboBox<String> creationJobBox;
    private javax.swing.JScrollPane creationJobDescPanel;
    private javax.swing.JTextArea creationJobDescription;
    private javax.swing.JLabel creationJobText;
    private javax.swing.JLabel creationNameText;
    private javax.swing.JTextField creationNameWrite;
    private javax.swing.JLabel creationPhoto;
    private javax.swing.JComboBox<String> creationRaceBox;
    private javax.swing.JScrollPane creationRaceDescPanel;
    private javax.swing.JTextArea creationRaceDescription;
    private javax.swing.JLabel creationRaceText;
    private javax.swing.JLabel creationSurnameText;
    private javax.swing.JTextField creationSurnameWrite;
    private javax.swing.JLabel creationTitle;
    private javax.swing.JPanel jPanel1;

    public void refreshCharacterCreationUI(){
        creationRaceDescription.setText(CharacterCreation.raceDescription);
        creationJobDescription.setText(CharacterCreation.jobDescription);
        creationPhoto.setIcon(new ImageIcon(CharacterCreation.heroImgUrl + ".png"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == creationNameWrite){
            Main.data.setName(creationNameWrite.getText());
            creationSurnameWrite.setEditable(true);
        }else if (e.getSource() == creationSurnameWrite){
            Main.data.setSurname(creationSurnameWrite.getText());
            creationRaceBox.setEnabled(true);
        }else if (e.getSource() == creationRaceBox){
            Main.data.setRace(creationRaceBox.getSelectedIndex());
            Main.data.setJob(creationJobBox.getSelectedIndex());
            Main.charCreation.setRace();
            creationJobBox.setEnabled(true);
            refreshCharacterCreationUI();
        }else if (e.getSource() == creationJobBox){
            Main.data.setJob(creationJobBox.getSelectedIndex());
            Main.charCreation.setClass();
            creationContinueButton.setEnabled(true);
            creationPhoto.setVisible(true);
            refreshCharacterCreationUI();
        }else if (e.getSource() == creationContinueButton){
            UIpointAllocation.points = 5;
            UIpointAllocation.maxPoints = 5;
            Main.data.setAttStrength(Main.data.getAttStrength() + CharacterCreation.tempStr);
            Main.data.setAttDexterity(Main.data.getAttDexterity() + CharacterCreation.tempDex);
            Main.data.setAttConstitution(Main.data.getAttConstitution() + CharacterCreation.tempCon);
            Main.data.setAttIntelligence(Main.data.getAttIntelligence() + CharacterCreation.tempItl);
            Main.data.setAttWisdom(Main.data.getAttWisdom() + CharacterCreation.tempWis);
            Main.data.setAttCharisma(Main.data.getAttCharisma() + CharacterCreation.tempCha);
            Main.paUI = new UIpointAllocation();
            Main.paUI.setVisible(true);
            this.dispose();
        }
    }
}


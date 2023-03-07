package com.project.ui;

import com.project.game.Main;

import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {

      public UI(){
            super("MainScreen");
            setLayout(new BorderLayout());
            setPreferredSize(new Dimension(1280,720));
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            this.setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint());
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //PJ panel
            JPanel pj = new JPanel();
            pj.setLayout(new BoxLayout(pj,BoxLayout.PAGE_AXIS));
            pj.setBorder(BorderFactory.createEmptyBorder(50,0,50,50));
            JLabel line = new JLabel("-----------------");
            JLabel hp = new JLabel("HP: " + Main.data.getMaxHp() + "/" + Main.data.getHp());
            hp.setBorder(BorderFactory.createEmptyBorder(10,0,10,10));
            JLabel mana = new JLabel("Mana: " + Main.data.getMaxMana() + "/" + Main.data.getMana());
            mana.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
            JLabel defense = new JLabel("Defense: " + Main.data.getDefense());
            defense.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
            JLabel strLabel = new JLabel("Strngth: " + Main.data.getAttStrength());
            strLabel.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
            strLabel.setFont(new Font("Arial", Font.PLAIN, 12));
            JLabel dexLabel = new JLabel("Dexterity: " + Main.data.getAttDexterity());
            dexLabel.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
            dexLabel.setFont(new Font("Serif", Font.PLAIN, 12));
            JLabel conLabel = new JLabel("Constitution: " + Main.data.getAttConstitution());
            conLabel.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
            conLabel.setFont(new Font("Serif", Font.PLAIN, 12));
            JLabel wisLabel = new JLabel("Wisdom: " + Main.data.getAttWisdom());
            wisLabel.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
            wisLabel.setFont(new Font("Serif", Font.PLAIN, 12));
            JLabel intLabel = new JLabel("Inteligence: " + Main.data.getAttIntelligence());
            intLabel.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
            intLabel.setFont(new Font("Serif", Font.PLAIN, 12));
            JLabel chaLabel = new JLabel("Charisma: " + Main.data.getAttCharisma());
            chaLabel.setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
            chaLabel.setFont(new Font("Serif", Font.PLAIN, 12));
            pj.setBorder(BorderFactory.createLineBorder(Color.blue,3,false));
            pj.add(hp);
            pj.add(mana);
            pj.add(defense);
            pj.add(line);
            pj.add(strLabel);
            pj.add(dexLabel);
            pj.add(conLabel);
            pj.add(wisLabel);
            pj.add(intLabel);
            pj.add(chaLabel);
            add(pj, BorderLayout.EAST);


            JPanel attackBar = new JPanel();
            attackBar.setOpaque(false);
            JProgressBar hpBar = new JProgressBar();
            JComboBox abBar = new JComboBox<String>(new String[]{"1","2"});
            JButton atck = new JButton("Attack");
            JButton def = new JButton("Def");
            JButton ab = new JButton("Abilities");
            JButton run = new JButton("Run");
            atck.setPreferredSize(new Dimension(100,50));
            def.setPreferredSize(new Dimension(100,50));
            ab.setPreferredSize(new Dimension(100,50));
            run.setPreferredSize(new Dimension(100,50));
            attackBar.add(atck);
            attackBar.add(run);
            attackBar.add(def);
            attackBar.add(ab);
            attackBar.add(abBar);

            add(attackBar, BorderLayout.SOUTH);
            pack();
      }
}

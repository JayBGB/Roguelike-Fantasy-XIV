package com.project.ui;

import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {

      public UI(){
            super("MainScreen");
            setLayout(new BorderLayout());
            setSize(1280,720);
            setLocationRelativeTo(null);
            setVisible(true);
            JPanel attackBar = new JPanel();
            JLabel random = new JLabel("TextoTextoTextoTextoTextoTextoTextoTexto");
            JButton atck = new JButton("Attack");
            JButton def = new JButton("Def");
            JButton ab = new JButton("Abilities");
            JButton it = new JButton("Items");
            atck.setPreferredSize(new Dimension(100,50));
            def.setPreferredSize(new Dimension(100,50));
            ab.setPreferredSize(new Dimension(100,50));
            it.setPreferredSize(new Dimension(100,50));
            atck.setLocation(0,0);
            attackBar.add(atck);
            attackBar.add(it);
            attackBar.add(def);
            attackBar.add(ab);
            add(attackBar, BorderLayout.SOUTH);
            attackBar.add(random);
      }
}

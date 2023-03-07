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
            JButton atck = new JButton("Attack");
            JButton def = new JButton("Def");
            JButton ab = new JButton("Abilities");
            JButton it = new JButton("Items");
            atck.setPreferredSize(new Dimension(200,100));
            def.setPreferredSize(new Dimension(200,100));
            ab.setPreferredSize(new Dimension(200,100));
            it.setPreferredSize(new Dimension(200,100));
            add(atck, BorderLayout.SOUTH);
            atck.add(it);
            it.add(def);
            def.add(ab);
      }
}

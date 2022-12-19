package com.asip;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HoldCardListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if(button.isSelected()){
            button.setSelected(false);
        }else{
            button.setSelected(true);
        }
        System.out.println("Holding Card");
    }
}

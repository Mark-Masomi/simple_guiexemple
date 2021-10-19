package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simple_gui implements ActionListener {
    private int count=0;
    private JFrame frame;
    private JButton button;
    private JLabel label;


    public simple_gui(){
        frame=new JFrame();

        button = new JButton(" the klicker");
        button.addActionListener(this);
        label=new JLabel("number of klicks : "+count);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(40,40,40,40));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        button.setFocusable(false);


        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("the gui");
        frame.setSize(300,200);
        frame.setLocation(500,200);
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count ++;
        label.setText("number of klicks :" +count);
    }

}

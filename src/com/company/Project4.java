package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Project4 {

    public static void main(String[] args)
    {


    }

    public Project4()
    {
        this.GUI();
    }

    public void GUI()
    {
        //defining the JFrame
        JFrame frame = new JFrame("Real Estate Database");

        frame.setSize(400, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);

        JLabel transNoLabel = new JLabel();
        frame.add(transNoLabel);


        JTextField transNoField = new JTextField();

        JLabel addressLabel = new JLabel();

        JTextField addressField = new JTextField();

        JLabel bedroomLabel = new JLabel();

        JTextField bedroomField = new JTextField();

        JLabel sqFtLabel = new JLabel();

        JTextField sqFtField = new JTextField();

        JLabel priceLabel = new JLabel();

        JTextField priceField = new JTextField();

        JButton processButton = new JButton();

        String processAry[] = {"Insert", "Delete", "Find"};
        JComboBox processCombo = new JComboBox(processAry);

        processCombo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent process) {
                if (process.getStateChange() == ItemEvent.SELECTED) {
                }
            }
        });

        JButton statusButton = new JButton();

        String statusAry[] = {"FOR_SALE", "UNDER_CONTRACT", "SOLD"};
        JComboBox statusCombo = new JComboBox(statusAry);

        statusCombo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent status) {
                if (status.getStateChange() == ItemEvent.SELECTED) {
                }
            }
        });




    }





}

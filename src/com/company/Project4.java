package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.TreeMap;

public class Project4 {

    TreeMap<Integer, Property> dataBase = new TreeMap<Integer, Property>();



    public static void main(String[] args)
    {
        new Project4();
    }

    public Project4()
    {
        this.GUI();
    }

    public void GUI()
    {
        //defining the JFrame
        JFrame frame = new JFrame("Real Estate Database");

        frame.setSize(350, 250);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);

        JLabel transNoLabel = new JLabel("Transaction No: ");
        panel.add(transNoLabel);
        transNoLabel.setBounds(10,12,125,25);


        JTextField transNoField = new JTextField();
        panel.add(transNoField);
        transNoField.setBounds(150,10,200, 30);


        JLabel addressLabel = new JLabel("Address: ");
        panel.add(addressLabel);
        addressLabel.setBounds(10, 42, 125, 25);

        JTextField addressField = new JTextField();
        panel.add(addressField);
        addressField.setBounds(150, 40, 200, 30);


        JLabel bedroomLabel = new JLabel("Bedrooms: ");
        panel.add(bedroomLabel);
        bedroomLabel.setBounds(10, 72, 125, 25);

        JTextField bedroomField = new JTextField();
        panel.add(bedroomField);
        bedroomField.setBounds(150, 70, 200, 30);


        JLabel sqFtLabel = new JLabel("Square Footage: ");
        panel.add(sqFtLabel);
        sqFtLabel.setBounds(10, 102, 125, 25);

        JTextField sqFtField = new JTextField();
        panel.add(sqFtField);
        sqFtField.setBounds(150, 100, 200, 30);


        JLabel priceLabel = new JLabel("Price: ");
        panel.add(priceLabel);
        priceLabel.setBounds(10,132, 125, 25);

        JTextField priceField = new JTextField();
        panel.add(priceField);
        priceField.setBounds(150, 130, 200, 30);

        /* *** PROCESS BUTTON ***  */
        JButton processButton = new JButton("Process");
        panel.add(processButton);
        processButton.setBounds(10, 162, 150, 30);

         processButton.addActionListener(new ActionListener()
                                         {
                                             public void actionPerformed(ActionEvent e) {
                                                 //checking to see if fields are integers...
                                                 int tTest = 0;
                                                 int sTest = 0;
                                                 int pTest = 0;
                                                 int bTest = 0;
                                                 boolean isInt1 = false;
                                                 boolean isInt2 = false;
                                                 boolean isInt3 = false;
                                                 boolean isInt4 = false;

                                                 try {
                                                     tTest = Integer.parseInt(transNoField.getText());
                                                     isInt1 = true;
                                                     sTest = Integer.parseInt(sqFtField.getText());
                                                     isInt2 = true;
                                                     pTest = Integer.parseInt(priceField.getText());
                                                     isInt3 = true;
                                                     bTest = Integer.parseInt(bedroomField.getText());
                                                     isInt4 = true;
                                                 } catch (NumberFormatException x) {
                                                     JOptionPane.showMessageDialog(frame, "Make sure you enter numbers where they should be!");
                                                 }
                                             }
                                         });




        String processAry[] = {"Insert", "Delete", "Find"};
        JComboBox processCombo = new JComboBox(processAry);
        panel.add(processCombo);
        processCombo.setBounds(165, 160, 185, 30);
        processCombo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent process) {
                if (process.getStateChange() == ItemEvent.SELECTED) {
                }
            }
        });

        /* *** STATUS BUTTON ***  */
        JButton statusButton = new JButton("Change Status");
        panel.add(statusButton);
        statusButton.setBounds(10, 192, 150, 30);

        String statusAry[] = {"FOR_SALE", "UNDER_CONTRACT", "SOLD"};
        JComboBox statusCombo = new JComboBox(statusAry);
        panel.add(statusCombo);
        statusCombo.setBounds(165, 190, 185, 30);
        statusCombo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent status) {
                if (status.getStateChange() == ItemEvent.SELECTED) {
                }
            }
        });

        frame.setVisible(true);
    }





}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author TRONG NGHIA
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class jpanel {
    private JPanel cardPanel;
    private CardLayout cardLayout;

    public jpanel() {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "panel1");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "panel2");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "panel3");
            }
        });

        cardPanel.add(createPanel1(), "panel1");
        cardPanel.add(createPanel2(), "panel2");
        cardPanel.add(createPanel3(), "panel3");

        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.CENTER);
        frame.add(button3, BorderLayout.SOUTH);
        frame.add(cardPanel, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    private JPanel createPanel1() {
        JPanel panel = new JPanel();
        // Thiết kế và thiết lập các thành phần của JPanel 1
        return panel;
    }

    private JPanel createPanel2() {
        JPanel panel = new JPanel();
        // Thiết kế và thiết lập các thành phần của JPanel 2
        return panel;
    }

    private JPanel createPanel3() {
        JPanel panel = new JPanel();
        // Thiết kế và thiết lập các thành phần của JPanel 3
        return panel;
    }

    public static void main(String[] args) {
        new jpanel();
    }
}


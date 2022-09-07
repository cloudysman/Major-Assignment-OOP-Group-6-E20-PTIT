/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFrameDemo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tin
 */
public class button extends JFrame implements ActionListener {


    JButton newgameButton, exitButton, continueButton;

    public button() {
        creatAndShow();
    }

    public void creatAndShow() {
        newgameButton = new JButton("New Game"); 
        continueButton = new JButton("Continue");
        exitButton = new JButton("Exit");

        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(newgameButton);
        newgameButton.setActionCommand("Welcome to Sky Game");
        newgameButton.addActionListener(this);

        this.add(continueButton);
        continueButton.setActionCommand("Continue");
        continueButton.addActionListener(this);

        this.add(exitButton);
        exitButton.setActionCommand("Exit");
        exitButton.addActionListener(this);

        this.setLayout(new FlowLayout());
//        this.pack();
        setVisible(true);
        this.setLayout(new GridLayout(3, 3));

    }

    public static void main(String[] args) {
        new button();
    }

    public void actionPerformed(ActionEvent e) {
        if ("Welcome to Sky Game".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(rootPane, " Start");
        }
        if ("exit".equals(e.getActionCommand())) {
            System.exit(0);
        }
    }

}

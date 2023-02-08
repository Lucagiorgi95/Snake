package org.example;

import javax.swing.*;

public class GameFrame extends JFrame {

    private final int largezza = 700;
    private final int altezza = 700;

    public GameFrame(){
        //Inserimento di GamePanel

        this.add(new GamePanel());
        this.setTitle("Snake The Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        //Pack() prende il frame e lo adatta fondendo tutti i componenti aggiunti
        this.pack();

        //setVisible() rende visibile il frame
        this.setVisible(true);

        //setLocationRelativeTo() posiziona il frame al centro dello schermo
        this.setLocationRelativeTo(null);


    }

}

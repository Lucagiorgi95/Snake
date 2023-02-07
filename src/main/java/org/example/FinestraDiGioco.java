package org.example;

import javax.swing.*;
import java.awt.*;

public class FinestraDiGioco {

    private final int largezza = 700;
    private final int altezza = 700;
    private final String titolo = "Snake The Game";

    public FinestraDiGioco(){}

    public void createWindows(){
        JFrame windows = new JFrame();
        windows.setTitle(titolo); //Nome del gioco
        //Settare la dimenzione della finestra
        windows.setPreferredSize(new Dimension(largezza, altezza));
        windows.setMaximumSize(new Dimension(largezza, altezza));
        windows.setResizable(false);

        //Settare colore sfondo
        windows.getContentPane().setBackground(Color.BLACK);

        //Chiusura della finestra con la X
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Fondere gli elementi
        windows.pack();

        //Rendere visibile la finestra
        windows.setVisible(true);

    }



}

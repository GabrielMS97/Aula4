package br.ufjf.dcc171;

import javax.swing.JFrame;

public class Aula04Exm01 {

    public static void main(String[] args) {
        JanelaBotoes janela = new JanelaBotoes();
        janela.setSize(1000, 1000);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}

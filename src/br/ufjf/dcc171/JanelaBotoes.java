package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class JanelaBotoes extends JFrame {

    private final JButton btn1;
    private final JButton btn2;
    private int b1 = 0;
    private int b2 = 0;

    public JanelaBotoes() throws HeadlessException {
        super("Botões");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        btn1 = new JButton("Clique aqui!");
        btn2 = new JButton("Clique aqui também!");
        add(btn1);
        btn1.setIcon(new ImageIcon("resources/png_bola.png"));
        btn1.setRolloverIcon(new ImageIcon("resources/ufjf.gif"));
        add(btn2);

        BotaoClicado bc = new BotaoClicado();

        btn1.addActionListener(bc);
        btn2.addActionListener(bc);
    }

    private class BotaoClicado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn1) {
                b1++;
                JOptionPane.showMessageDialog(null, "Gol da Alemanha\nAlemanha " + b1 + " X Brasil " + b2, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            } else {
                b2++;
                JOptionPane.showMessageDialog(null, "Olha a bola tocada!! Virou Passeio!!\nAlemanha " + b1 + " X Brasil " + b2, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
}

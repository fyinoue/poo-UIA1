/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 1714290026
 */
public class TestaJPanel {
    public static void main(String[] args) {
        JPanel painel = new JPanel();
        painel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        
        JPanel outro = new JPanel();
        outro.setBorder(BorderFactory.createLineBorder(Color.RED));
        
        painel.add(outro);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(500, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}

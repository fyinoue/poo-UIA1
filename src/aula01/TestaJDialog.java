/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author 1714290026
 */
public class TestaJDialog {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        JDialog dialogo = new JDialog(janela);
        //JDialog dialogo = new JDialog(janela, [modal] true);
        dialogo.setSize(300,200);
        dialogo.setResizable(false);
        dialogo.setLocationRelativeTo(null);
        dialogo.setModal(true); 
        dialogo.setVisible(true);
    }
}

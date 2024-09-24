/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author vanessalagomachado
 */
public class TesteJanela {

    public static void main(String[] args) {
        JFrame janelaPrincipal = new JFrame();
    
        JLabel lblTitulo = new JLabel("Olá Mundo");
        janelaPrincipal.add(lblTitulo);
        
        JLabel lblNome = new JLabel("Nome");
        janelaPrincipal.add(lblNome);
        
        JTextField txtNome = new JTextField(20);
        janelaPrincipal.add(txtNome);
        
        JButton btnEnviar = new JButton("Enviar");
        janelaPrincipal.add(btnEnviar);
        
        
        janelaPrincipal.setLayout(new FlowLayout());
        
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bem-vindo(a) "+txtNome.getText());
            }
        });
        
        

        
        
        
        
        janelaPrincipal.setSize(300, 400);
        janelaPrincipal.setVisible(true);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
}

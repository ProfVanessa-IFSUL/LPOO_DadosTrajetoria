/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Aspecto;
import modelo.Ponto;
import modelo.PontoAspecto;
import modelo.Tipo;
import modelo.Trajetoria;

/**
 *
 * @author vanessalagomachado
 */
public class TesteTrajetoria {

    public static void main(String[] args) {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM-yy HH:mm");
        try {
            Aspecto a1 = new Aspecto();
            a1.setDescricao("Temperatura do Ar");
            a1.setTipoAspecto(Tipo.NUMERICO);
            
            Aspecto a2 = new Aspecto();
            a1.setDescricao("Avaliação do local");
            a1.setTipoAspecto(Tipo.CATEGORICO);
            
            
            
            Ponto p1 = new Ponto(60.5, 50);
            p1.setDataHora(formatoData.parse("03-09-24 08:30"));
            p1.addAspectoValor(new PontoAspecto(a1,40.0));

            Ponto p2 = new Ponto(65, 52);
            p2.setDataHora(formatoData.parse("03-09-24 09:50"));

            Trajetoria traj1 = new Trajetoria(1);
            traj1.addPonto(p1);
            traj1.addPonto(p2);

            System.out.println("Ponto 1: " + p1.getTrajetoria());

        } catch (ParseException ex) {
            System.out.println("Data inválida");
        }

    }
}

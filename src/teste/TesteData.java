/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vanessalagomachado
 */
public class TesteData {
    public static void main(String[] args) {
        try {
            Date data = new Date();
            SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM-yyyy HH:mm");
            
            data = formatoData.parse("02-09-2024 08:00");
            
            System.out.println("DAta: "+data);
            System.out.println("DAta formatada: "+formatoData.format(data));
        } catch (ParseException ex) {
            System.out.println("Formato de data inválido");
        }
    }
}

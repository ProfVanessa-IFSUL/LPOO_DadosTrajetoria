/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vanessalagomachado
 */
public class MedidaEuclideana implements Medida{

    @Override
    public double calcularDistancia(Ponto a, Ponto b) {
        double dif1 = b.getLatitude() - a.getLatitude();
        double dif2 = b.getLongitude() - a.getLongitude();
        
        return Math.sqrt(Math.pow(dif1, 2) + Math.pow(dif2, 2));
    }
    
}

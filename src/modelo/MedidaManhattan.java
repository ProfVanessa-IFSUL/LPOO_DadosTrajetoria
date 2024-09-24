/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vanessalagomachado
 */
public class MedidaManhattan implements Medida{

    @Override
    public double calcularDistancia(Ponto a, Ponto b) {
        return Math.abs(b.getLatitude() - a.getLatitude()) + Math.abs(b.getLongitude()- a.getLongitude());
    }
    
}

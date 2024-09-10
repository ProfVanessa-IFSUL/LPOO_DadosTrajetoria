/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanessalagomachado
 */
public class PontoRepresentativo extends Ponto{
    List<Ponto> listaPontos;

    public PontoRepresentativo() {
        listaPontos = new ArrayList<>();
    }
    
    public void addPontoOrigem(Ponto p){
        listaPontos.add(p);
    }
    
    
}

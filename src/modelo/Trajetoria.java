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
public class Trajetoria {
    private int ID;
    private List<Ponto> listaPontos;

    public Trajetoria(int ID){
        this.ID = ID;
        listaPontos = new ArrayList<>();
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    

    public List<Ponto> getListaPontos() {
        return listaPontos;
    }
    
    public void addPonto(Ponto p){
        listaPontos.add(p);
        p.setTrajetoria(this);
    }

    @Override
    public String toString() {
        return "Traj. "+ID+" {"+listaPontos+"}";
    }
    
    
    
    
}

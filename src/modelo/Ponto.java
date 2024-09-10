/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vanessalagomachado
 */
public class Ponto {
    private double latitude;
    private double longitude;
    private Date dataHora;
    private Trajetoria trajetoria;
    
    List<PontoAspecto> listaAspectos;
    

    public Ponto() {
        listaAspectos = new ArrayList<>();
    }

    public Ponto(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        listaAspectos = new ArrayList<>();
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Trajetoria getTrajetoria() {
        return trajetoria;
    }

    public void setTrajetoria(Trajetoria trajetoria) {
        this.trajetoria = trajetoria;
    }

    @Override
    public String toString() {
        return "("+latitude+", "+longitude+")";
    }
    
    
    public void addAspectoValor(PontoAspecto asp){
        listaAspectos.add(asp);
    }
    
    
    
    
}

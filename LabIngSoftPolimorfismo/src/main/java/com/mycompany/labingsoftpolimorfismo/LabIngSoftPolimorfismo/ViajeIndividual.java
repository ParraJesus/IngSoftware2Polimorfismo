/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labingsoftpolimorfismo.LabIngSoftPolimorfismo;

import java.util.Date;

/**
 *
 * @author Jesus Parra
 */

public class ViajeIndividual extends Viaje
{
    // <editor-fold defaultstate="collapsed" desc="Costructores">  
    public ViajeIndividual(){}
    
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada)
    {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }
    // </editor-fold>

    @Override
    public String descripcion()
    {
        return "Disfruta tu viaje individual";
    }
    
}

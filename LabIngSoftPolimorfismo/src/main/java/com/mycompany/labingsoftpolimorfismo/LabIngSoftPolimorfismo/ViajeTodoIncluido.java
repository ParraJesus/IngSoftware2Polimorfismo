package com.mycompany.labingsoftpolimorfismo.LabIngSoftPolimorfismo;

import java.util.Date;

/**
 *
 * @author Jesus Parra
 */

public class ViajeTodoIncluido extends Viaje
{
    // <editor-fold defaultstate="collapsed" desc="Costructores">  
    public ViajeTodoIncluido(){}
    
    public ViajeTodoIncluido(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada)
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
        return "Disfruta tu viaje todo incluido";
    }
    
}
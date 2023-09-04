package Modelo;

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

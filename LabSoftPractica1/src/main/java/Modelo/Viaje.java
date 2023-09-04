package Modelo;

import java.util.Date;

/**
 * 
 * @author Jesus Parra
 */
public abstract class Viaje 
{

    protected String origen;
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechaLlegada;
    
    // <editor-fold defaultstate="collapsed" desc="Costructores">  
    public Viaje(){}
    
    public Viaje(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada)
    {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }
    // </editor-fold>
    
    public abstract String descripcion();
    
    public String cualquierMetodo()
    {
        return "Cualquier método implementado en la clase base";
    }
    
    public String cualquierMetodo2()
    {
        return "Cualquier método2 implementado en la clase base";
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters y Setters">
    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * @return the fechaSalida
     */
    public Date getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the fechaLlegada
     */
    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    /**
     * @param fechaLlegada the fechaLlegada to set
     */
    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    // </editor-fold>
}

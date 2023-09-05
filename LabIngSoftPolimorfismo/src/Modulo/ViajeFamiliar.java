package Modulo;

import java.util.Date;

/**
 *
 * @author Jesus Parra
 */

public class ViajeFamiliar extends Viaje {

    private int familia;
    
    // <editor-fold defaultstate="collapsed" desc="Costructores">
    
    public ViajeFamiliar(){}
            
    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia)
    {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.familia = familia;
    }
    // </editor-fold>
    
    @Override
    public String descripcion() 
    {
        return "Viaje para disfrutar con toda tu familia";
    }
    
    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }
    
    /*
    // <editor-fold defaultstate="collapsed" desc="">
    // </editor-fold>
    */
    
    // <editor-fold defaultstate="collapsed" desc="Getters y Setters">
    /**
     * @return the familia
     */
    public int getFamilia() {
        return familia;
    }

    /**
     * @param familia the familia to set
     */
    public void setFamilia(int familia) {
        this.familia = familia;
    }
    // </editor-fold>
}


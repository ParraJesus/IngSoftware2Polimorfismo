package Modulo;

import java.util.Date;

/**
 *
 * @author Jesus Parra
 */

public class ViajeIncentivo extends Viaje 
{
    private String empresa;

    // <editor-fold defaultstate="collapsed" desc="Costructores">  
    public ViajeIncentivo(){}
    
    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa)
    {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.empresa = empresa;
    }
    // </editor-fold>
    
    @Override
    public String descripcion() 
    {
        return "Viaje incentivo que te envia la empresa " + getEmpresa();
    }
    
    @Override
    public String cualquierMetodo2() 
    {
        return "Método implementado en la clase hija viaje de incentivo";
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters y Setters">
        /**
         * @return the empresa
         */
        public String getEmpresa() {
            return empresa;
        }

        /**
         * @param empresa the empresa to set
         */
        public void setEmpresa(String empresa) {
            this.empresa = empresa;
        }
    // </editor-fold>

}

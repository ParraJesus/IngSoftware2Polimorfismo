package Modulo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jesus Parra
 */

public class ViajeFamiliarTest {
    
    public ViajeFamiliarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //----------------------------------------------------------------------------
    //Pruebas unitarias de la clase Viaje
    //----------------------------------------------------------------------------

    /*
        Get y Set de destino
    */
    @Test
    public void testGetAndSetDestino(){
        System.out.println("getOrigen");
        String destino = "Bogota";
        Viaje instance = new ViajeFamiliar();
        instance.setDestino(destino);
        String result = instance.getDestino();
        assertEquals(destino, result);
    }
    /*
        Get y Set de origen
    */ 
    @Test
    public void testGetAndSetOrigen(){
        System.out.println("getOrigen");
        String origen = "Popayan";
        Viaje instance = new ViajeFamiliar();
        instance.setOrigen(origen);
        String result = instance.getOrigen();
        assertEquals(origen, result);
    }

    /*
        Get y Set de costo
    */
    @Test
    public void testGetAndSetCosto() {
        System.out.println("GetAndSetCosto");
        Viaje instance = new ViajeFamiliar();
        int costo = 1000000;
        instance.setCosto(costo);
        int obtenidoCosto = instance.getCosto();
        assertEquals(costo, obtenidoCosto);
    }
    
    /*
        Get y Set de fecha salida
    */   
    @Test
    public void testGetAndSetFechaSalida() throws ParseException {
        System.out.println("GetAndSetFechaSalida");
        Viaje instance = new ViajeFamiliar();
        Date nuevaFechaSalida = new SimpleDateFormat("dd/MM/yyyy").parse("5/09/2023");
        instance.setFechaSalida(nuevaFechaSalida);
        Date viejaFechaSalida = instance.getFechaSalida();
        assertEquals(nuevaFechaSalida, viejaFechaSalida);
    }
    
    /*
        Get y Set de fecha llegada
    */
    @Test
    public void testGetAndSetFechaLlegada() throws ParseException {
        System.out.println("GetAndSetFechaLlegada");
        Viaje instance = new ViajeFamiliar();
        Date nuevaFechaLlegada = new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2023");
        instance.setFechaLlegada(nuevaFechaLlegada);
        Date viejaFechaLlegada = instance.getFechaLlegada();
        assertEquals(nuevaFechaLlegada, viejaFechaLlegada);
    }
    
    /*
        Cualquier Método
    */
    @Test
    public void testCualquierMetodo() {
        System.out.println("cualquierMetodo");
        Viaje instance = new ViajeFamiliar();
        String expResult = "Cualquier método implementado en la clase base";
        String result = instance.cualquierMetodo();
        assertEquals(expResult, result);
    }
    
    //----------------------------------------------------------------------------
    //Pruebas unitarias de la clase ViajeFamiliar
    //----------------------------------------------------------------------------
    
    /*
        Descripción
    */
    @Test
    public void testDescripcion() throws ParseException 
    {
        System.out.println("descripcion");
        ViajeFamiliar instance = new ViajeFamiliar("Popayán", "Valledupar", 800000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("05/09/2023"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2023"),3);
        
        String expResult = "Viaje para disfrutar con toda tu familia";
        String result = instance.descripcion();
        assertEquals(expResult, result);
    }

    /*
        Cualquier Método 2
    */
    @Test
    public void testCualquierMetodo2() throws ParseException {
        System.out.println("cualquierMetodo2");
        ViajeFamiliar instance = new ViajeFamiliar("Popayán", "Valledupar", 800000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("05/09/2023"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2023"),3);
        
        String expResult = "Método implementado en la clase hija viaje familiar";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
    }

    /*
        Get Familia
    */
    
    @Test
    public void testGetFamilia() throws ParseException {
        System.out.println("getFamilia");
        ViajeFamiliar instance = new ViajeFamiliar("Popayán", "Valledupar", 800000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("05/09/2023"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2023"),3);
        int expResult = 3;
        int result = instance.getFamilia();
        assertEquals(expResult, result);
   }

    /*
        Set Familia
    */
    @Test
    public void testSetFamilia() throws ParseException {
        System.out.println("setFamilia");
        int familia = 4;
        ViajeFamiliar instance = new ViajeFamiliar("Pasto", "Cartagena", 1250000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2023"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2023"),3);
        
        instance.setFamilia(familia);
        
        int nuevaFamilia = instance.getFamilia(); 

        assertEquals(familia, nuevaFamilia); 
    }
    
}

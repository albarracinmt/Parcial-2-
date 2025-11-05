package Prueba;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParcialTest {

    @Test
    
     void testRaicesNormales() {
        Parcial p = new Parcial();
        
        double[] res = p.calcularRaices(1, -3, 2); 
        
      
        assertEquals(2, res.length );
        assertEquals(2.0, res[0], 0.0001);
        assertEquals(1.0, res[1],  0.0001);
    }


    @Test
     void testRaizRepetida() {
        Parcial p = new Parcial();
        double[] res = p.calcularRaices(1, 2, 1); 


        assertEquals(-1.0, res[0], 0.0001);
        assertEquals(-1.0, res[1], 0.0001);
    }

    @Test
     void testAigualCeroLanzaError() {
        Parcial p = new Parcial();
        assertThrows(IllegalArgumentException.class, () -> {
        	
        	
        	
        	
        	
            p.calcularRaices(0, 4, 2);
        });
    }

    @Test
    void testSinRaicesReales() {
        Parcial p = new Parcial();
        assertThrows(IllegalArgumentException.class, () -> {
            p.calcularRaices(1, 2, 5);
        });
    }

    @Test
     void testOtroCasoValido() {
    	
        Parcial p = new Parcial();
        double[] res = p.calcularRaices(2, 5, -3); 

        assertEquals(2, res.length);
        assertEquals(0.5, res[0], 0.1);
        assertEquals(-3.0, res[1], 0.1);
    }

}

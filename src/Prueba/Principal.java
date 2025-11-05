package Prueba;

import java.util.Arrays;


public class Principal {
	
	 public static void main(String [] args) {
	        Parcial p = new Parcial(); // Creo uns objeto en parcial

	        try {
	            double[] raices = p.calcularRaices(1, -3, 2);
	            
	            System.out.println("Las raices son: " + Arrays.toString(raices));
	            
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}

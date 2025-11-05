package Prueba;

public class Parcial {

    public double[] calcularRaices(double a, double b, double c) {
    	
        if (a == 0) {
            throw new IllegalArgumentException("El valor de a no puede ser 0");
        }

    
        double discriminan = b * b - 4 * a * c;

        if (discriminan < 0) {
            throw new IllegalArgumentException("No existen rces reales");
        }

        double r1 = (-b + Math.sqrt(discriminan)) / (2 * a);
        double r2 = (-b - Math.sqrt(discriminan)) / (2 * a);

        return new double[]{ r1, r2 };
    }
}

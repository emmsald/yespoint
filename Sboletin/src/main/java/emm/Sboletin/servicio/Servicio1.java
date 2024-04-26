package emm.Sboletin.servicio;

import org.springframework.stereotype.Service;


@Service
public class Servicio1 {
    public String solveQuadraticEquation(double a, double b, double c) {

        double x1, x2, d;
        // Calculamos el determinante
        d = ((b * b) - 4 * a * c);

        if (d < 0)
            return "No existen soluciones reales";
        else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            return "Solución 1: " + x1 + ", Solución 2: " + x2;
        }
    }
}
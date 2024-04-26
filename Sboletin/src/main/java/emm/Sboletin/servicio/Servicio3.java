package emm.Sboletin.servicio;

import org.springframework.stereotype.Service;

@Service

public class Servicio3 {
    public String calcularcircuferencia(double radio) {
        double circunferencia = 2 * Math.PI * radio;
        return "La longitud de una circunferencia de radio " + radio + " es: " + circunferencia;

    }
}
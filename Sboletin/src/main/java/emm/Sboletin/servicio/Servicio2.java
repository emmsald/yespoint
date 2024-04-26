package emm.Sboletin.servicio;

import org.springframework.stereotype.Service;


@Service
public class Servicio2 {
    public String calcularArea( double radio) {
        double area = Math.PI * (radio * radio);
        return "El área de una circunferencia de radio " + radio + " es: " + area;
    }
}
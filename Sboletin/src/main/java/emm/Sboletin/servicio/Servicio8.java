package emm.Sboletin.servicio;

import org.springframework.stereotype.Service;

@Service
public class Servicio8 {
    public String compararNumeros(int n1, int n2) {
        if (n1 == n2) {
            return "Son iguales";
        } else if (n1 > n2) {
            return "n1 es mayor que n2";
        } else {
            return "n2 es mayor que n1";
        }
    }
}

package emm.Sboletin.servicio;

import org.springframework.stereotype.Service;


@Service
public class Servicio4 {
    public String comparaciondenumeros(int n1, int n2) {
        if (n1 == n2)
            return ("los numeros son iguales");
        else
            return ("los numeros no son iguales");
    }

}

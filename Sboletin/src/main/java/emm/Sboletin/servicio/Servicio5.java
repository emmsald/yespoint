package emm.Sboletin.servicio;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class Servicio5 {
    public String comparaciondenumeros(int num) {

        if (num < 0)
            return ("Negativo");
        else
            return ("Positivo");

    }
}
package emm.Sboletin.servicio;

import org.springframework.stereotype.Service;


@Service
public class Servicio7 {
    public String Comparanum( int n1,  int n2) {
        if(n1>n2)
            return " n1 es mayor  " ;
        else
            return " n2 es mayor  " ;
    }
}


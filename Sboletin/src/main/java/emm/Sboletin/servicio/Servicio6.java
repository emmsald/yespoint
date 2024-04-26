package emm.Sboletin.servicio;

import org.springframework.stereotype.Service;


@Service
public class Servicio6 {
    public String Comparamultiplos( int n1,  int n2) {
        if(n1 % n2 == 0)
            return "Son múltiplos";
        else
            return "No son múltiplos";
    }
}

package emm.Sboletin.servicio;

import org.springframework.stereotype.Service;

@Service
public class Servicio11 {
    public String cifras(int num) {
        if (num < 10)
            return ("tiene 1 cifra");
        else {
            if (num < 100)
                return ("tiene 2 cifras");
            else {
                if (num < 1000)
                    return ("tiene 3 cifras");
                else {
                    if (num < 10000)
                        return ("tiene 4 cifras");
                    else {
                        if (num < 100000)
                            return ("tiene 5 cifras");
                        else {
                            if (num < 1000000)
                                return ("tiene 6 cifras");
                        }
                    }
                }
            }
        }
        return "";
    }
}

package emm.Sboletin.servicio;

import org.springframework.stereotype.Service;

@Service
public class Servicio10 {
    public String tresnumeros(int a, int b, int c) {
        if (a > b && b > c)
            return (a + "  es mayor que  " + b + " y este es mayor que  " + c);
        else {
            if (a > c && c > b)
                return (a + " es mayor que " + c + " y este es mayor que " + b);
            else {
                if (b > a && a > c)
                    return (b + " es mayor que " + a + " y este  es mayor que  " + c);
                else {
                    if (b > c && c > a)
                        return (b + " es mayor que " + c + " y este es mayor que " + a);
                    else {
                        if (c > a && a > b)
                            return (c + " es mayor que  " + a + " y este  es mayor que  " + b);
                        else {
                            if (c > b && b > a)
                                return (c + " es mayor que  " + b + " y este es mayor que " + a);
                        }
                    }
                }
            }
        }
        return "";
    }
}
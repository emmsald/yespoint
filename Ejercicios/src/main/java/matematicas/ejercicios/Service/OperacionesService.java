package matematicas.ejercicios.Service;

import org.springframework.stereotype.Service;
@Service
public class OperacionesService {

    public String EcuacionCircunferencia(double a, double b, double c) {

        double x1, x2, d;
        d = ((b * b) - 4 * a * c);

        if (d < 0)
            return "No existen soluciones reales";
        else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            return "Solución 1: " + x1 + ", Solución 2: " + x2;
        }
    }

    public String calcularArea(double radio) {
        double area = Math.PI * (radio * radio);
        return "El área de una circunferencia de radio " + radio + " es: " + area;
    }

    public String calcularcircuferencia(double radio) {
        double circunferencia = 2 * Math.PI * radio;
        return "La longitud de una circunferencia de radio " + radio + " es: " + circunferencia;

    }

    public String comparaciondenumeros(int n1, int n2) {
        if (n1 == n2)
            return ("los numeros son iguales");
        else
            return ("los numeros no son iguales");
    }

    public String comparaciondenumeros(int num) {

        if (num < 0)
            return ("Negativo");
        else
            return ("Positivo");
    }

    public String Comparamultiplos(int n1, int n2) {
        if (n1 % n2 == 0)
            return "Son múltiplos";
        else
            return "No son múltiplos";
    }

    public String Comparanum(int n1, int n2) {
        if (n1 > n2)
            return " n1 es mayor  ";
        else
            return " n2 es mayor  ";
    }

    public String compararNumeros(int n1, int n2) {
        if (n1 == n2) {
            return "Son iguales";
        } else if (n1 > n2) {
            return "n1 es mayor que n2";
        } else {
            return "n2 es mayor que n1";
        }
    }

    public String Ordendenumeros(int n1, int n2) {
        if (n1 > n2)
            return (n1 + " y " + n2);
        else
            return (n2 + " y " + n1);
    }

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

    public int cifrasalreves(int num) {

        int dm, um, c, d, u;
        u = num % 10;
        num = num / 10;
        d = num % 10;
        num = num / 10;
        c = num % 10;
        num = num / 10;
        um = num % 10;
        num = num / 10;
        dm = num;
        num = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;
        return (num);
    }

    public String capicua(int num) {
        int dm, um, c, d, u;
        u = num % 10;
        num = num / 10;
        d = num % 10;
        num = num / 10;
        c = num % 10;
        num = num / 10;
        um = num % 10;
        num = num / 10;
        dm = num;
        if (dm == u && um == d)
            return "el número es capicúa";
        else
            return "el número NO es capicúa";
    }

    public String nocapicua(int num) {
        int dm, um, c, d, u;
        boolean capicua = false;
        u = num % 10;
        num = num / 10;
        d = num % 10;
        num = num / 10;
        c = num % 10;
        num = num / 10;
        um = num % 10;
        num = num / 10;
        dm = num;
        if (dm == u && um == d)
            capicua = true;
        if (dm == 0 && um == u && c == d)
            capicua = true;
        if (dm == 0 && um == 0 && c == u)
            capicua = true;
        if (dm == 0 && um == 0 && c == 0 && d == u)
            capicua = true;
        if (capicua)
            return "el número es capicúa";
        else
            return "el número NO es capicúa";
    }

    public String muestracalificacion(int nota) {
        if (nota >= 0 && nota <= 5)
            return "INSUFICIENTE";
        else if (nota == 5)
            return "SUFICIENTE";
        else if (nota == 6)
            return "BIEN";
        else if (nota == 7 || nota == 8)
            return "NOTABLE";
        else if (nota == 9 || nota == 10)
            return "SOBRESALIENTE";
        return "";
    }
}






package com.example.boletin1;

import java.util.Scanner;

public class Boletin2 {
    public static void main(String[] args) {
        double a,r; // área y radio

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio de un circulo: ");
        r = scanner.nextDouble();
        a=Math.PI*(r*r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);
    }
}


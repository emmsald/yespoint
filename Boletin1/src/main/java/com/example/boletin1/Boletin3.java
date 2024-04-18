package com.example.boletin1;

import java.util.Scanner;

public class Boletin3 {
    public static void main(String[] args) {
        double l,r; // longitud y radio

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio de una circunferencia: ");
        r = scanner.nextDouble();
        l=2*Math.PI*r;
        System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
    }
}


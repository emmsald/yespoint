package com.example.boletin1;

import java.util.Scanner;

public class Boletin5 {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = scanner.nextInt();
        if( num < 0)
            System.out.println("Negativo");
        else
// suponemos que el 0 es positivo.
            System.out.println("Positivo");
    }
}


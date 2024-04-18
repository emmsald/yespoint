package com.example.boletin1;

import java.util.Scanner;

public class Boletin9 {
    public static void main(String[] args) {
        int n1,n2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        n1 = scanner.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = scanner.nextInt();
        if(n1>n2)
            System.out.println(n1 + " y " + n2);
        else
            System.out.println(n2 + " y " + n1);
    }
}


package com.example.boletin1;

import java.util.Scanner;

public class Boletin11 {
    public static void main(String[] args) {
        int num;

        Scanner scanner= new Scanner(System.in);

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num = scanner.nextInt();
        if(num<10)
            System.out.println("tiene 1 cifra");
        else{
        if(num<100)
            System.out.println("tiene 2 cifras");
        else{
        if(num<1000)
            System.out.println("tiene 3 cifras");
        else{
        if(num<10000)
            System.out.println("tiene 4 cifras");
        else{
        if(num<100000)
            System.out.println("tiene 5 cifras");
        }
        }
        }
        }
    }
}


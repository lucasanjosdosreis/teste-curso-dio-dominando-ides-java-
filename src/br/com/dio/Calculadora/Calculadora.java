package br.com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       int a, b;

        System.out.println("Digite o primeiro valor:   ");
        a = scan.nextInt();
        System.out.println("Digite o Segundo valor:  ");
        b = scan.nextInt();

        int soma = soma(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("soma: " + soma);
        System.out.println("subtrair: " + subtrair);
        System.out.println("multiplicar: " + multiplicar);
        System.out.println("dividir: " + dividir);

    }
    public static  int soma (int a, int b){
        return a + b;
    }
    public static  int subtrair (int a, int b){
        return a - b;
    }
    public static  int multiplicar (int a, int b){
        return a * b;
    }
    public static  int dividir (int a, int b){
        return a / b;

    }

}

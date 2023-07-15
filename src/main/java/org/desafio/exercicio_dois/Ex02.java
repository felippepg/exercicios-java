package org.desafio.exercicio_dois;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int notasDeCem = 0;
        int notasDeCinquenta = 0;
        int notasdDeVinte = 0;
        int notasDeDez = 0;
        int notasDeCinco = 0;
        int notasDeDois = 0;

        int moedasDeUmReal = 0;
        int moedasDeCinquentaCent = 0;
        int moedasDeVinteCincoCent = 0;
        int moedasDeDezCent = 0;
        int moedasDeCincoCent = 0;
        int moedasDeUmCent = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor desejado: ");
        Double valor = scanner.nextDouble();

        while(valor < 0 || valor > 1000000.00) {
            System.out.println("Digite um valor entre de 0 e 1000000.00");
            valor = scanner.nextDouble();
        }

        while ((valor / 100) >= 1) {
            valor = valor - 100;
            notasDeCem++;
        }
        while ((valor / 50) >= 1) {
            valor = valor - 50;
            notasDeCinquenta++;
        }
        while ((valor / 20) >= 1) {
            valor = valor - 20;
            notasdDeVinte++;
        }

        while ((valor / 10) >= 1) {
            valor = valor - 10;
            notasDeDez++;
        }

        while ((valor / 5) >= 1) {
            valor = valor - 5;
            notasDeCinco++;
        }

        while ((valor / 2) >= 1) {
            valor = valor - 2;
            notasDeDois++;
        }

        while ((valor / 1) >= 1) {
            valor = valor - 1;
            moedasDeUmReal++;
        }
        while ((valor / 0.5) >= 1) {
            valor = valor - 0.5;
            moedasDeCinquentaCent++;
        }
        while ((valor / 0.25) >= 1) {
            valor = valor - 0.25;
            moedasDeVinteCincoCent++;
        }
        while ((valor / 0.10) >= 1) {
            valor = valor - 0.10;
            moedasDeDezCent++;
        }
        while ((valor / 0.05) >= 1) {
            valor = valor - 0.05;
            moedasDeCincoCent++;
        }

        System.out.println("VALOR " + valor);

        while ((valor / 0.01) >= 1) {
            valor = valor - 0.01;
            moedasDeUmCent++;
        }


        System.out.println("NOTAS: ");
        System.out.println("");
        System.out.println(notasDeCem + " nota(s) de R$ 100.00");
        System.out.println(notasDeCinquenta + " nota(s) de R$ 50.00");
        System.out.println(notasdDeVinte + " nota(s) de R$ 20.00 ");
        System.out.println(notasDeDez + " nota(s) de R$ 10.00");
        System.out.println(notasDeCinco + " nota(s) de R$ 5.00");
        System.out.println(notasDeDois + " nota(s) de R$ 2.00");
        System.out.println("----------------------------");
        System.out.println("MOEDAS: ");
        System.out.println("");
        System.out.println(moedasDeUmReal + " moeda(s) de R$ 1.00");
        System.out.println(moedasDeCinquentaCent + " moeda(s) de R$ 0.50");
        System.out.println(moedasDeVinteCincoCent+ " moeda(s) de R$ 0.25");
        System.out.println(moedasDeDezCent + " moeda(s) de R$ 0.10");
        System.out.println(moedasDeCincoCent + " moeda(s) de R$ 0.05");
        System.out.println(moedasDeUmCent + " moeda(s) de R$ 0.01 ");



    }
}

package org.desafio.exercicio_um;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        List<Long> pares = new ArrayList<>();
        List<Long> impares = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de entradas ");
        Long entradas = scanner.nextLong();

        while(entradas < 0 || entradas > 100000) {
            System.out.println("Digite um valor acima de 0 e menor que 100000");
            entradas = scanner.nextLong();
        }

        for(Long aux = 1l; aux <= entradas; aux++ ) {
            System.out.println("Digite um número");
            Long numero = scanner.nextLong();
            if(numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }
        pares.stream()
                .sorted()
                .forEach(numero -> System.out.println(numero));
        impares.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(numero -> System.out.println(numero));
    }
}

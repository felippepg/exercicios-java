package org.desafio.exercicio_tres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int index = 0;
        int combinacoes = 0;
        List<Integer> conjunto = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int entradas = scanner.nextInt();

        System.out.println("Digite o valor do alvo: ");
        int alvo = scanner.nextInt();

        while(index < entradas) {
            System.out.print("Digite um valor: ");
            int valor = scanner.nextInt();
            conjunto.add(valor);
            index ++;
        }

        for(int i = 0; i < conjunto.size(); i++) {
            for(int j = 0; j <= (conjunto.size() - 1 ); j++) {
                if((conjunto.get(i) - conjunto.get(j)) == alvo) {
                    combinacoes = combinacoes + 1;
                }
            }
        }

        System.out.println(combinacoes);
    }
}

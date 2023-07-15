package org.desafio.exercicio_quatro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        List<String> frases = new ArrayList<>();
        List<String> novasFrases = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de entradas ");
        int entradas = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < entradas; i ++) {
            System.out.println("Digite uma frase");
            var frase = scanner.nextLine();
            while (frase.length() < 2 || frase.length() > 100) {
                System.out.println("Digite uma frase entre 2 e 100 caracteres");
                frase = scanner.nextLine();
            }
            frases.add(frase);
        }

        for(int i = 0; i < frases.size(); i++) {
            var frase = frases.get(i);
            char[] chars = frase.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (int j = (chars.length - 1) / 2; j >= 0; j--) {
                sb.append(chars[j]);
            }

            for (int x = chars.length - 1; x >= (chars.length - 1) / 2; x--) {
                sb.append(chars[x]);
            }

            String fraseCompleta = sb.toString();
            novasFrases.add(fraseCompleta);
        }


        novasFrases.stream().forEach(item -> System.out.println(item));
    }
}

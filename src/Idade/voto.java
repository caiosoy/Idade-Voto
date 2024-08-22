package Idade;

import java.util.Scanner;

public class voto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a sua idade: ");
        int idade = sc.nextInt();
        if (idade < 16) {
            System.out.println("Você não pode votar!");
        } else if (idade >= 16 && idade < 18 || idade >= 65) {
            System.out.println("Seu voto é facultativo!");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Voto Obrigatório!");
        }
        sc.close();

    }
}

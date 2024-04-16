package primeiroprograma;

import java.util.Scanner;

public class PrimeiroPrograma {

    public static void main(String[] args) {

        String name = "";
        Scanner lerTeclado = new Scanner(System.in);

        System.out.println("Digite um nome: ");

        name = lerTeclado.next();
        System.out.println("o nome digitado eh: " + name);

    }

}

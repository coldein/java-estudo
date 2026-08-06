package cadastro;

import java.util.Scanner;

public class CadastroUsuario {
    public static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.println("Digite o nome do usuário:");
        String nome = scan.nextLine();

        System.out.println("\nDigite a idade do usuário:");
        int idade = scan.nextInt();

        System.out.println("\nAguarde.....");

        try {
            cadastrarUsuario(nome, idade);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
            e.fillInStackTrace();
        } finally {
            System.out.println("\nProcesso de cadastro finalizado.");
        }

    }

    public static void cadastrarUsuario(String nome, int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("\nUsuário precisa ser maior de idade para se cadastrar.");
        }
        System.out.println("\nusuário: " + nome + " foi cadastrado com sucesso");
    }
}

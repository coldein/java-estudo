package loja;

import java.util.Scanner;

public final class Loja {

    static Scanner inputEntry = new Scanner(System.in);

    private static Compra[] compras = new Compra[100];
    private static int indiceCompra = 0;

    public static void main(String[] args) {
        iniciarLoja();
    }

    private static void iniciarLoja() {

        System.out.println("=================================");
        System.out.println("   Seja bem-vindo a EBAC Store");
        System.out.println("=================================");

        boolean continuar = true;

        while (continuar) {

            iniciarCatalogo();

            System.out.println();
            System.out.println("1 - Comprar outro produto");
            System.out.println("2 - Finalizar compra");

            int opcao = lerInteiro("Escolha:");

            if (opcao == 2) {
                continuar = false;
            }
        }

        finalizarCompra();
    }

    private static void iniciarCatalogo() {

        System.out.println("\nProdutos Disponíveis\n");

        int index = 1;

        for (ProdutoOpcao produto : ProdutoOpcao.values()) {
            System.out.println("[" + index++ + "] " + produto.getDescricao());
        }

        controlarCompra();
    }

    private static void controlarCompra() {

        int escolha;
        int quantidade;

        escolha = lerProduto();

        quantidade = lerQuantidade();

        Produto produto = criarProduto(escolha);

        compras[indiceCompra++] = new Compra(produto, quantidade);

        System.out.println();
        System.out.println("Produto adicionado com sucesso!");
    }

    private static int lerProduto() {

        while (true) {

            System.out.println();
            System.out.print("Digite o número do produto: ");

            if (!inputEntry.hasNextInt()) {

                System.out.println("Escolha um número entre 1 e 5.");
                inputEntry.next();
                continue;
            }

            int escolha = inputEntry.nextInt();

            if (escolha >= 1 && escolha <= 5) {
                return escolha;
            }

            System.out.println("Escolha um número entre 1 e 5.");
        }
    }

    private static int lerQuantidade() {

        while (true) {

            System.out.print("Digite a quantidade: ");

            if (!inputEntry.hasNextInt()) {

                System.out.println("Quantidade inválida.");
                inputEntry.next();
                continue;
            }

            int quantidade = inputEntry.nextInt();

            if (quantidade > 0) {
                return quantidade;
            }

            System.out.println("Quantidade inválida.");
        }
    }

    private static Produto criarProduto(int opcao) {

        switch (opcao) {

            case 1:
                return new Televisao();

            case 2:
                return new Radio();

            case 3:
                return new VideoGame();

            case 4:
                return new Tablet();

            case 5:
                return new Celular();

            default:
                return null;
        }
    }

    private static int lerInteiro(String mensagem) {

        while (true) {

            System.out.print(mensagem + " ");

            if (!inputEntry.hasNextInt()) {

                System.out.println("Digite apenas números.");
                inputEntry.next();
                continue;
            }

            return inputEntry.nextInt();
        }
    }

    private static void finalizarCompra() {

        double total = 0;

        System.out.println();
        System.out.println("===============================");
        System.out.println("      RESUMO DA COMPRA");
        System.out.println("===============================");

        for (int i = 0; i < indiceCompra; i++) {

            Compra compra = compras[i];

            System.out.printf(
                    "%s | Quantidade: %d | Total: R$ %.2f%n",
                    compra.getProduto().getNome(),
                    compra.getQuantidade(),
                    compra.getTotal());

            total += compra.getTotal();
        }

        System.out.println("-------------------------------");
        System.out.printf("TOTAL DA COMPRA: R$ %.2f%n", total);
        System.out.println("===============================");
        System.out.println("Obrigado pela preferência!");
    }

}
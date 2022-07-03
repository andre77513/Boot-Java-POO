package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class ProdutoExe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n Informe os dados do produto");
        System.out.print("\n Nome: ");
        String nome = scan.nextLine();
        System.out.print("\n Quantidade: ");
        int quantidade = scan.nextInt();
        System.out.print("\n Preço: ");
        double preco = scan.nextDouble();

        Produto celular = new Produto(nome, preco, quantidade);

        System.out.printf("\n %s", celular.nome);
        System.out.printf("\n %d", celular.quantidade);
        System.out.printf("\n R$ %.2f", celular.valorUnitario);

        System.out.printf("\n Imposto: R$ %.2f", celular.valorImposto());
        System.out.printf("\n Valor total em estoque: R$ %.2f\n", celular.valorEstoque());

        scan.close();
    }
}

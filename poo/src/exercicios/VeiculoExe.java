package exercicios;

import java.util.Scanner;

public class VeiculoExe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double capa, consu, quil = 628, preco, tanque, despesa;
        int pass;
        String partida = "Maringá-PR", destino = "Blumenau-SC";

        // System.out.print("\n Informe a capacidade do tanque do veículo: ");
        // capa = scan.nextDouble();
        // System.out.print("\n Informe o número de passageiros: ");
        // pass = scan.nextInt();
        // System.out.print("\n Informe o consumo por litro: ");
        // consu = scan.nextDouble();
        // System.out.print("\n Informe a distância em quilômetros: ");
        // quil = scan.nextDouble();
        // System.out.print("\n Informe o preço por litro do combustível: ");
        // preco = scan.nextDouble();

        // Veículo 1 é uma Van movida a diesel
        // Preço médio do diesel: R$ 7,56 atualizado 24/06/2022
        System.out.println("\n Veículo 1");
        capa = 90;
        pass = 16;
        consu = 9;
        preco = 7.56;
        Veiculo van = new Veiculo(capa, pass, consu);
        System.out.println(van.toString());
        tanque = van.tanqueViagem(quil);
        despesa = van.dividirDespesas(preco, quil);
        System.out.printf(
                " Para esta viagem de %.1f quilômetros de %s a %s, vão ser necessários %.1f tanque(s) de combustível, e cada passageiro contribuirá com R$ %.2f\n",
                quil, partida, destino, tanque, despesa);

        System.out.println(
                "\n----------------------------------------------------------------------------------------------------");

        // Veículo 2 é um carro movido a gasolina
        // Preço médio da gasolina: R$ 7,39 atualizado 24/06/2022
        System.out.println("\n Veículo 2");
        capa = 56;
        pass = 5;
        consu = 9;
        preco = 7.39;
        Veiculo carro = new Veiculo(capa, pass, consu);
        System.out.println(carro.toString());
        tanque = carro.tanqueViagem(quil);
        despesa = carro.dividirDespesas(preco, quil);
        System.out.printf(
                " Para esta viagem de %.1f quilômetros de %s a %s, vão ser necessários %.1f tanque(s) de combustível, e cada passageiro contribuirá com R$ %.2f\n",
                quil, partida, destino, tanque, despesa);
        scan.close();

    }
}

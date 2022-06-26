package aplicacao;

import java.util.Scanner;

import entidades.Veiculo;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pass;
        double tanque, consumo, km, valor;

        System.out.print("\n Informe a quantidade de passageiros: ");
        pass = scan.nextInt();
        System.out.print("\n Informe a capacidade do tanque: ");
        tanque = scan.nextDouble();
        System.out.print("\n Informe o consumo por litro: ");
        consumo = scan.nextDouble();
        System.out.print("\n Informe a distância em quilômetros: ");
        km = scan.nextDouble();
        System.out.print("\n Informe o preço por litro de combustível: ");
        valor = scan.nextDouble();

        Veiculo gurgel = new Veiculo(pass, tanque, consumo);
        
        System.out.println(gurgel.toString());

        double tanques = gurgel.tanqueViagem(km);
        double rateio = gurgel.dividirDespesas(km, valor);
        System.out.printf("\n Para a viagem vamos precisar de " + "%.1f tanque(s), e cada passageiro contribuirá com "
                + "R$ %.2f\n ", tanques, rateio);

        scan.close();
    }
}

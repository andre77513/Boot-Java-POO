package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Departamento;
import entidades.Funcionario;
import entidades.enums.Nivel;

public class Sistema {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("\n Departamento: ");
        String depto = scan.nextLine();
        System.out.print("\n Funcionário: ");
        String func = scan.nextLine();
        System.out.print("\n Nível: ");
        String nivel = scan.nextLine();
        System.out.print("\n Salário base: ");
        double salario = scan.nextDouble();

        Funcionario funcionario = new Funcionario(func, Nivel.valueOf(nivel), salario, new Departamento(depto));

        System.out.print("\n Contratos associados: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("\n Contrato nº" + i + ": ");
            System.out.print("\n Data (DD/MM/YYYY): ");
            Date data = sdf.parse(scan.next());
            System.out.print("\n Valor da hora: ");
            double valor = scan.nextDouble();
            System.out.print("\n Quantidade de horas: ");
            int horas = scan.nextInt();

            Contrato contrato = new Contrato(data, valor, horas);
            funcionario.addContrato(contrato);

        }

        System.out.print("\n Informe o mês e o ano (mm/aaaa): ");
        String mesAno = scan.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));

        System.out.println("\n Nome " + funcionario.getNome());
        System.out.println(" Departamento " + funcionario.getDepartamento().getNome());
        System.out.println(" Salário de " + mesAno + " R$" + String.format("%.2f", funcionario.ganho(ano, mes)));

        scan.close();
    }
}

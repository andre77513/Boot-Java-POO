package triangulo;

import java.util.Scanner;

import geometria.Triangulo;

public class TrianguloExec {
    public static void main(String[] args) {
        Triangulo a = new Triangulo();
        Triangulo b = new Triangulo();

        // Triangulo A
        entrada(a);
        if (a.validar() == true) {

            System.out.println(a.toString());

        } else {
            System.out.println("\n Os lados informados não são de um triângulo\n\n");
        }

        // Triangulo B
        entrada(b);
        if (b.validar() == true) {

            System.out.println(b);

        } else {
            System.out.println("\n Os lados informados não são de um triângulo\n\n");
        }

    }

    public static void entrada(Triangulo lado) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Digite os valores dos lados: ");
        lado.x = scan.nextDouble();
        lado.y = scan.nextDouble();
        lado.z = scan.nextDouble();

        // scan.close();
    }
}

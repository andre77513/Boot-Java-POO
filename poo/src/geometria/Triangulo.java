package geometria;

public class Triangulo {
    public double x;
    public double y;
    public double z;

    public boolean validar() {
        if (Math.abs(x - y) < z && z < (x + y)) {
            return true;
        } else {
            return false;
        }
    }

    public String classificar() {
        String tipo;

        if (x == y && y == z) {
            tipo = "equilátero";
        } else if (x == y || x == z || y == z) {
            tipo = "isósceles";
        } else {
            tipo = "escaleno";
        }
        return tipo;
    }

    public double perimetro() {
        return (x + y + z) / 2.0;
    }

    public double area() {
        return Math.sqrt(perimetro() * (perimetro() - x) * (perimetro() - y) * (perimetro() - z));
    }

    public String toString() {
        return "\n Os lados " + x + ", " + y + "e " + z
                + " formam um triângulo " + classificar() + "."
                + "\n O perímetro do triângulo é " + String.format("%.2f", perimetro()) + "."
                + "\n A área desse triângulo é " + String.format("%.2f", area()) + ".\n\n";
    }
}

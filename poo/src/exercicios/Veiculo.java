package exercicios;

public class Veiculo {
    private double capacidade;
    private int passageiros;
    private double consumo;

    public Veiculo(double capacidade, int passageiros, double consumo) {
        this.capacidade = capacidade;
        this.passageiros = passageiros;
        this.consumo = consumo;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double tanqueViagem(double quilometros) {
        return quilometros / (consumo * capacidade);
    }

    public double dividirDespesas(double combustivel, double quilometros) {
        return (quilometros / capacidade * combustivel) / passageiros;
    }

    public String toString() {
        return "\n O veículo comporta " + passageiros
                + " pessoas, tem uma capacidade de " + capacidade
                + " litros no tanque de combustível, e faz " + consumo
                + " quilômetros por litro\n";
    }

}

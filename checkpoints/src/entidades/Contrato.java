package entidades;

import java.util.Date;

public class Contrato {
    private Date data;
    private double valorHora;
    private int horas;

    public Contrato() {

    }

    public Contrato(Date data, double valorHora, int horas) {
        this.data = data;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    // public Contrato(Date data2, double valor, double horas2) {
    // }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public double valorTotal() {
        return valorHora * horas;
    }
}

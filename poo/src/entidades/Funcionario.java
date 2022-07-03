package entidades;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Funcionario {
    private int id;
    private String nome;
    private Date dataAdmissao;
    private float salario;
    private Date desligamento = null;

    public Funcionario(int id, String nome, Date dataAdmissao, float salario) {
        this.id = id;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public Funcionario(int id, String nome, Date dataAdmissao, float salario, Date desligamento) {
        this.id = id;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.desligamento = desligamento;
    }

    public Funcionario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAdmissao() {
        DateFormat fmto = DateFormat.getDateInstance(DateFormat.SHORT);

        return fmto.format(dataAdmissao);
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDesligamento() {
        DateFormat fmto = DateFormat.getDateInstance(DateFormat.SHORT);

        return fmto.format(desligamento);
    }

    public void setDesligamento(Date desligamento) {
        this.desligamento = desligamento;
    }

    public int tempoServico(Date admissao) {
        Calendar data = new GregorianCalendar();
        data.setTime(admissao);
        Calendar hoje = Calendar.getInstance();

        int tempo = hoje.get(Calendar.YEAR) - data.get(Calendar.YEAR);

        data.add(Calendar.YEAR, tempo);

        if (hoje.before(data)) {
            tempo--;
        }

        return tempo;
    }

    @Override
    public String toString() {
        DateFormat fmto = DateFormat.getDateInstance(DateFormat.MEDIUM);
        if (desligamento == null) {
            return "\n" + nome + ", prontuário " + id + " trabalha desde " + fmto.format(dataAdmissao) + ", há "
                    + tempoServico(dataAdmissao) + " anos, com salário atual de R$ "
                    + String.format("%.2f", salario) + ".\n";
        } else {
            return "\n" + nome + ", prontuário " + id + " trabalhou de " + fmto.format(dataAdmissao) + ", a "
                    + fmto.format(desligamento) + " e seu ultimo salário foi de R$ "
                    + String.format("%.2f", salario) + ".\n";
        } 
    }

}

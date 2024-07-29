package je16_java_nio;

import java.time.LocalDate;

public class Cadastro {
    String nome;
    String sexo;
    LocalDate dataNascimento;
    Double valorSugerido;
    boolean cliente;

    public Cadastro(String nome, String sexo, LocalDate dataNascimento, Double valorSugerido, boolean cliente) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.valorSugerido = valorSugerido;
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Double getValorSugerido() {
        return valorSugerido;
    }

    public boolean isCliente() {
        return cliente;
    }
}

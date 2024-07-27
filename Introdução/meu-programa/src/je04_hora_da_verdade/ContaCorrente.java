package je04_hora_da_verdade;

import java.util.Date;

public class ContaCorrente {
    private int numeroConta;
    private int numeroAgencia;
    private String nomeCliente;
    private Date dataNasc;
    private double saldo = 0;
    private boolean estaInativa = false;
    private String justificativaParaDesativar;

    public int      getNumeroConta() throws Exception {
        return this.numeroConta;
    }
    public int      getNumeroAgencia() {
        return this.numeroAgencia;
    }
    public String   getNomeCliente() {
        return this.nomeCliente;
    }
    public Date     getDataNasc() {
        return this.dataNasc;
    }
    public double   getSaldo() {
        return this.saldo;
    }
    public boolean  getEstaInativa() {
        return this.estaInativa;
    }
    public String   getJustificativaParaDesativar() {
        return this.justificativaParaDesativar;
    }

    public void setNumeroConta(int numeroConta) throws Exception {
        if (this.estaInativa) {
            throw new Exception("A conta não está ativa.");
        }

        this.numeroConta = numeroConta;
    }
    public void setNumeroAgencia(int numeroAgencia) throws Exception {
        if (this.estaInativa) {
            throw new Exception("A conta não está ativa.");
        }

        this.numeroAgencia = numeroAgencia;
    }
    public void setNomeCliente(String nomeCliente) throws Exception {
        if (this.estaInativa) {
            throw new Exception("A conta não está ativa.");
        }

        this.nomeCliente = nomeCliente;
    }
    public void setDataNasc(Date dataNasc) throws Exception {
        if (this.estaInativa) {
            throw new Exception("A conta não está ativa.");
        }

        this.dataNasc = dataNasc;
    }

    public void     depositar(double deposito) throws Exception {
        if (this.estaInativa) {
            throw new Exception("A conta não está ativa.");
        }

        this.saldo += deposito;
    }
    public void     transferir(double valor, ContaCorrente contaDestino) throws Exception {
        if (this.estaInativa) {
            throw new Exception("A conta não está ativa.");
        }

        if (this.saldo < valor) {
            throw new Exception("Valor de depósito indisponível.");
        }

        this.saldo -= valor;
        contaDestino.depositar(valor);
    }
    public void     cancelarConta(String justificativa) throws Exception {
        if (this.estaInativa) {
            throw new Exception("A conta não está ativa.");
        }

        this.justificativaParaDesativar = justificativa;
        this.estaInativa = true;
    }
    public double[] consultarExtrato(Date dataInicial, Date dataFinal) {
        // Maluco não pediu logica esse fdp
        return new double[] {0d};
    }
    public void     sacar(double valorSolicitado) {}
}

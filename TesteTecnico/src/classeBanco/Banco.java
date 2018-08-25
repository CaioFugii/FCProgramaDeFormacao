/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeBanco;

/**
 *
 * @author CAIO
 */
public class Banco {
    private String numeroDaConta;
    private String nomeDoCorrentista;
    private double saldo = 0;
    
    public Banco(String numeroDaConta, String nomeDoCorrentista){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
    }
    public Banco(String numeroDaConta, String nomeDoCorrentista, double saldo){
        this(numeroDaConta, nomeDoCorrentista);
        this.saldo = saldo;
    }
    
    public void alterarNome(String novoNome){
        System.out.printf("%s: Nome do correntista alterado para %s%n", this.nomeDoCorrentista, novoNome);
        this.nomeDoCorrentista = novoNome;
    }
    public void deposito(double valor){
        this.saldo += valor;
        System.out.printf("%s: Você depositou R$%.2f na conta. Seu novo saldo é R$%.2f%n", this.nomeDoCorrentista, valor, this.saldo);
    }
    public void saque(double valor){
        if(valor > this.saldo){
            System.out.printf("%s: Saldo insuficiente!%n", this.nomeDoCorrentista);
            return;
        }
        this.saldo -= valor;
        System.out.printf("%s: Você sacou R$%.2f. Seu novo saldo é R$%.2f%n", this.nomeDoCorrentista, valor, this.saldo);
    }
}

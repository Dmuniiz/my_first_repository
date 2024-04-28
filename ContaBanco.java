package Banco;

public class ContaBanco {
 
    private int numeroConta;
    private String titular;
    private double saldo;
    private double limiteSaldoNegativo = 0;

    public ContaBanco(int numeroConta, String titular) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.limiteSaldoNegativo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaldoNegativo() {
        return limiteSaldoNegativo;
    }

    public void setLimiteSaldoNegativo(double limiteSaldoNegativo) {
        this.limiteSaldoNegativo = limiteSaldoNegativo * -1;
    }

    public void deposito(double valor){
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
    }
    
    public double saque(double valor){
    	if(saldo - valor < limiteSaldoNegativo) {
    		  System.out.println("ERRO: LIMITE insuficiente para realizar o saque de R$" + valor);
    		return 0;
    	}else {
    		return this.saldo -= valor;
    	}	
    }
    
    public String mostrarDados(){
        return "Titular da Conta: " + getTitular() + "\n" + 
                "Número da Conta: " + getNumeroConta() + "\n" +
                "Saldo: " + getSaldo() + "\n" +
                "Limite: " + getLimiteSaldoNegativo() + "\n" ;
    }
 
}

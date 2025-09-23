package atividade04;

public class Vendedor extends Funcionario{
    //Atributo
    private double comissao;

    public Vendedor(String nome, double comissao){
        super(nome, 1200.0);
        this.comissao = comissao;
    }
    //Get e Set
    public void setComissao(double valor){this.comissao = valor;}
    public double getComissao(){
        return this.comissao;
    }
    //Polimorfismo
    public double calcularPagamento(){
        return super.getSalarioBase() + this.comissao;
    }
}

package atividade04;

public class Gerente extends Funcionario{

    private double bonus;

    public Gerente(String nome, double bonus){
        super(nome, 2400);
        this.bonus = bonus;
    }

    //Get e Set
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double valor){
        this.bonus = valor;
    }
    //Metodo
    public double calcularPagamento() {
        return super.calcularPagamento() + this.bonus;
    }
}

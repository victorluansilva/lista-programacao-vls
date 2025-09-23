package atividade04;

public class Auxiliar extends Funcionario{

    private boolean cor0000 = false;

    public Auxiliar(String nome, double salarioBase, boolean cor0000){
        super("Pablo",1200);
        this.cor0000 = cor0000;
    }

    public double calcularPagamento(){
      return super.getSalarioBase() + (cor0000 ?(-600):0);
    }


}

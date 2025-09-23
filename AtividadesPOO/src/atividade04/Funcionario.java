package atividade04;

public class Funcionario {
    //Atributos
    private String nome;
    private double salarioBase;
    //Construtores
    public Funcionario(){
        this.nome = "";
        this.salarioBase = 1200.0;
    }
    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    //Getters e Setters
    public String getNome(){
        return this.nome;
    }
    public void setNome(String valor){
        this.nome = valor;
    }
    public double getSalarioBase(){
        return this.salarioBase;
    }
    public void setSalarioBase(double valor){this.salarioBase = valor; }
    //Métodos da Classe (as ações do objeto)
    public double calcularPagamento(){return this.salarioBase;}
}

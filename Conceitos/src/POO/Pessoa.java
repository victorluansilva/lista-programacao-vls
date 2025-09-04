package POO;

public class Pessoa { // Classe é a definição do Objeto

    //Atributos (são as variáveis ou constantes)
    private String nome;
    private int idade;
    private String corDaPele;
    private char sexo;
    private int cpf;
    private double altura;
    private double peso;
    private String ig;

    //Funcionalidades (são os métodos)
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

}

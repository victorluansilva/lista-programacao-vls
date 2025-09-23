package atividade04;

public class Main {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();
        Funcionario funcionario = new Funcionario("Kauan",2000);
        Vendedor vendedor = new Vendedor("Carlão",1000);
        Gerente gerente = new Gerente("Carlitos",5000);
        Auxiliar aux = new Auxiliar("Léo",900,true);

        folha.pagar(funcionario);
        folha.pagar(vendedor);
        folha.pagar(gerente);
        folha.pagar(aux);

    }
}

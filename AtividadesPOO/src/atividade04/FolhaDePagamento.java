package atividade04;

public class FolhaDePagamento {

    public void pagar(Funcionario f){
        System.out.println("Pagamento \n" +
                "Funcionário: " + f.getNome() + " \n" +
                "Valor recebido: " + f.calcularPagamento());
    }

}

import java.util.Scanner;

public class AtividadeSala07 {

    public static void main(String[] args) {
        //Exemplo com o SE(IF)
        int a = 5, b = -5, x = 30, y = 9;
        if (a < 0 && b < 0 && x < 0 && y < 0){
            System.out.println("Todos os valores são negativos.");
        } else if(a < 0 || b < 0 || x < 0 || y < 0){
            System.out.println("Pelo menos um valor é negativo.");
        } else {
            System.out.println("Todos os valores são positivos");
        }
        //Exemplo com o Escolha (Switch/Case)
        char opcao = 'S';
        switch (opcao){
            case 'S':
                System.out.println("A opção 'S' foi escolhida");
                break;
            case 'N':
                System.out.println("A opção 'S' foi escolhida");
                break;
            default:
                System.out.println("A opção escolhida é inválida");
                break;
        }

        // LEITURA DE DADOS
        /*
        Bliblioteca Java.util.Scanner será utilizada para realizar a leitura de dados
         */
    }
}

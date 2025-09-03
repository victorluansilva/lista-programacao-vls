import java.util.Scanner;
public class Atividade32 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        final String senha = "1234";

        System.out.println("Digite a senha: ");
        String valor = leia.nextLine();

        while (!valor.equals(senha)){
            System.out.println("Senha incorreta! \n Tente novamente.");
            valor = leia.nextLine();
        }
        if (valor.equals(senha)) System.out.println("Senha correta. Acesso liberado");
    }
}

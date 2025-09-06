import java.util.Scanner;
public class Atividade55 {
    public static int fatorial(int valor){
        if (valor <= 1)
            return 1;
        else
            return valor * fatorial(valor -1);
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor para fatoriar:");
        int valor = leia.nextInt();
        System.out.println("O fatorial de " + valor + " é: " + fatorial(valor));
    }
}

import java.util.Scanner;

public class Atividade53 {

    public static boolean ehPrimo(int numero) {
        if(numero == 2 || numero == 1)
            return true;
        if ((numero < 1) || (numero % 2 == 0))
            return false;
        else
            return (numero % 1 == 0 && numero % numero == 0);
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero = 0;
        while (numero >= 0) {
            System.out.println("Digite um número inteiro e descubra se ele é primo:");
            numero = leia.nextInt();
            String resultado = ehPrimo(numero) ? "é primo" : "não é primo";
            System.out.println("O número digitado " + resultado);
        }
    }

}

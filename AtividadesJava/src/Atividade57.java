import java.util.Scanner;
public class Atividade57 {
    public static void imparOuPar(int valor){
        if (valor % 2 == 0)
            System.out.println("O número digitado é par!");
        else
            System.out.println("O número digitado é impar!");
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um valor para saber se é impar o par:");
        imparOuPar(leia.nextInt());
    }
}

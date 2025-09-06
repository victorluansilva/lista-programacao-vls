import java.util.Scanner;
public class Atividade51 {
    public static int soma(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite dois valores abaixo:");
        int a = leia.nextInt();
        int b = leia.nextInt();
        System.out.println("A soma de " + a + " + " + b + " é = " + soma(a,b));
    }
}

import java.util.Scanner;
//Leia um número n e mostre os n primeiros números da sequência de Fibonacci usando for .
// 0 + 1 = 1; 1 + 1 = 2; 2 + 1 = 3; 2 + 3 = 5;
//0,1,1,2,3,5
public class Atividade39 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor limite 'n' para cálculo do fibonacci");
        int n = leia.nextInt();
        int primeiro = 0, segundo = 1, proximo = 0;
        String texto = "Fibonacci até "+n+" digitos: "+primeiro+", "+segundo+", ";
        for (int i = 0; i < n-2; i++){ //para i de 0 até n, faça
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            texto+=proximo+", ";
        }
        System.out.println(texto);
    }
}

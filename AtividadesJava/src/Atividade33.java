import java.util.Scanner;
public class Atividade33 {
    //Leia idades em um laço do/while até que seja digitado um valor negativo. Calcule e mostre a média das idades.
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade = 0, contador = 0, soma =0;
        double media = 0.0;
        do {
            System.out.println("Digite a idade:");
            idade = leia.nextInt();
            soma+= idade;//soma = soma + idade;
            contador++;//contador = contador + 1;
        } while (idade > 0);
        media = soma/contador;
        System.out.println("A media das idades digitadas é:" +media);
    }

}


import java.util.Scanner;
/* LAÇOS DE REPETIÇÃO
*   Do/While(faça/enquanto): EXECUTA o código primeiro, depois testa condição;
*   While(enquanto): Testa condição primeiro, se verdadeira, executa;
*   For(para): para i de 0 até n faça, executa o código por um limite determinado;
* */
public class Atividade40 {
    public static void main(String[] args) {
        //Leia 5 números inteiros dentro de um for e mostre a média aritmética deles ao final.
        Scanner leia = new Scanner(System.in);
        int[] numero = {0,0,0,0,0};//pode criar vetor nesta atividade
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " +(i+1)+"º número inteiro:");
            numero[i] = leia.nextInt();
            soma+=numero[i];
        }
        double media = soma/numero.length;
        System.out.println("A média entre os números digitados é " + media);
    }
}
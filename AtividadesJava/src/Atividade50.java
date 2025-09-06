import java.util.Scanner;
public class Atividade50 {

    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            String linha = "";
            for (int j = 0; j < matriz[i].length; j++) {
                linha += "["+matriz[i][j]+"] ";
            }
            System.out.println(linha);
        }
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matrizResultado = new int[3][3];

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.println("Digite um número:");
                matriz[l][c] = leia.nextInt();
                matrizResultado[l][c] = matriz[l][c];
            }
        }

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);
        System.out.println("Matriz quadrada:");
        imprimirMatriz(matrizResultado);

    }
}

public class Atividade48 {

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
        int[][] matriz = new int[4][4];
        int maiorValor = 0, linha = 0, coluna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int aleatorio = (int) Math.round(Math.random() * 100);
                matriz[i][j] = aleatorio;
                if(maiorValor < matriz[i][j]){
                    maiorValor = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        imprimirMatriz(matriz);
        System.out.println("O maior valor encontrado foi: " + maiorValor);
        System.out.println("Localizado na posição: \n Linha:["+linha+"], Coluna:["+coluna+"]");
    }



}

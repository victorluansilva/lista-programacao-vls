import java.util.Scanner;
public class AtividadeSala11 {
    //Estrutura PARA (FOR)
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double nota1, nota2, nota3, media = 0;

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o valor da " +i+ "ª nota:");
            switch (i){
                case 0:
                    nota1 = leia.nextDouble();
                    break;
                case 1:
                    nota2 = leia.nextDouble();
                    break;
                case 2:
                    nota3 = leia.nextDouble();
                    break;
                default:
                    break;
            }
        }
        System.out.println("A média das notas digitadas é:");
    }
}

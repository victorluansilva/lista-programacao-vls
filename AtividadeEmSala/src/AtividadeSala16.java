import java.util.Scanner;
public class AtividadeSala16 {
        //RECURSSÃO

    //Função recursiva para calculo de fatorial

    public static int fatorial(int valor){
        if (valor == 0)
            return 1;
        else
            return valor * fatorial(valor - 1);
    }

    public static void main(String[] args) {


    }
}

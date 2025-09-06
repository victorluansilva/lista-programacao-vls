import java.util.Scanner;
public class Atividade52 {

    public static double celciusToFahrenheit(double celcius){
       return (celcius * 1.8) + 32;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite os graus celcius para conversão:");
        System.out.println("Conversão: "+celciusToFahrenheit(leia.nextDouble())+"ºF");


    }
}

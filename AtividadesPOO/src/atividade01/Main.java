package atividade01;

public class Main {
    public static void main(String[] args) {

        Lampada lampada01 = new Lampada();
        Lampada lampada02 = new Lampada();

        lampada01.aumentarBrilho(80);
        lampada02.reduzirBrilho(50);
        lampada01.mudarCor("Verde");
        lampada01.ligar();
        lampada01.desligar();
        lampada02.ligar();
        lampada02.mudarCor("Azul");
        lampada02.aumentarBrilho(130);
        lampada02.aumentarBrilho(50);
        lampada02.reduzirBrilho(100);
    }
}

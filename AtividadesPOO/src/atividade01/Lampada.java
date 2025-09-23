package atividade01;

public class Lampada {
    private boolean ligado;
    private int brilho;
    private String cor;

    public Lampada() {
        this.ligado = false;
        this.brilho = 0;
        this.cor = "Branco";
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Lâmpada: Ligada");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Lâmpada: Desligada");
    }

    public void aumentarBrilho(int valor) {
        if (valor > 100){
            this.brilho = 100;
        } else if(valor >= 0) {
            int resultado = this.brilho + valor;
            if (resultado >= 0 && resultado <= 100) {
                this.brilho = resultado;
            }
        }
        System.out.println("O brilho da lâmpada está em: " + this.brilho);

    }
    public void reduzirBrilho(int valor) {
        int resultado = this.brilho - valor;
        if (resultado >= 0 && resultado <= 100){
            this.brilho = resultado;
        }
        System.out.println("O brilho da lâmpada está em: " + this.brilho);

    }
    public void mudarCor(String novaCor) {
        this.cor = novaCor;
        System.out.println("A cor da lâmpada é: " + this.cor);
    }
}

public class Resumo {

    public static void main(String[] args){

        // TIPOS PRIMITIVOS DE VARIÁVEIS

        //Textuais
        String texto = "Só pode receber texto";
        char caracter = 'A';

        //Numéricos
        int numeroInteiro = 5; //tipo inteiro
        double numeroReal = 3.14; //tipo real

        //Lógico
        boolean logico = false;

        // VARIÁVEIS E CONSTANTES

        String nomeDaVariavel = "";
        int idade = 0;
        double totalDaMedia;
        // CONSTANTE
        final double PI = 3.14;

        // OPERADORES

        //ATRIBUIÇÃO DE VALOR
        int a = 5;
        int b = 1;
        a += b; // a = a + b; result: 6
        System.out.println(a);
        a -= b; // a = a - b; result: 5
        System.out.println(a);
        //OPERAÇÕES DE RELAÇÃO COMPARAÇÃO
        boolean result = false;
        result = (a == b);
        System.out.println(result);
        result = (a != b);
        System.out.println(result);
        result = (a < b);
        System.out.println(result);
        result = (a > b);
        System.out.println(result);
        result = (a >= b);
        System.out.println(result);
        result = (a <= b);
        System.out.println(result);
        //LÓGICOS
        boolean varA = false; boolean varB = false;
        result = (varA && varB);// OPERADOR E(AND)
        result = (varA || varB);// OPERADOR OU(OR)
        result = (!varA);//OPERADOR NÃO(NOT)

        // ESTRUTURAS CONDICIONAIS

        // Estrutura SE (If/Else)
        boolean condicao = true, segundacodicao = true;

        if(condicao){
            //se a condição for verdadeira o código é executado
        } else if (segundacodicao){
            //senão este código será atualizado
        } else {
            //código a ser executado se as condições anteriores forem falsas
        }


        // Estrutura Escolha (Switch/Case)

        char opcao = 'S'

        switch (opcao){
            case 's':
                //código que vai rodar
                break;
            case 'n':
                //código que vai rodar
                break;
            default:
                //código que vai rodar
                break;
        }





    }































    }

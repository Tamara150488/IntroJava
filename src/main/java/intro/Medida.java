// 1 - Pacote
package intro;

// 2 - Referências as bibliotecas

import java.util.Scanner;

// 3 - Classe
    public class Medida{
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou um software

        // Utilizar a classe do Scanner do Java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U  D E  O P Ç Õ E S ");
        System.out.println("c - Calcular Area Modo Curto ");
        System.out.println("d - Contar Até Dez");
        System.out.println("e - Calcular Area Modo Extenso");
        System.out.println("i - If Simples");
        System.out.println("r - Contagem Regressiva");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();



        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        //String opcao  = "curto";

        switch (opcao) {
            case "c":
            case "C":
                System.out.println("Você escolheu executar o médoto calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu executar o método contarAteDez");
                contarAteDez();
                break;
           case "e":
           case "E":
                System.out.println("Você escolheu executar o médoto calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "i":
            case "I":
                System.out.println("Você escolheu executar o médoto ifSimples");
                ifSimples();
                break;
            case "r":
            case "R":
                System.out.println("Você escolheu executar o método contargemRegressiva");
                contagemRegressiva();
                break;
                default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada");
                break;
        }

        }


    public static void ifSimples (){
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou um software

        //if = se
        //else = senão

        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCurto() {
        System.out.println("Cálculo de Areas modo Curto");

        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }

    public static void calcularAreaModoExtenso(){

        System.out.println("Cálculo de Areas Modo Extenso");

        // Calculo de área - Exemplo: o tamanho do tapete ou piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // Largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                            + comprimento + "m a área é de " + resultado + "m²");
    }
 public static void contarAteDez(){

        // Loops ou Repetições
        // for = repetição incondicional

        System.out.println("Contagem Crescente");
        for(int numero = 1; numero <= 10; numero++){
            System.out.println(numero);
        }

 }
 public static void contagemRegressiva(){
    System.out.println("Contagem Regressiva");
        for(int numero = 10; numero > -1; numero--){
            System.out.println(numero);
        }
    }
}

import java.util.Scanner;

public class ExercicioBasico5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercício 1 Número positivo ou negativo
        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        // Exercício 2 Comparar dois números
        System.out.println("Agora vamos comparar dois números!");
        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else if (num1 > num2) {
            System.out.println("O primeiro número é maior.");
        } else {
            System.out.println("O segundo número é maior.");
        }
        //Exercício 3 Menu de Cálculo de Área
        System.out.println("agora vamos calcular area do quadrado e do circulo");
        System.out.println("Escolha uma opção");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. calcular área do círculo");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("digite o lado do quadrado");
                double lado = sc.nextDouble();
                double AreaQuadrado = lado * lado;
                System.out.println("Area do quadrado: " + AreaQuadrado);
                break;
            case 2:
                System.out.println("digite o raio do círculo");
                double raio = sc.nextDouble();
                double AreaCirculo = raio * raio;
                System.out.println("Area do Circulo: " + AreaCirculo);
                break;
            default:
                System.out.println("opção invalida");
                break;
        }
        //Exercício 4 Tabuada
        System.out.println("escolha um número da tabuada");
        int numTabuada = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numTabuada + " x " + i + " = " + (numTabuada * i));
        }
        //Exercicio 5 par ou ímpar
        System.out.println("Escolha um número");
        sc.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class ExercicioBasico4 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100)+1;
        //System.out.println("O secreto foi: " + numeroSecreto); // só para testar se o codigo está funcionando corretamente

        Scanner scanner = new Scanner(System.in);
        int tentativas = 1;
        int palpite = -1; // valor inicial qualquer

        while (palpite != numeroSecreto && tentativas < 5) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns você acertou!");
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior, tente novamente");
            } else {
                System.out.println("O número secreto é menor, tente novamente");
            }

            tentativas++;
        }

        if (palpite != numeroSecreto) {
            System.out.println("Suas tentativas acabaram! O número secreto era: " + numeroSecreto);
        }
    }
}

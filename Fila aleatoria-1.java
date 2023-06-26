import java.util.*;

public class DistribuicaoNumerosAleatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] nomes = new String[6];
        int[] numeros = new int[6];
        
        System.out.println("Digite os nomes:");
        for (int i = 0; i < 6; i++) {
            nomes[i] = scanner.nextLine();
            numeros[i] = random.nextInt(900) + 100; // Gera um número aleatório de 100 a 999
        }
        
        System.out.println("Nomes e números aleatórios:");
        for (int i = 0; i < 6; i++) {
            System.out.println(nomes[i] + ": " + numeros[i]);
        }
    }
}

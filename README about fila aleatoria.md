# Tryout0013
import java.util.*;: This line imports the java.util package, which includes the Scanner and Random classes, among others.

public class DistribuicaoNumerosAleatorios {: This line declares a public class named DistribuicaoNumerosAleatorios. The class serves as the entry point for the program.

public static void main(String[] args) {: This line defines the main method, which is the starting point of the program's execution. It takes an array of strings args as a parameter, which allows command-line arguments to be passed to the program.

Scanner scanner = new Scanner(System.in);: This line creates a new Scanner object named scanner, which is used to read input from the user.

Random random = new Random();: This line creates a new Random object named random, which is used to generate random numbers.

String[] nomes = new String[6];: This line declares an array of strings named nomes with a length of 6. This array will store the names entered by the user.

int[] numeros = new int[6];: This line declares an array of integers named numeros with a length of 6. This array will store the randomly generated numbers.

System.out.println("Digite os nomes:");: This line prints the message "Digite os nomes:" (which translates to "Enter the names:") to the console.

for (int i = 0; i < 6; i++) {: This line starts a loop that iterates 6 times, using the variable i as the loop counter.

nomes[i] = scanner.nextLine();: This line reads a line of input from the user using the scanner object and assigns it to the i-th element of the nomes array.

numeros[i] = random.nextInt(900) + 100;: This line generates a random integer between 100 and 999 (inclusive) using the random object's nextInt method and assigns it to the i-th element of the numeros array.

System.out.println("Nomes e números aleatórios:");: This line prints the message "Nomes e números aleatórios:" (which translates to "Names and random numbers:") to the console.

for (int i = 0; i < 6; i++) {: This line starts another loop that iterates 6 times, using the variable i as the loop counter.

System.out.println(nomes[i] + ": " + numeros[i]);: This line prints the i-th element of the nomes array, followed by a colon and a space, and then the i-th element of the numeros array. This line effectively displays each name followed by its corresponding random number.

Overall, this program prompts the user to enter 6 names, generates a random number for each name, and then displays the names along with their corresponding random numbers.

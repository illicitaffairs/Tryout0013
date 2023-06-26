# Tryout0013
The given code is a simple calculator program written in Java. Let's go through the code step by step to understand how it works:

Importing the necessary package:

java
Copy code
import java.util.Scanner;
This line imports the Scanner class from the java.util package, which is used for reading user input.

Defining the Calculadora class:

java
Copy code
public class Calculadora {
The code defines a public class named Calculadora. In Java, a class serves as a blueprint for creating objects and encapsulates related code.

Declaring the main method:

java
Copy code
public static void main(String[] args) {
The main method is the entry point for the program execution. It is a static method that takes an array of strings (args) as a parameter.

Creating a Scanner object:

java
Copy code
Scanner scanner = new Scanner(System.in);
This line creates a new Scanner object named scanner. The Scanner class is used to read user input from the console (System.in).

Prompting for and reading the first number:

java
Copy code
System.out.print("Digite o primeiro número: ");
double numero1 = scanner.nextDouble();
The program displays the message "Digite o primeiro número: " and waits for the user to enter a number. The entered number is then assigned to the variable numero1 of type double.

Prompting for and reading the second number:

java
Copy code
System.out.print("Digite o segundo número: ");
double numero2 = scanner.nextDouble();
Similarly, the program displays the message "Digite o segundo número: " and waits for the user to enter a number. The entered number is assigned to the variable numero2 of type double.

Displaying the operation options:

java
Copy code
System.out.println("Escolha uma operação:");
System.out.println("1 - Soma");
System.out.println("2 - Subtração");
System.out.println("3 - Multiplicação");
System.out.println("4 - Divisão");
System.out.print("Opção: ");
int operacao = scanner.nextInt();
The program displays the available operation options to the user. The user is prompted to enter an option number, which is stored in the variable operacao of type int.

Performing the selected operation:

java
Copy code
double resultado = 0;

switch (operacao) {
    case 1:
        resultado = numero1 + numero2;
        break;
    case 2:
        resultado = numero1 - numero2;
        break;
    case 3:
        resultado = numero1 * numero2;
        break;
    case 4:
        resultado = numero1 / numero2;
        break;
    default:
        System.out.println("Opção inválida.");
        return;
}
A switch statement is used to determine the selected operation based on the value of operacao. Depending on the chosen option, the corresponding operation is performed and the result is stored in the variable resultado.

Displaying the result:

java
Copy code
System.out.println("Resultado: " + resultado);
The program prints the result by displaying the message "Resultado: " followed by the value stored in the resultado variable.

Closing the Scanner object:

java
Copy code
scanner.close();
The scanner object is closed to release any resources associated with it.

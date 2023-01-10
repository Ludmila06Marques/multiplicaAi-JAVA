import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Escreva um código que deve imprimir a tabela de multiplicação desse algum
        // número fornecido, e deve exibir um cabeçalho com o nome Tabela de
        // multiplicação de X, onde X é o número a ser multiplicado.

        Scanner multiplica = new Scanner(System.in);
        System.out.println("Qual tabela voce deseja?");

        Integer numeroEscolhido = Integer.parseInt(multiplica.next());

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Tabela do " + numeroEscolhido);

        for (int i = 0; i < numeros.length; i++) {

            int resultado = numeroEscolhido * numeros[i];

            System.out.print(numeroEscolhido + " X " + numeros[i] + " = ");
            System.out.println(resultado);

        }
        multiplica.close();

    }
}
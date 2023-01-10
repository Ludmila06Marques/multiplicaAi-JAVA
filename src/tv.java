import java.util.Scanner;

public class tv {
    public static void main(String[] args) throws Exception {
    

        Scanner entrada = new Scanner(System.in);
        System.out.println("O trabalho de terca deu certo? (s OU n)");
        String res1 = entrada.nextLine();
        entrada.close();

        if (res1.equalsIgnoreCase("s")) {

            boolean terca = true;
            System.out.println(terca);
        } else {
            boolean terca = false;
            System.out.println(terca);

        }

      

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[]arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero inteiro");
        int numero = sc.nextInt();

        boolean numeroPar = numero % 2 == 0;

        if (numeroPar) {
            System.out.println("O numero " + numero + " é par");
        } else {
            System.out.println("o numero " + numero + " é impar");
        }
    }
}
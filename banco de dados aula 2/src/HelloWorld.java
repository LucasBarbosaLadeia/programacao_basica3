import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nuemro");
        int numero1 =scanner.nextInt();
        System.out.println("Digite outro numero");
        int numero2 = scanner.nextInt();
        int soma = numero1 + numero2;
        double resultado = ((double)numero1 / numero2); //casting
       // System.out.println("A soma dos numeros é igual a " + resultado);

    String nome = "Ivan";
    String curso = "TADS";
        System.out.println(nome + " do curso " + curso);
if(soma <= 2){
    System.out.println("A soma dos numeros é igual a " + soma);
}else if (soma != 12) {
    System.out.println("entrou no else if");
} else {
    System.out.println("tudo errado");
}

char letra = 'k';
    }
}

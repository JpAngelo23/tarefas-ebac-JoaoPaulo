import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        System.out.println("*********************CALCULADORA DE MÉDIA*********************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da nota 1: ");
        nota1 = sc.nextInt();
        System.out.println("Digite o valor da nota 2: ");
        nota2 = sc.nextInt();
        System.out.println("Digite o valor da nota 3: ");
        nota3 = sc.nextInt();
        System.out.println("Digite o valor da nota 4: ");
        nota4 = sc.nextInt();
        sc.close();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("O valor da média obtida foi de: " + media + ".");
        System.out.println("Obrigado.");
        System.out.println("**************************************************************");

    } //FIM.
}
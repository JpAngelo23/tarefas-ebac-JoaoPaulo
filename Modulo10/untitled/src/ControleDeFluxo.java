import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        System.out.println("************ Sistema de Verificação de Notas *************");
        System.out.println("Para verificar se houve a Aprovação, por favor, insira as notas.");
        System.out.println("Digite o valor da Nota 1: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite o valor da Nota 2: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite o valor da Nota 3: ");
        nota3 = sc.nextDouble();
        System.out.println("Digite o valor da Nota 4: ");
        nota4 = sc.nextDouble();
        sc.close();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média obtida foi de: " + media);

        if (media >= 7){
            System.out.println("Parabéns, Você foi aprovado!");
        } else if (media >= 5) {
            System.out.println("Você não obteve nota suficiente e está de recuperação.");
        } else if (media < 5) {
            System.out.println("Infelizmente, você foi reprovado.");
        }
        System.out.println("Obrigado");
        System.out.println("*************************************************************");

    }
}
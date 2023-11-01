import java.util.Scanner;

public class Tarefa_Wrapper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor do tipo: Número inteiro: ");
        int valorPrimitivo = scanner.nextInt();

        // Faz o casting do valor primitivo para o seu tipo Wrapper correspondente
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        scanner.close();

        // Imprime o valor Wrapper no console
        System.out.println("Valor Wrapper: " + valorWrapper);
    }
}

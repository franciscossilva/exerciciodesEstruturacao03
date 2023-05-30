import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com distinção! Média: " + media);
        } else if (media >= 7) {
            System.out.println("Aprovado! Média: " + media);
        } else {
            System.out.println("Reprovado! Média: " + media);
        }
    }
}
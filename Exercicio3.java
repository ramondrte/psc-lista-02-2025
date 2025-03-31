import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;
        
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            somaNotas += scanner.nextDouble();
        }
        System.out.println("Média: " + (somaNotas / 4));
        
        scanner.close();
    }
}
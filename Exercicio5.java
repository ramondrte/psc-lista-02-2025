import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço da viagem para Alemanha: ");
        double precoAlemanha = scanner.nextDouble();
        System.out.print("Digite o preço da viagem para Portugal: ");
        double precoPortugal = scanner.nextDouble();
        System.out.print("Digite o preço da viagem para Itália: ");
        double precoItalia = scanner.nextDouble();
        System.out.print("Digite a quantidade de pessoas que irão viajar: ");
        int qtdPessoas = scanner.nextInt();
        
        double custoTotal = (precoAlemanha + precoPortugal + precoItalia) * qtdPessoas;
        System.out.println("O custo total da viagem será: R$ " + custoTotal);
        
        scanner.close();
    }
}
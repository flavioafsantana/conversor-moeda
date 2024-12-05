import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorDeMoedas conversor = new ConversorDeMoedas();

        while (true) {
            System.out.println("\n--- Conversor de Moedas ---");
            System.out.println("1. Real (BRL) para Dólar (USD)");
            System.out.println("2. Dólar (USD) para Real (BRL)");
            System.out.println("3. Real (BRL) para Euro (EUR)");
            System.out.println("4. Euro (EUR) para Real (BRL)");
            System.out.println("5. Real (BRL) para Libra Esterlina (GBP)");
            System.out.println("6. Libra Esterlina (GBP) para Real (BRL)");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 7) {
                System.out.println("Saindo...");
                break;
            }

            System.out.print("Informe o valor a ser convertido: ");
            double valor = scanner.nextDouble();

            double resultado = conversor.converter(opcao, valor);

        }

        scanner.close();
    }
}

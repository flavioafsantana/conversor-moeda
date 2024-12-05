import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConversorDeMoedas {
    public double converter(int opcao, double valor) {
        RequisicaoAPI requisicaoAPI = new RequisicaoAPI();
        String moedaOrigem = "";
        String moedaDestino = "";
        double valorConvertido = -1;

        try {
            // Obter data e hora atual
            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String dataHora = agora.format(formato);

            switch (opcao) {
                case 1: // BRL para USD
                    moedaOrigem = "Real (BRL)";
                    moedaDestino = "Dólar (USD)";
                    valorConvertido = requisicaoAPI.obterTaxa("BRL", "USD", valor);
                    break;
                case 2: // USD para BRL
                    moedaOrigem = "Dólar (USD)";
                    moedaDestino = "Real (BRL)";
                    valorConvertido = requisicaoAPI.obterTaxa("USD", "BRL", valor);
                    break;
                case 3: // BRL para EUR
                    moedaOrigem = "Real (BRL)";
                    moedaDestino = "Euro (EUR)";
                    valorConvertido = requisicaoAPI.obterTaxa("BRL", "EUR", valor);
                    break;
                case 4: // EUR para BRL
                    moedaOrigem = "Euro (EUR)";
                    moedaDestino = "Real (BRL)";
                    valorConvertido = requisicaoAPI.obterTaxa("EUR", "BRL", valor);
                    break;
                case 5: // BRL para GBP
                    moedaOrigem = "Real (BRL)";
                    moedaDestino = "Libra Esterlina (GBP)";
                    valorConvertido = requisicaoAPI.obterTaxa("BRL", "GBP", valor);
                    break;
                case 6: // GBP para BRL
                    moedaOrigem = "Libra Esterlina (GBP)";
                    moedaDestino = "Real (BRL)";
                    valorConvertido = requisicaoAPI.obterTaxa("GBP", "BRL", valor);
                    break;
                default:
                    return -1;
            }

            // Exibe a mensagem formatada com os valores convertidos e a data e hora da conversão
            if (valorConvertido != -1) {
                System.out.printf("Data e hora da conversão: %s\n", dataHora);
                System.out.printf("Valor %.2f %s corresponde a %.2f %s.\n", valor, moedaOrigem, valorConvertido, moedaDestino);
            }
            return valorConvertido;

        } catch (Exception e) {
            System.out.println("Erro ao obter taxa de câmbio: " + e.getMessage());
            return -1;
        }
    }
}

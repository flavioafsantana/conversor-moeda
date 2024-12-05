import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

public class RequisicaoAPI {
    private static String apiKey;

    static {
        try {
            InputStream inputStream = RequisicaoAPI.class.getClassLoader().getResourceAsStream("config.properties");
            if (inputStream == null) {
                throw new Exception("Arquivo config.properties não encontrado.");
            }

            Properties properties = new Properties();
            properties.load(inputStream);
            apiKey = properties.getProperty("API_KEY");
        } catch (Exception e) {
            System.out.println("Erro ao carregar configurações: " + e.getMessage());
            apiKey = null;
        }
    }

    public double obterTaxa(String moedaOrigem, String moedaDestino, double valor) throws Exception {
        if (apiKey == null) {
            throw new Exception("Chave de API não configurada.");
        }

        String urlCompleta = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/%s", apiKey, moedaOrigem, moedaDestino, valor);


        URL url = new URL(urlCompleta);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");

        if(conexao.getResponseCode() == 200){
            InputStreamReader leitor = new InputStreamReader(conexao.getInputStream());
            JsonObject json = JsonParser.parseReader(leitor).getAsJsonObject();
            return json.get("conversion_result").getAsDouble();
        } else {
            throw new Exception("Erro ao conectar à API: " + conexao.getResponseCode());
        }
    }
}

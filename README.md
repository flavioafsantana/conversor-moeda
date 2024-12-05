# Conversor de Moedas 💰

Este é um projeto simples de **conversor de moedas**, desenvolvido em **Java** durante o programa **Oracle Next Education** em parceria com a **Alura**, que utiliza a **API Exchange Rates Data** para obter taxas de câmbio em tempo real. O programa permite realizar conversões entre diversas moedas, exibindo o valor convertido e o horário da conversão.

---

## Funcionalidades ✨

- Conversão de:
    - **Real (BRL) ↔ Dólar (USD)**
    - **Dólar (USD) ↔ Real (BRL)**
    - **Real (BRL) ↔ Euro (EUR)**
    - **Euro (EUR) ↔ Real (BRL)**
    - **Real (BRL) ↔ Libra Esterlina (GBP)**
    - **Libra Esterlina (GBP) ↔ Real (BRL)**
- Exibe o horário e a data da conversão.
- Interface simples via console.

---

## Como funciona? 🛠️

1. O programa solicita ao usuário que escolha a moeda de origem e destino, além do valor a ser convertido.
2. Através da **API Exchange Rates Data**, ele obtém a taxa de câmbio correspondente.
3. Realiza a conversão e exibe o resultado no formato:

"Você converteu X MoedaOrigem para Y MoedaDestino. Resultado: Y Data da conversão: DD/MM/YYYY HH:MM:SS"


---

## Pré-requisitos 🧰

- **Java JDK 8 ou superior** instalado.
- Conexão com a internet para acessar a API.
- **Chave da API Exchange Rates Data**. Caso ainda não tenha, pode se cadastrar e obter uma [aqui](https://www.exchangerate-api.com/).

---

## Configurando o projeto em outra máquina 🖥️

1. **Clone o repositório:**
```bash
git clone <url-do-repositorio>
```
2. **Instale o Java: Certifique-se de que o Java JDK esteja instalado. Para verificar, use:**
```bash
java -version
```
3. **Configuração da API Key:**
- Abra o arquivo src/resources/config.properties.
- Insira a sua chave da API no campo API_KEY:
```makefile
API_KEY=SUA_API_KEY_AQUI
```
4. **Compilação do projeto: Compile os arquivos Java executando:**
```bash
javac -d out src/*.java
```
5. **Executando o programa: Execute o programa a partir do diretório out:**
```bash
java Principal
```

---

## Estrutura do projeto 📂
```makefile
conversor-moeda/
├── .gitignore              # Arquivo para ignorar arquivos desnecessários no Git
├── README.md               # Documentação do projeto
├── src/
│   ├── ConversorDeMoedas.java  # Classe para a lógica de conversão
│   ├── Principal.java          # Classe principal (main)
│   ├── RequisicaoAPI.java      # Classe responsável pela conexão com a API
│   ├── resources/
│       └── config.properties   # Configuração com a chave da API
└── out/                    # Arquivos compilados
```

---

## Licença 📜
Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para mais informações.

---

## Observações importantes ⚠️
- O arquivo src/resources/config.properties está incluído no .gitignore para evitar a exposição da sua API Key. Não compartilhe sua chave publicamente!
- Certifique-se de que a API Key configurada tenha permissões para acessar taxas de câmbio.

---

## Contato 📬
Em caso de dúvidas ou sugestões, sinta-se à vontade para entrar em contato.

---


# Contact Manager - Java Project

Este projeto é um sistema de gerenciamento de contatos em Java, utilizando listas encadeadas para armazenar e manipular os contatos. O sistema permite adicionar, buscar, remover e listar contatos através de uma interface de linha de comando (CLI).

## Estrutura do Projeto

O projeto está organizado da seguinte forma:
- `models/`: Contém as classes que representam os modelos de dados (`Contact` e `Node`).
- `services/`: Contém a implementação da lista encadeada (`ContactList`) e os métodos principais para gerenciar os contatos.
- `app/`: Contém a classe principal (`ContactManager`) que gerencia a interação com o usuário através de um menu de opções.

## Requisitos de Sistema

- Java Development Kit (JDK) 8 ou superior.
- Um terminal ou ambiente de linha de comando para executar a aplicação.

## Configuração do Ambiente

1. **Instale o JDK**: Certifique-se de ter o JDK instalado em sua máquina. Se não tiver, você pode baixá-lo [aqui](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. **Configuração do Path (opcional)**: Caso precise configurar o JDK no `PATH` do seu sistema, siga as instruções:
   - No Windows:
     - Vá em **Painel de Controle > Sistema > Configurações Avançadas do Sistema > Variáveis de Ambiente**.
     - Edite a variável `PATH` e adicione o caminho para a pasta `bin` do JDK (ex.: `C:\Program Files\Java\jdk-11.0.10\bin`).
   - No Linux/macOS:
     - Abra o terminal e adicione o seguinte comando ao arquivo `.bashrc` ou `.zshrc`:
       ```bash
       export PATH=$PATH:/caminho/para/o/jdk/bin
       ```

## Executando o Projeto

1. **Compile as Classes**:
   - Navegue até o diretório onde as classes `.java` estão armazenadas e execute o seguinte comando:
     ```bash
     javac models/Contact.java models/Node.java services/ContactList.java app/ContactManager.java
     ```

2. **Execute o Programa**:
   - Após a compilação, execute a aplicação utilizando o comando:
     ```bash
     java app.ContactManager
     ```

3. **Interação com o Sistema**:
   - O sistema irá apresentar um menu com as seguintes opções:
     1. Adicionar Contato
     2. Buscar Contato
     3. Remover Contato
     4. Listar Contatos
     0. Sair
   - Basta escolher uma das opções e seguir as instruções no terminal.

## API e Persistência de Dados

**Este projeto não inclui uma API ou banco de dados**, pois o desafio adicional de persistência foi desconsiderado nesta versão. No entanto, uma implementação futura poderia incluir:
- Conexão com um banco de dados (ex.: PostgreSQL) para persistência de dados.
- Uma API RESTful para gerenciamento remoto de contatos.

## Testes do Sistema

Você pode testar as funcionalidades básicas do sistema com as seguintes operações:

1. **Adicionar Contatos**: Teste a inserção de vários contatos.
2. **Buscar Contatos**: Busque contatos por nome ou telefone.
3. **Remover Contatos**: Remova contatos existentes pelo nome ou telefone.
4. **Listar Contatos**: Liste todos os contatos armazenados.

## Futuras Implementações

- **Persistência de Dados**: Utilizar banco de dados como PostgreSQL para armazenar os contatos permanentemente.
- **API RESTful**: Implementar uma API para interagir com o sistema através de requisições HTTP (usando frameworks como Spring Boot).

## Contribuições

Sinta-se à vontade para abrir uma issue ou enviar um pull request com melhorias para este projeto.

## Licença

Este projeto está sob a licença MIT.

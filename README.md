# Gerenciador de Galpão📦

## Descrição
Este é um aplicativo Android desenvolvido em Java no Android Studio para gerenciar um galpão com 20 prateleiras (10 de cada lado). Cada prateleira possui dois lados (A e B), onde podem ser armazenados contêineres com informações sobre o tipo de projeto e o ano.

## Funcionalidades
- Cadastro de prateleiras com lados A e B.
- Cadastro de contêineres associando-os a uma prateleira.
- Listagem de todos os contêineres armazenados.
- Busca de contêineres por tipo de projeto e ano.

## Tecnologias Utilizadas
- **Java** (Linguagem de programação)
- **Android Studio** (Ambiente de desenvolvimento)
- **SQLite** (Banco de dados local)
- **RecyclerView** (Exibição dinâmica de listas)

## Estrutura do Projeto
```
GerenciadorGalpao/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/gerenciadorgalpao/
│   │   │   │   ├── MainActivity.java
│   │   │   │   ├── SearchActivity.java
│   │   │   │   ├── models/
│   │   │   │   │   ├── Prateleira.java
│   │   │   │   │   ├── Container.java
│   │   │   │   ├── database/
│   │   │   │   │   ├── DatabaseHelper.java
│   │   │   │   ├── adapters/
│   │   │   │   │   ├── ContainerAdapter.java
│   │   │   │   ├── controllers/
│   │   │   │   │   ├── ContainerController.java
│   │   │   │   │   ├── PrateleiraController.java
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   ├── activity_search.xml
│   │   │   │   │   ├── item_container.xml
│   │   │   ├── AndroidManifest.xml
│   ├── build.gradle
│   ├── settings.gradle
```

## Como Executar o Projeto
1. Clone este repositório:
   ```sh
   git clone https://github.com/seuusuario/gerenciador-galpao.git
   ```
2. Abra o projeto no **Android Studio**.🤳
3. Construa e execute o aplicativo em um dispositivo ou emulador Android.

## Contribuição
Se quiser contribuir com melhorias, siga os passos:
1. Faça um fork do repositório.
2. Crie um branch para sua feature:
   ```sh
   git checkout -b minha-feature
   ```
3. Faça suas alterações e commit:
   ```sh
   git commit -m "Adiciona nova funcionalidade"
   ```
4. Envie para o repositório:
   ```sh
   git push origin minha-feature
   ```
5. Abra um Pull Request 🚀

## Licença
Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.


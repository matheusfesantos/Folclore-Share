![Logo do Folclore Share](https://github.com/matheusfesantos/Folclore-Share/blob/v2/src/resources/Logo.png)

# Folclore Share 🌳✨
**Versão 2.0**
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white) ![CSS](https://img.shields.io/badge/CSS-2965F1?style=for-the-badge&logo=css3&logoColor=white)

## Sobre o Projeto 💖
O **Folclore Share** foi um dos meus primeiros projetos em **JavaFX**, e eu tenho um carinho imenso por ele. Com esta versão 2.0, estou revisitando o projeto para melhorar suas funcionalidades e implementar mudanças que refletem minha evolução como desenvolvedor Java.

## Objetivo 🎯
Oferecer um jeito único e divertido de aprender sobre o folclore brasileiro. Através de uma interface interativa e envolvente, os usuários podem explorar personagens e histórias fascinantes.

## Melhorias na Versão 2.0 

Com a versão 2.0, várias melhorias foram implementadas para tornar a experiência mais fluida, organizada e divertida. Confira as principais mudanças:

### 1. **Nova Estrutura de Pastas**
- A estrutura de diretórios foi reformulada, seguindo o padrão de projetos Java, com a organização centralizada em `src`. Isso melhora a manutenção e escalabilidade do código.

### 2. **Classe para Leitura de Arquivos**
- Foi criada uma classe dedicada para a leitura de recursos, como imagens e textos. Agora, é mais fácil gerenciar e acessar os arquivos do projeto, garantindo uma organização mais limpa e eficiente.

### 3. **Melhor Responsividade**
- Ajustes na interface para garantir que o **Folclore Share** tenha uma boa aparência e funcione bem em diferentes resoluções de tela, proporcionando uma experiência fluida em diversos dispositivos.

### 4. **Refatoração de Código**
- A lógica do código foi aprimorada, tornando-o mais eficiente e legível. Isso facilita futuras manutenções e melhora a performance do projeto.

### 5. **Animações de Transição**
- A navegação entre telas agora é mais suave, com animações de transição que tornam a interação mais agradável e moderna.

### 6. **Organização do Código**
- A organização do código foi aprimorada, separando melhor as responsabilidades entre as classes e criando pacotes mais claros e intuitivos.

### 7. **Melhorias no Visual**
- Alterações no layout e design, como o uso de animações e ajustes no estilo, deixam o projeto mais moderno e dinâmico.


## Capturas de Tela 📸

### Tela Inicial
[![Tela Inicial](https://drive.google.com/uc?id=1nF7UZTvvTW-BTn-hsa_hVI4GW8OA3ghl)](https://drive.google.com/file/d/1nF7UZTvvTW-BTn-hsa_hVI4GW8OA3ghl/view?usp=sharing)

### Tela de Seleção dos Folclores
[![Seleção dos Folclores](https://drive.google.com/uc?id=1HuIdSdbkOQwPyvP2ZKxvpPtlFc-GzdRo)](https://drive.google.com/file/d/1HuIdSdbkOQwPyvP2ZKxvpPtlFc-GzdRo/view?usp=sharing)

### Tela de História dos Personagens
[![História dos Personagens](https://drive.google.com/uc?id=1gVGkW3LqIOIvxK-0ROTabb7ubp38EaB_)](https://drive.google.com/file/d/1gVGkW3LqIOIvxK-0ROTabb7ubp38EaB_/view?usp=sharing)

## Eu criando a logo do Folclore Share 🎨
[![Criando a logo](https://drive.google.com/uc?id=1CDdL6Cu31zJpARclYAh03ZbiZIod2AEt)](https://drive.google.com/file/d/1CDdL6Cu31zJpARclYAh03ZbiZIod2AEt/view?usp=sharing)

## Estrutura de Pastas 📂
A organização de diretórios do projeto segue o padrão `src`, proporcionando uma melhor estruturação e manutenção do código:

```bash
FolcloreShare/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── app/
│   │   │   │   ├── FolcloreShareApp.java
│   │   │   │   └── utils/
│   │   │   │       ├── FileManager.java
│   │   │   │       └── ResourceLoader.java
│   │   │   ├── controllers/
│   │   │   │   ├── CharacterController.java
│   │   │   │   └── HomeController.java
│   │   │   └── models/
│   │   │       ├── Character.java
│   │   │       └── FolkloreStory.java
│   │   └── resources/
│   │       ├── images/
│   │       │   ├── curupira.png
│   │       │   └── saci.png
│   │       ├── styles/
│   │       │   └── style.css
│   │       └── fxml/
│   │           ├── Home.fxml
│   │           └── Character.fxml
│   └── test/
│       ├── java/
│       │   └── tests/
│       │       ├── CharacterControllerTest.java
│       │       └── HomeControllerTest.java
├── build.gradle
└── README.md
````
## Como Executar 🚀

Para rodar o **Folclore Share** em sua máquina, você precisa ter o **Java 22** e o **JavaFX** configurados. Siga os passos abaixo:

### 1. Requisitos
- **Java 22**: Faça o download do JDK 22 [aqui](https://jdk.java.net/22/).
- **JavaFX**: Baixe o JavaFX a partir do [site oficial](https://openjfx.io/).

### 2. Configurando o Ambiente

1. **Instale o JDK 22** em sua máquina e configure a variável de ambiente `JAVA_HOME` apontando para o diretório onde o JDK foi instalado.
   
2. **Baixe e configure o JavaFX**:
   - Baixe o **JavaFX SDK** adequado para o seu sistema operacional.
   - Adicione a pasta `lib` do JavaFX no seu classpath ou como uma biblioteca no seu IDE.

### 3. Executando o Projeto

Se você estiver usando o **IntelliJ IDEA** ou outro IDE similar:

1. Importe o projeto para sua IDE.
2. Adicione as bibliotecas do **JavaFX** ao projeto.
   - No IntelliJ, você pode adicionar as dependências do JavaFX no arquivo `pom.xml` ou diretamente nas configurações do projeto.
3. Compile o projeto e execute a classe principal `FolcloreShareApp.java`.

Se preferir rodar via linha de comando, use os seguintes passos:

1. Navegue até o diretório onde o código foi clonado.
2. Compile o código com o seguinte comando (supondo que o JavaFX esteja configurado corretamente):

```bash
javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml src/main/java/app/FolcloreShareApp.java
```

3. Para executar o projeto:

```bash
java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml app.FolcloreShareApp
```

Substitua `/path/to/javafx-sdk/lib` pelo caminho onde você extraiu o **JavaFX SDK**.

### 4. Pronto para Explorar!

Agora, você pode aproveitar o **Folclore Share** e explorar o fascinante mundo do folclore brasileiro. Divirta-se!

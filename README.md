# BancoMR - Java

![Badge Status](https://img.shields.io/badge/status-active-brightgreen)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?logo=android-studio&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)


## Descrição

O BancoMR é uma aplicação desenvolvida em Java focado em demonstrar as navegações entre as telas e o consumo de uma biblioteca externa para cartão de crédito. O projeto utiliza a arquitetura MVC (Model-View-Controller) para organizar o código e facilitar a manutenção e escalabilidade, entre outros recursos como Retrofit, Glide, RecyclerView, Firebase e GSon.

### GIF de Demonstração
![GIF do projeto](https://github.com/rfemina/BancoMRJava/blob/master/BancoMR-Java.gif)

### YouTube
[![Assista ao vídeo](https://img.shields.io/badge/YouTube-%23FF0000.svg?style=for-the-badge&logo=YouTube&logoColor=white)](https://youtu.be/Cs2HoPNT1KU)

### Arquivo APK
[![Arquivo APK](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://github.com/rfemina/BancoMRJava/blob/master/BancoMR-java.apk)

## Índice

- [Instalação](#instalação)
- [Uso](#uso)
- [Arquitetura](#arquitetura)
- [Objetivos](#objetivos)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Contribuição](#contribuição)
- [Licença](#licença)
- [Contato](#contato)

## Instalação

Siga os passos abaixo para configurar e rodar o projeto em sua máquina local.

1. Clone o repositório:
    ```sh
    git clone https://github.com/seu-usuario/bancomr-java.git
    cd bancomr-java
    ```

2. Abra o projeto no Android Studio:
    - File -> Open -> Selecione a pasta do projeto

3. Sincronize as dependências do Gradle:
    - Android Studio geralmente faz isso automaticamente, mas você pode forçar a sincronização clicando em `Sync Project with Gradle Files`.

4. Execute o projeto:
    - Conecte um dispositivo Android ou inicie um emulador.
    - Clique em `Run` ou use o atalho `Shift + F10`.

## Uso

1. Abra o aplicativo no seu dispositivo Android.
2. Navegue entre as telas demonstradas
3. Utilize o recurso superior para retornar a página principal.

## Arquitetura

O projeto segue a arquitetura MVC (Model-View-Controller), entretanto com as nomenclaturas alteradas:

- **Model:** Contém a lógica de dados e as classes de modelo, armazenando as classes de cada página do projeto e suas informações de modo privado

### Estrutura de Pastas

```markdown
- src/
  - main/
    - java/
      - com/projetosrafaelfemina/bancomr/
        - Model/
          - Balance.class
          - Invoices.class
          - Savings.class
          - Transfer.class
      - MainActivity.class
    - res/
      - drawable/
        - balance.png
        - ic_launcher_background.xml
        - ic_launcher_foreground.xml
        - ic_voltar.xml
        - invoices.png
        - savings.png
        - transfer.png
      - layout/
        - activity_balance.xml
        - activity_invoices.xml
        - activity_main.xml
        - activity_savings.xml
        - activity_transfer.xml
```
## Objetivos

Objetivo Principal:

Permitir que os usuários utilizem os recursos de navegação do Android, permitindo visualizar diferentes telas em dois layouts de forma dinâmica (constraint layout em duas orientações diferentes de tela)

Requisitos:

  - Demonstrar a navegação entre telas do Android com a linguagem Java
  - Exibir o consumo da biblioteca de forma eficaz
  - Utlizar diferentes layouts e diferentes orientações de telas
  - Manter uma arquitetura organizada (MVC).

## Tecnologias Utilizadas
  - Java
  - Android Studio
  - Consumo de bibliotecas
  - Manipulação de imagens internas


## Contribuição
Contribuições são bem-vindas! Siga os passos abaixo para contribuir:

  - Faça um fork do projeto
  - Crie uma branch para sua feature (git checkout -b feature/AmazingFeature)
  - Commit suas mudanças (git commit -m 'Add some AmazingFeature')
  - Push para a branch (git push origin feature/AmazingFeature)
  - Abra um Pull Request


## Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

## Contato

    - Nome: Rafael Luiz Femina
    - E-mail: rfemina2@gmail.com
    - Link do Projeto: https://github.com/rfemina/Via-Cep
    - Linkedin: https://www.linkedin.com/in/rafael-femina-0628692a0/

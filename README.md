# Solução Computacional

Sistema web desenvolvido para fins acadêmicos, com o objetivo de realizar o cadastro e gerenciamento de **usuários**, **projetos** e **equipes**.

O projeto foi criado como parte da atividade A3 do curso de Sistemas de Informação, aplicando conceitos de desenvolvimento web, programação orientada a objetos, organização em camadas e integração entre frontend e backend.

---

## Objetivo do Projeto

O objetivo principal do sistema é permitir o gerenciamento simples de informações relacionadas a usuários, projetos e equipes, facilitando o cadastro, a visualização e a associação entre esses dados.

A aplicação busca simular uma solução computacional básica para controle de projetos, permitindo que os usuários sejam vinculados a equipes e projetos de forma organizada.

---

## Funcionalidades

- Cadastro de usuários
- Cadastro de projetos
- Cadastro de equipes
- Listagem dos dados cadastrados
- Associação entre usuários, projetos e equipes
- Interface web simples e intuitiva
- Comunicação entre páginas HTML e backend Java
- Organização do projeto utilizando estrutura Maven

---

## Tecnologias Utilizadas

### Backend

- Java 21
- Spring Boot
- Spring Web
- Maven

### Frontend

- HTML5
- CSS3
- JavaScript

### Ferramentas

- IntelliJ IDEA
- VS Code
- Git
- GitHub

---

## Estrutura do Projeto

```text
solucao_computacional/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/solucao_computacional/
│       │       ├── controller/
│       │       ├── dto/
│       │       ├── model/
│       │       ├── repository/
│       │       ├── service/
│       │       └── SolucaoComputacionalApplication.java/
│       │
│       └── resources/
│           └── static/
│               ├── equipes.html
│               ├── index.html
│               ├── projetos.html
│               ├── usuarios.html
│
├── .gitattributes
├── .gitignore
├── README.md
└── pom.xml
```

---

## Como Executar o Projeto

### Pré-requisitos

Antes de executar o projeto, é necessário ter instalado:

- Java 21 ou superior
- Maven
- IntelliJ IDEA ou outra IDE compatível
- Git, caso deseje clonar o repositório

### Passo a passo

1. Clone o repositório:

```bash
git clone https://github.com/kellysabioni/solucao_computacional.git
```

2. Acesse a pasta do projeto:

```bash
cd solucao_computacional
```

3. Execute o projeto com Maven:

```bash
mvn spring-boot:run
```

4. Acesse a aplicação no navegador:

```text
http://localhost:8080
```

---

## Integrantes

### Kelly Cristina Sabioni

Responsável pelo **Frontend** do projeto.

Principais contribuições:

- Desenvolvimento das telas do sistema
- Organização visual da interface
- Estruturação das páginas HTML
- Estilização com CSS
- Apoio na navegação entre as telas

### João Gabriel Vieira da Silva

Responsável pelo **Backend** do projeto.

Principais contribuições:

- Desenvolvimento da lógica em Java
- Criação da estrutura com Spring Boot
- Organização das classes do sistema
- Criação dos endpoints e regras de funcionamento
- Integração entre frontend e backend

---

## Aprendizados

Durante o desenvolvimento do projeto, foram aplicados conceitos importantes da área de Sistemas de Informação, como:

- Desenvolvimento de aplicações web
- Separação entre frontend e backend
- Programação orientada a objetos
- Versionamento de código com Git e GitHub
- Organização de projeto com Maven
- Trabalho em equipe
- Planejamento e divisão de responsabilidades

---

## Status do Projeto

Projeto desenvolvido para fins acadêmicos e de estudo.

---

## Observação

Este sistema foi desenvolvido com foco em aprendizado, prática de programação e aplicação dos conhecimentos adquiridos durante o curso.

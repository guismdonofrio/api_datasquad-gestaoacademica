# Manual do Usuário

## Introdução

Este manual tem como objetivo orientar o uso do **Sistema de Gestão Acadêmica**, desenvolvido em **Java** utilizando **JavaFX** e **MaterialFX (tema Atlanta)** durante o projeto **API – Aprendizagem por Projetos Integrados 2026**.

A aplicação possui uma interface gráfica moderna e intuitiva, permitindo o gerenciamento de informações acadêmicas como cadastros, navegação entre telas e organização de dados.

**Público-alvo:** estudantes, professores e avaliadores que desejam utilizar ou testar o sistema.

---

## Objetivo do Sistema

O sistema tem como finalidade:

* Gerenciar informações acadêmicas (ex: usuários, professores, etc.)
* Fornecer uma interface moderna e responsiva
* Aplicar conceitos de desenvolvimento com JavaFX
* Servir como base prática para aprendizado em aplicações desktop

---

## Requisitos do Sistema

| Item | Requisito |
|------|-----------|
| Linguagem | Java 17 ou superior |
| IDE recomendada | IntelliJ IDEA |
| Interface gráfica | JavaFX |
| Componentes | MaterialFX |
| Memória | 8 GB RAM (mínimo) |

---

## Execução do Sistema

1. Abra o projeto no **IntelliJ IDEA**
2. Execute a classe principal (`Main.java`)
3. Aguarde a inicialização da interface gráfica

---

## Navegação do Sistema

Ao iniciar o sistema, o usuário terá acesso às seguintes telas:

* **Tela de Login**
* **Tela de Cadastro**
* **Tela Principal (Dashboard)**
* Outras telas específicas do sistema

A navegação é feita através de:

* Botões
* Menu lateral (hambúrguer ☰)
* Links entre telas

---

## Como Usar

### Login

* Insira seu usuário e senha
* Clique em **Entrar**
* Caso não tenha conta, clique em **Cadastrar**

---

### Cadastro

* Preencha os campos obrigatórios
* Clique em **Cadastrar**
* Após isso, volte para a tela de login

---

### Tela Principal

Após o login, o usuário poderá:

* Navegar entre funcionalidades
* Acessar diferentes módulos do sistema
* Visualizar informações cadastradas

---

## Funcionalidades

## Interface Gráfica Moderna

* Desenvolvida com **JavaFX**
* Componentes estilizados com **MaterialFX (Atlanta)**

### Navegação entre Telas

* Troca dinâmica de telas (FXML)
* Integração entre login e cadastro

### 🔹 Organização em MVC

* Separação entre:

  * Controller
  * Model
  * View

---

## Mensagens e Erros

O sistema possui validações para melhorar a experiência do usuário:

* Campos obrigatórios não preenchidos → aviso na tela
* Dados inválidos → solicitação de correção
* Falha de navegação → verificação de carregamento das telas

---

## Observações

* O sistema possui interface gráfica (não utiliza console)
* Utiliza o tema **Atlanta** para melhor experiência visual
* Pode sofrer alterações conforme evolução do projeto (sprints futuras)

---

## Futuras Melhorias

* Integração com banco de dados
* Sistema de autenticação completo
* Mais funcionalidades administrativas
* Versão responsiva / aprimorada

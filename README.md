# 🚀 First-Project-API | Cadastro de Usuários (Fullstack)

## 🌟 Visão Geral

Este projeto é uma aplicação Fullstack simples, desenvolvida para demonstrar a criação de uma **API RESTful** utilizando **Spring Boot (Java)** no Backend, e uma interface de cadastro no Frontend, utilizando **HTML, CSS e JavaScript**.

O objetivo é fornecer uma solução funcional para o gerenciamento de dados de usuários, com foco na arquitetura e na comunicação entre as duas camadas (Cliente e Servidor).

## 🛠️ Tecnologias Utilizadas

| Categoria | Tecnologia | Detalhes |
| :--- | :--- | :--- |
| **Backend (API)** | Java / Spring Boot | API RESTful com Endpoints CRUD para o recurso `/usuarios`. |
| **Persistência** | Spring Data JPA | Utilizado para facilitar a comunicação com o banco de dados. |
| **Frontend (UI)** | HTML, CSS e JavaScript | Interface simples para consumo da API. |
| **Gerenciador** | Maven | Utilizado para gestão de dependências e construção do projeto. |
| **Banco de Dados** | H2 Database (ou configurável) | Utilizado para persistência dos dados de `Usuario`. |

## 💻 Como Executar o Projeto

### 1. Pré-requisitos
* Java Development Kit (JDK) 17 ou superior.
* Maven 3.x.

### 2. Executando o Backend (API)

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/SeuUsuario/First-Project-API.git](https://github.com/SeuUsuario/First-Project-API.git)
    cd First-Project-API
    ```

2.  **Execute o Spring Boot:**
    * O Spring Boot se encarregará de iniciar o servidor na porta padrão `8080`.
    ```bash
    ./mvnw spring-boot:run
    # Se estiver no Windows:
    # mvnw.cmd spring-boot:run
    ```

### 3. Executando o Frontend (Interface de Cadastro)

1.  **Navegue** até a pasta que contém o arquivo `index.html`.
2.  **Abra o arquivo `index.html`** diretamente no seu navegador.

A interface fará requisições `POST` para `http://localhost:8080/usuarios`.

## 📌 Endpoints da API (Recurso: `/usuarios`)

A API expõe as operações CRUD básicas para o recurso `Usuario`:

| Método | Endpoint | Descrição | Classe/Interface |
| :--- | :--- | :--- | :--- |
| `GET` | `/usuarios` | Retorna uma lista de todos os usuários cadastrados. | `UsuarioController` |
| `POST` | `/usuarios` | Cria um novo usuário. | `UsuarioController` |
| `PUT` | `/usuarios` | Atualiza um usuário existente. | `UsuarioController` |
| `DELETE` | `/usuarios/{id}` | Exclui um usuário pelo `id`. | `UsuarioController` |

### Estrutura do Objeto `Usuario`

O modelo de dados esperado para o cadastro é:

| Campo | Tipo | Descrição |
| :--- | :--- | :--- |
| `id` | `Integer` | Chave primária (gerada automaticamente). |
| `nome` | `String` | Nome completo do usuário. |
| `email` | `String` | Endereço de e-mail. |
| `senha` | `String` | Senha do usuário. |
| `telefone` | `String` | Número de telefone. |

---

## 💡 Próximos Passos e Melhorias

Algumas ideias para evoluir este projeto:

* **Validação Frontend:** Adicionar validação JavaScript para garantir que os campos não estão vazios antes de enviar a requisição.
* **Melhoria de UI/UX:** Adicionar mensagens de sucesso ou erro (via JavaScript) para feedback ao usuário após o envio do formulário.
* **Security:** Implementar autenticação básica (ex: Spring Security) na API.

---

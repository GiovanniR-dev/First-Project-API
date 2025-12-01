# 🛡️ First-Project-API | Gerenciamento de Usuários (RESTful API)

## 🌟 Visão Geral do Projeto

Esta é uma API RESTful simples, desenvolvida para gerenciar e persistir dados de usuários. O projeto serve como um *template* inicial para aplicações backend, utilizando o poder do **Spring Boot** para oferecer *endpoints* CRUD (Create, Read, Update, Delete) de forma eficiente e rápida.

## 🛠️ Tecnologias Utilizadas

A seguir, estão as principais tecnologias utilizadas na construção desta aplicação:

| Categoria | Tecnologia | Versão |
| :--- | :--- | :--- |
| **Linguagem** | Java | 17+ |
| **Framework** | Spring Boot | 3.x |
| **Gerenciador de Dependências** | Maven | 3.x |
| **Banco de Dados** | H2 Database (ou MySQL/PostgreSQL configurável) | (Embutido/Configurável) |
| **ORM** | Spring Data JPA | - |

*(Adicione Badges aqui para um toque visual: )*

## 💻 Configuração e Instalação

Siga os passos abaixo para configurar e executar a API localmente.

### Pré-requisitos
* Java Development Kit (JDK) 17 ou superior.
* Maven 3.x.
* Um IDE de sua preferência (IntelliJ IDEA, VS Code, Eclipse).

### Executando a Aplicação

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/SeuUsuario/First-Project-API.git](https://github.com/SeuUsuario/First-Project-API.git)
    cd First-Project-API
    ```

2.  **Compile o projeto com Maven:**
    ```bash
    ./mvnw clean install
    ```
    *(Note: Se estiver no Windows, use `mvnw.cmd clean install`)*

3.  **Execute o Spring Boot:**
    ```bash
    ./mvnw spring-boot:run
    ```

A API estará disponível em `http://localhost:8080`.

## 📌 Endpoints da API (CRUD de Usuários)

A API expõe o recurso `/usuarios` e permite as seguintes operações:

| Método | Endpoint | Descrição | Corpo da Requisição (JSON) |
| :--- | :--- | :--- | :--- |
| `GET` | `/usuarios` | Lista todos os usuários cadastrados. | - |
| `POST` | `/usuarios` | Cria um novo usuário. | `{"nome": "...", "email": "...", "senha": "...", "telefone": "..."}` |
| `PUT` | `/usuarios` | Atualiza um usuário existente. | **[Corpo idêntico ao POST, incluindo o 'id']** |
| `DELETE` | `/usuarios/{id}` | Exclui o usuário pelo ID. | - |

### Exemplo de Requisição `POST`

**URL:** `http://localhost:8080/usuarios`
**Body:**
```json
{
    "nome": "João da Silva",
    "email": "joao@example.com",
    "senha": "senha123",
    "telefone": "11999999999"
}

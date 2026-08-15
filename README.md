# API de Gerenciamento de Usuários

API REST para cadastro e gerenciamento de usuários, com persistência em MySQL.
Implementa o CRUD completo em arquitetura de camadas, seguindo as convenções do
ecossistema Spring.

![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?logo=mysql&logoColor=white)
![License](https://img.shields.io/badge/license-MIT-blue)

---

## Funcionalidades

- Cadastro de usuário com validação de dados de entrada
- Listagem de todos os usuários cadastrados
- Busca por ID
- Atualização de dados
- Remoção de registro
- Tratamento de erro para usuário inexistente

---

## Arquitetura

Separação em camadas, cada uma com uma responsabilidade:

```
Requisição HTTP
      │
      ▼
┌──────────────┐   recebe a requisição, valida o payload,
│  Controller  │   devolve o status HTTP adequado
└──────┬───────┘
       ▼
┌──────────────┐   regra de negócio — decide o que pode
│   Service    │   e o que não pode acontecer
└──────┬───────┘
       ▼
┌──────────────┐   acesso ao banco via Spring Data JPA
│  Repository  │
└──────┬───────┘
       ▼
    MySQL
```

Essa divisão evita o erro clássico de colocar regra de negócio dentro do
controller — quando isso acontece, a lógica não dá para reaproveitar e o teste
unitário vira um teste de HTTP.

---

## Stack

| Camada | Tecnologia |
|---|---|
| Linguagem | Java 17 |
| Framework | Spring Boot 3 |
| Persistência | Spring Data JPA / Hibernate |
| Banco | MySQL 8 |
| Validação | Bean Validation (`jakarta.validation`) |
| Build | Maven |

---

## Como executar

### Pré-requisitos
- Java 17 ou superior
- Maven 3.8+
- MySQL 8 rodando localmente

### 1. Crie o banco

```sql
CREATE DATABASE gerenciamento_usuarios;
```

As tabelas são criadas automaticamente pelo Hibernate na primeira execução.

### 2. Configure a conexão

Em `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/gerenciamento_usuarios
spring.datasource.username=root
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> **Nunca comite a senha real.** Se este repo é público, use variáveis de
> ambiente: `spring.datasource.password=${DB_PASSWORD}` e adicione
> `application-local.properties` ao `.gitignore`.

### 3. Rode

```bash
git clone https://github.com/GiovanniR-dev/[https://github.com/GiovanniR-dev/First-Project-API].git
cd [https://github.com/GiovanniR-dev/First-Project-API]
./mvnw spring-boot:run
```

A API sobe em **http://localhost:8080**

---

## Endpoints

Base: `/usuarios`

| Método | Rota | Descrição | Status de sucesso |
|---|---|---|---|
| `GET` | `/usuarios` | Lista todos os usuários | `200 OK` |
| `GET` | `/usuarios/{id}` | Busca um usuário por ID | `200 OK` |
| `POST` | `/usuarios` | Cadastra um novo usuário | `201 Created` |
| `PUT` | `/usuarios/{id}` | Atualiza um usuário existente | `200 OK` |
| `DELETE` | `/usuarios/{id}` | Remove um usuário | `204 No Content` |

> Confira as rotas contra o `@RequestMapping` do seu controller.

### Exemplo — criar usuário

**Requisição**
```http
POST /usuarios
Content-Type: application/json

{
  "nome": "Giovanni Rodrigues",
  "email": "giovanni@exemplo.com"
}
```

**Resposta** — `201 Created`
```json
{
  "id": 1,
  "nome": "Giovanni Rodrigues",
  "email": "giovanni@exemplo.com"
}
```

### Exemplo — usuário inexistente

**Resposta** — `404 Not Found`
```json
{
  "timestamp": "2026-08-14T10:32:11",
  "status": 404,
  "mensagem": "Usuário não encontrado com o ID 99"
}
```

---

## Estrutura do projeto

```
src/main/java/com/giovanni/usuarios/
├── controller/
│   └── UsuarioController.java
├── service/
│   └── UsuarioService.java
├── repository/
│   └── UsuarioRepository.java
├── model/
│   └── Usuario.java
└── exception/
    └── UsuarioNaoEncontradoException.java
```

---

## Melhorias planejadas

- [ ] DTOs para separar o modelo de entrada/saída da entidade
- [ ] Paginação na listagem
- [ ] Testes unitários com JUnit e Mockito
- [ ] Documentação interativa com Swagger / OpenAPI
- [ ] Autenticação com Spring Security e JWT

---

## Autor

**Giovanni Rodrigues**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=flat&logo=linkedin&logoColor=white)]([SEU-LINKEDIN])
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/GiovanniR-dev)

# 💻 Frontend do Projeto First-Project-API | Formulário de Cadastro de Usuários

## 🌟 Visão Geral

Esta seção do projeto representa a interface de usuário (Frontend) desenvolvida em **HTML, CSS e JavaScript**. Seu principal objetivo é fornecer um formulário de cadastro simples e funcional para que o usuário possa interagir com a API de Backend, realizando a operação de **Cadastro (Create)** de novos usuários.

---

## 🛠️ Tecnologias e Arquivos

| Tecnologia | Arquivo | Função no Projeto |
| :--- | :--- | :--- |
| **HTML** | `index.html` | Define a estrutura do formulário, com campos para Nome, Email, Senha e Telefone. |
| **CSS** | `style.css` | Responsável pela estilização visual (cores, layout, centralização do `.box` e `form`), utilizando o fundo roxo escuro (`rgb(42, 22, 95)`). |
| **JavaScript** | `script.js` | Lógica de interação, captura de dados do formulário e envio da requisição `POST` para a API. |

---

## 🔗 Funcionamento: Comunicação com a API

A lógica para enviar os dados para o Backend está implementada no arquivo `script.js`.

### 1. Captura e Envio de Dados

O `script.js` escuta o evento de `submit` do formulário (`formulario.addEventListener`). A função `cadastrar()` é então executada:

* **Endpoint Alvo:** A requisição é enviada via `fetch` para `http://localhost:8080/usuarios`.
* **Método:** Utiliza o método **`POST`**.
* **Corpo da Requisição (JSON):** Os valores dos campos (`.nome`, `.email`, `.senha`, `.tel`) são capturados e enviados no corpo (`body`) da requisição, formatados como JSON.

### 2. Fluxo de Interação
1.  O formulário é submetido, prevenindo o *reload* da página (`event.preventDefault()`).
2.  A função `cadastrar()` envia os dados para a API.
3.  A função `limpar()` zera os valores de todos os campos do formulário imediatamente após o envio.
4.  O resultado da resposta da API é registrado no console do navegador (`console.log(res)`) para depuração.

---

## 🏃 Como Testar

1.  Certifique-se de que a API de Backend (no endereço `http://localhost:8080`) esteja em execução.
2.  Abra o arquivo **`index.html`** no seu navegador.
3.  Preencha todos os campos do formulário (Nome, Email, Senha, Telefone).
4.  Clique no botão **"Cadastrar"**.
5.  Abra o console do seu navegador (**F12**) para verificar a resposta (`res`) da API e confirmar o sucesso do cadastro.

---

Se precisar de ajuda para implementar mensagens de sucesso/erro na tela para o usuário, me avise!

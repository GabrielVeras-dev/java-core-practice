# Java Core Practice ☕🚀

Projeto desenvolvido para praticar **fundamentos de Java** com foco em:
- orientação a objetos
- boas práticas
- separação de responsabilidades
- código limpo e legível

## 🧠 Conceitos aplicados
- Classes imutáveis
- Validações no construtor (fail fast)
- Encapsulamento
- `equals` e `hashCode`
- Collections (`List`)
- Stream API
- `Optional`
- Separação em camadas:
  - Entity
  - Repository
  - Service

## 🏗️ Estrutura do projeto

```
src/main/java
src/main/java
└── com
    └── gabrielveras
        ├── Main.java
        └── core
            ├── User.java
            ├── UserRepository.java
            └── UserService.java
```
## ▶️ Executando o projeto

Via IDE (VS Code / IntelliJ):
- Execute a classe `Main`

Via terminal:
```bash
javac com/gabrielveras/Main.java
java com.gabrielveras.Main

```
📌 Observações

Este projeto utiliza armazenamento em memória, com o objetivo de focar em lógica, design e boas práticas, sem dependências externas

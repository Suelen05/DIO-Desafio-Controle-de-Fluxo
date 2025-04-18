# 🧮 Desafio Controle de Fluxo – Java Cloud Native

Este projeto foi desenvolvido como parte do curso **Java Cloud Native** oferecido pela **DIO (Digital Innovation One)** em parceria com o **Bradesco**.  
O objetivo do desafio é colocar em prática conceitos fundamentais de **controle de fluxo** em Java, utilizando estruturas condicionais e de repetição.

---

## 📝 Descrição do Projeto

O programa solicita dois parâmetros numéricos ao usuário e realiza uma contagem do número 1 até a diferença entre os dois valores.  
Caso o segundo parâmetro seja **menor que o primeiro**, o sistema lança uma **exceção personalizada** informando o erro.

---

## 💻 Tecnologias Utilizadas

- Java 17+
- IDE de sua preferência (Eclipse, IntelliJ, VSCode...)
- Scanner (entrada de dados via console)

---

## 📚 Aprendizados

- Leitura de dados com Scanner
- Criação e uso de **exceções personalizadas**
- Prática de boas práticas de organização e clareza de código
- Manipulação de fluxo de execução com `try/catch` e `throws`

Além disso, o desafio ajudou a desenvolver o raciocínio lógico aplicado à programação, pensando em **validação de dados de entrada**, controle de erros e mensagens claras para o usuário.

---

## 📂 Estrutura do Código

```java
public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosExeption {
        // Leitura dos parâmetros
        // Validação e chamada do método de contagem
    }

    static void contar(int contagem) {
        // Realiza a contagem e imprime os números
    }

    static void validarParametros(int parametro1, int parametro2) throws ParametrosInvalidosExeption {
        // Lança exceção se os parâmetros forem inválidos
    }
}
```
---

## 📦 Como Executar
1. Clone o repositório:

```bash
    git clone https://github.com/seu-usuario/desafio-controle-de-fluxo.git
```
2. Abra o projeto na sua IDE.

3. Execute a classe Contador.

---

## 👩‍💻 Desenvolvido por
Suelen Fraga
🔗 [LinkedIn](https://www.linkedin.com/in/suelen05/) | [GitHub](https://github.com/Suelen05) |
[E-mail](suelen05@edu.unisinos.br)

Projeto do curso Java Cloud Native – DIO + Bradesco

"Desafios simples são portas para aprendizados profundos." 🚀

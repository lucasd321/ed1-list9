# Sistema de Gerenciamento de Inventário de Livros

Este é um aplicativo de console simples, baseado em Java, projetado para gerenciar uma lista de livros usando IDs únicos. Ele demonstra a implementação de um **TAD (Tipo de Dados Abstrato)** usando arrays para realizar operações CRUD (Criar, Ler, Atualizar, Excluir) em uma lista de capacidade fixa.

---

## 🚀 Recursos

O sistema oferece uma interface orientada a menus com as seguintes funcionalidades:

* **Adicionar Livros:** Insere um ID de livro na lista (verifica se a lista está cheia).

* **Remover por ID:** Busca um ID específico e o remove, movendo os itens subsequentes para manter a ordem.

* **Remover por Posição:** Exclui um livro com base em seu índice no array.

* **Buscar:** Encontra a posição (índice) de um livro pelo seu ID.

* **Atualizar:** Substitui o ID de um livro existente por um novo.

* **Relatório de Status:** Verifique a contagem total de livros e veja se a lista atingiu sua capacidade máxima.

* **Limpar Lista:** Reinicie todo o inventário de uma só vez.

---

## 🛠️ Estrutura do Projeto

O projeto está organizado em três arquivos principais:

1. **`BookListTAD.java`**: A interface que define o contrato (métodos) que a lista de livros deve implementar.

2. **`BookList.java`**: A implementação concreta da lógica usando um array de inteiros.

3. **`Main.java`**: O ponto de entrada do aplicativo, contendo a interface do usuário e a lógica do menu.

---

## 📋 Requisitos

* **Java Development Kit (JDK)** 8 ou superior.

* Um terminal ou IDE (IntelliJ IDEA, Eclipse, VS Code).

---

## ⚙️ Como executar

1. **Clone ou copie** os arquivos para um único diretório.

2. **Compile** os arquivos usando um terminal:
    ```bash
    javac BookListTAD.java BookList.java Main.java
    ```
3. **Execute** o aplicativo:
    ```bash
    java principal
    ```

---

## 📖 Exemplo de uso

Ao iniciar, o programa solicitará a capacidade máxima:
```texto
Digite a capacidade máxima da sua lista de livros: 
> 10
```

Então, você pode interagir com o menu:
```texto
--- MENU DA LISTA DE LIVROS ---
1. Adicionar livros (ID)
2. Remover livros (por ID)
...
Escolha uma opção: 
> 1
Digite o ID do livro: 
> 101
```

---

## 🧠 Conceitos Técnicos Aplicados

* **Encapsulamento:** A matriz interna e o contador são privados, Acessado somente por meio de métodos públicos.
* **Interfaces:** Uso de `BookListTAD` para definir o comportamento independentemente da implementação.

* **Manipulação de Arrays:** Tratamento manual de deslocamentos de elementos durante a remoção e validação de índice.

* **Loops Lógicos:** Uso de `do-while` e `switch-case` para navegação.

  # Book Inventory Management System

This is a simple Java-based console application designed to manage a list of books using unique IDs. It demonstrates the implementation of a **TAD (Abstract Data Type)** using arrays to perform CRUD-like operations (Create, Read, Update, Delete) on a fixed-capacity list.

---

## 🚀 Features

The system provides a menu-driven interface with the following functionalities:

* **Add Books:** Insert a book ID into the list (checks if the list is full).
* **Remove by ID:** Search for a specific ID and remove it, shifting subsequent items to maintain order.
* **Remove by Position:** Delete a book based on its index in the array.
* **Search:** Find the position (index) of a book by its ID.
* **Update:** Replace an existing book ID with a new one.
* **Status Reporting:** Check the total count of books and see if the list has reached its maximum capacity.
* **Clear List:** Reset the entire inventory at once.

---

## 🛠️ Project Structure

The project is organized into three main files:

1.  **`BookListTAD.java`**: The Interface defining the contract (methods) that the book list must implement.
2.  **`BookList.java`**: The concrete implementation of the logic using an integer array.
3.  **`Main.java`**: The entry point of the application containing the user interface and menu logic.

---

## 📋 Requirements

* **Java Development Kit (JDK)** 8 or higher.
* A terminal or IDE (IntelliJ IDEA, Eclipse, VS Code).

---

## ⚙️ How to Run

1.  **Clone or copy** the files into a single directory.
2.  **Compile** the files using a terminal:
    ```bash
    javac BookListTAD.java BookList.java Main.java
    ```
3.  **Run** the application:
    ```bash
    java Main
    ```

---

## 📖 Usage Example

Upon starting, the program will ask for the maximum capacity:
```text
Digite a capacidade máxima da sua lista de livros: 
> 10
```

Then, you can interact with the menu:
```text
--- MENU DA LISTA DE LIVROS ---
1. Adicionar livros (ID)
2. Remover livros (por ID)
...
Escolha uma opção: 
> 1
Digite o ID do livro: 
> 101
```

---

## 🧠 Technical Concepts Applied

* **Encapsulation:** The internal array and counter are private, accessed only through public methods.
* **Interfaces:** Use of `BookListTAD` to define behavior independently of the implementation.
* **Array Manipulation:** Manual handling of element shifts during removal and index validation.
* **Logic Loops:** Use of `do-while` and `switch-case` for navigation.

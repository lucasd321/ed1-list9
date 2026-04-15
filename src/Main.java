import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a capacidade da sua lista de livros: ");
        int tamanho = scanner.nextInt();

        BookList minhaEbook = new BookList(tamanho);

        int opcao;
        do {
            System.out.println("\n--- MENU DA LISTA DE LIVROS ---");
            System.out.println("1. Adicionar livros por ID");
            System.out.println("2. Remover livros por ID");
            System.out.println("3. Remover pela Posição");
            System.out.println("4. Buscar livros por ID");
            System.out.println("5. Atualizar ID livros");
            System.out.println("6. Ver Total de livros e seu Status");
            System.out.println("7. Limpar lista de livros");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    if (minhaEbook.estaCheia()) {
                        System.out.println("Erro:lista de livros lotada!");
                    } else {
                        System.out.println("Digite o ID do livro: ");
                        int id = scanner.nextInt();
                        minhaEbook.addBook(id);
                        System.out.println();
                        System.out.println("Livro adicionado");
                    }
                    break;

                case 2:
                    System.out.println("Digite o ID para remover: ");
                    int idRemover = scanner.nextInt();
                    System.out.println();

                    if (minhaEbook.removerBook(idRemover)) {
                        System.out.println("livro removido!");
                    } else {
                        System.out.println("livros não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Digite a posição (0 a " + (minhaEbook.totalBook() - 1) + "): ");
                    int pos = scanner.nextInt();
                    System.out.println();

                    if (minhaEbook.removerPorPosicao(pos)) {
                        System.out.println("Posição removida!");
                    } else {
                        System.out.println("Posição inválida.");
                    }
                    break;

                case 4:
                    System.out.println("Digite o ID para buscar: ");
                    int idBusca = scanner.nextInt();
                    System.out.println();

                    if (minhaEbook.verificarExistencia(idBusca)) {
                        int index = minhaEbook.obterBookPorPosicao(idBusca);

                        System.out.println("livro encontrado na posição: " + index);
                    } else {
                        System.out.println("livros não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("ID antigo: ");
                    int antigo = scanner.nextInt();
                    System.out.println("Novo ID: ");
                    int novo = scanner.nextInt();

                    minhaEbook.atualizarID(antigo, novo);

                    System.out.println();
                    System.out.println("Processo de atualização concluído.");
                    break;

                case 6:
                    System.out.println("Total de livros: " + minhaEbook.totalBook());
                    System.out.println("Está cheia? " + (minhaEbook.estaCheia() ? "Sim" : "Não"));
                    break;

                case 7:
                    minhaEbook.limparListaBook();
                    System.out.println("lista de livros zerada.");
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
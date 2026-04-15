public interface BookListTAD {

    void addBook(int ID);
    void atualizarID(int antigoID, int novoID);

    boolean removerBook(int ID);
    boolean removerPorPosicao(int posicao);
    boolean limparListaBook();

    boolean buscaBook(int ID);
    int obterBookPorPosicao(int ID);
    int totalBook();

    boolean estaCheia();
    boolean verificarExistencia(int ID);
}
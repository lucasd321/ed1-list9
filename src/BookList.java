public class BookList implements BookListTAD {
    private int[] listaBook = new int[5];
    private int contador;

    public BookList(int tamanho)
    {
        this.listaBook = new int[tamanho];
        this.contador = 0;
    }

    @Override
    public void addBook(int ID){
        listaBook[contador] = ID;
        contador++;
    }

    @Override
    public void atualizarID(int antigoID, int novoID)
    {
        for(int i = 0; i < contador; i++){
            if(listaBook[i] == antigoID){
                listaBook[i] = novoID;
            }
        }
    }

    @Override
    public boolean removerBook(int ID)
    {
        int indice = -1;

        for(int i = 0; i < contador; i++){
            if(listaBook[i] == ID){
                indice = i;
                break;
            }
        }

        if(indice != -1){
            for(int i = indice; i < contador - 1; i++){
                listaBook[i] = listaBook[i + 1];
            }
            contador --;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean removerPorPosicao(int posicao){
        if(posicao < 0 || posicao > contador){
            return false;
        }

        for(int i = posicao; i < contador; i++){
            listaBook[i] = listaBook[i + 1];
        }

        contador --;
        return true;
    }

    @Override
    public boolean limparListaBook()
    {
        for(int i = 0; i < contador; i++){
            listaBook[i] = 0;
        }
        contador = 0;
        return true;
    }

    @Override
    public boolean buscaBook(int ID){
        boolean encontrado = false;

        for(int i = 0; i < contador; i++){
            if(listaBook[i] == ID){
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    @Override
    public int obterBookPorPosicao(int ID){
        int indice = -1;

        for(int i = 0; i < contador; i++){
            if(listaBook[i] == ID){
                indice = i;
                break;
            }
        }
        return indice;
    }

    @Override
    public int totalBook(){
        return contador;
    }

    @Override
    public boolean estaCheia(){
        if(contador == listaBook.length){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean verificarExistencia(int ID){
        for(int i = 0; i < contador; i++){
            if(listaBook[i] == ID){
                return true;
            }
        }
        return false;
    }
}
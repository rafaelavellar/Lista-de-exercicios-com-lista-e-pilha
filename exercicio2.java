class ListaArrayString {
    private String[] array;
    private int tamanho;

    public ListaArrayString(int capacidade) {
        this.array = new String[capacidade];
        this.tamanho = 0;
    }

    
    public void adicionar(String elemento) {
        if (tamanho == array.length) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        array[tamanho++] = elemento;
    }

    
    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Erro: Posição inválida!");
            return;
        }
        
        for (int i = posicao; i < tamanho - 1; i++) {
            array[i] = array[i + 1];
        }
        tamanho--;
    }

    
    public void imprimirLista() {
        System.out.print("Lista de Nomes: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    
    public int buscarNome(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i].equals(nome)) {
                return i;  // Retorna o índice do nome encontrado
            }
        }
        return -1;  // Retorna -1 se o nome não for encontrado
    }
}

public class TesteListaString {
    public static void main(String[] args) {
        ListaArrayString lista = new ListaArrayString(6);
        
        
        lista.adicionar("Ana");
        lista.adicionar("Bruno");
        lista.adicionar("Carlos");
        lista.adicionar("Daniela");
        
        
        lista.imprimirLista();
        
        
        lista.remover(1);
        lista.imprimirLista();
        
        
        String nomeBuscar = "Carlos";
        int posicao = lista.buscarNome(nomeBuscar);
        
        if (posicao != -1) {
            System.out.println("O nome " + nomeBuscar + " foi encontrado na posição: " + posicao);
        } else {
            System.out.println("O nome " + nomeBuscar + " não foi encontrado na lista.");
        }
        
        
        nomeBuscar = "João";
        posicao = lista.buscarNome(nomeBuscar);
        
        if (posicao != -1) {
            System.out.println("O nome " + nomeBuscar + " foi encontrado na posição: " + posicao);
        } else {
            System.out.println("O nome " + nomeBuscar + " não foi encontrado na lista.");
        }
    }
}

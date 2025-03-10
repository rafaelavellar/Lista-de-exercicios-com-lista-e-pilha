class ListaArray {
    private int[] array;
    private int tamanho;

    public ListaArray(int capacidade) {
        this.array = new int[capacidade];
        this.tamanho = 0;
    }

    // Método para adicionar um elemento ao final da lista
    public void adicionar(int elemento) {
        if (tamanho == array.length) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        array[tamanho++] = elemento;
    }

    // Método para adicionar um elemento em uma posição específica
    public void adicionarNaPosicao(int elemento, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Erro: Posição inválida!");
            return;
        }
        if (tamanho == array.length) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        
        // Deslocar os elementos para a direita
        for (int i = tamanho; i > posicao; i--) {
            array[i] = array[i - 1];
        }
        
        // Inserir o novo elemento
        array[posicao] = elemento;
        tamanho++;
    }

    // Método para remover um elemento de uma posição específica
    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Erro: Posição inválida!");
            return;
        }
        // Deslocar os elementos para a esquerda
        for (int i = posicao; i < tamanho - 1; i++) {
            array[i] = array[i + 1];
        }
        tamanho--;
    }

    // Método para imprimir todos os elementos da lista
    public void imprimirLista() {
        System.out.print("Lista: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class TesteLista {
    public static void main(String[] args) {
        ListaArray lista = new ListaArray(5);
        
        // Adicionando elementos ao final da lista
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        
        // Imprimindo a lista após adicionar elementos
        lista.imprimirLista();
        
        // Removendo o elemento da posição 1
        lista.remover(1);
        
        // Imprimindo a lista após remover o elemento
        lista.imprimirLista();
        
        // Adicionando um elemento na posição 1
        lista.adicionarNaPosicao(25, 1);
        
        // Imprimindo a lista após adicionar o elemento na posição 1
        lista.imprimirLista();
    }
}



public class BTree<T extends Comparable<T>> {

    private int grau;
    private BNode<T> raiz;

    public BTree(int grau) {
        this.grau = grau;
        raiz = new BNode<>(grau);
    }

    
    public void inserir(T valor) {
    }

    public void remover(T valor) {
        // Implemente a remoção aqui
    }

    public T encontrarMaiorChave() {
        // Implemente a busca pela maior chave aqui
        return null;
    }

    public T encontrarMenorChave() {
        // Implemente a busca pela menor chave aqui
        return null;
    }

    public int calcularAltura() {
        // Implemente o cálculo da altura aqui
        return -1;
    }

    public BNode<T> encontrarValor(T valor) {
        // Implemente a busca pelo valor aqui
        return null;
    }

    public void exibirChavesPorNivel() {
        // Implemente a exibição por nível aqui
    }

    public void exibirChavesPreOrdem() {
        // Implemente a exibição em pré-ordem aqui
    }

    // Outros métodos auxiliares

    // Você precisará implementar métodos para dividir e fundir nós, etc.

    public static void main(String[] args) {
        // Exemplo de uso da árvore B
        BTree<Integer> arvoreB = new BTree<>(5);
        arvoreB.inserir(10);
        arvoreB.inserir(20);
        arvoreB.inserir(5);
        // ... outros comandos ...
    }
}

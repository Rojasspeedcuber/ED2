public class BTree<T extends Comparable<T>> {
    
    private BNode<T> raiz;
    private int ordem;
    
    BTree(int n){
        this.raiz = new BNode<T>(n);
        this.ordem = n;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public BNode<T> getRaiz() {
        return raiz;
    }

    public void inserir(T valor){
        
    }
}

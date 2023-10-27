public class BNode<T extends Comparable<T>> {
    
    private int n;
    private Object[] chaves;
    private BNode<T>[] filhos;
    

    BNode(int m) {
        n = 0;
        chaves = new Object[m - 1];
        filhos = new BNode[m];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Object[] getChaves() {
        return chaves;
    }

    public void setChaves(Object[] chaves) {
        this.chaves = chaves;
    }

    public BNode<T>[] getFilhos() {
        return filhos;
    }

    public void setFilhos(BNode<T>[] filhos) {
        this.filhos = filhos;
    }

    
}

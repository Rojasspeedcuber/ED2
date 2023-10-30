public class BNode<T extends Comparable<T>> {
    
    private int n;
    private Object[] chaves;
    private BNode<T>[] filhos;
    

    BNode(int m) {
        chaves = new Object[m - 1];
        filhos = new BNode[m];
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


    public void setFilhos(BNode[] filhos) {
        this.filhos = filhos;
    }


    public int getN() {
        return n;
    }
    
}

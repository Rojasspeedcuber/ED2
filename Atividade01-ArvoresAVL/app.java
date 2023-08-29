public class app {
    public static void main(String[] args) {
        AVLTree<Integer> tree = new AVLTree<Integer>();
        tree.inserir(2);
        tree.inserir(1);
        tree.inserir(4);
        tree.inserir(5);
        tree.inserir(9);
        tree.inserir(3);
        tree.inserir(6);
        tree.inserir(7);

        tree.passeioPorNivel();

        tree.passeioEmOrdem();
    }
}

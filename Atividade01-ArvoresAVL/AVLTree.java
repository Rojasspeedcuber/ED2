public class AVLTree<T extends Comparable<T>> {
    private AVLNode<T> raiz;

    AVLTree() {
        this.raiz = null;
    }

    private boolean isEmpty(){
        return raiz == null;
    }

    public void passeioPorNivel() {
        if (isEmpty()) {
            return;
        }

        int treeHeight = getHeight(raiz);
        for (int level = 0; level <= treeHeight; level++) {
            printNodesAtNivel(raiz, level);
            System.out.println();
        }
    }

    private void printNodesAtNivel(AVLNode<T> node, int level) {
        if (node == null) {
            return;
        }
        if (level == 0) {
            System.out.print(node.getInfo() + "(" + getLevel(raiz, node, 0) + ") ");
        } else {
            printNodesAtNivel(node.getLeft(), level - 1);
            printNodesAtNivel(node.getRight(), level - 1);
        }
    }

    private int getHeight(AVLNode<T> node) {
        if (node == null) {
            return -1;
        }
        return 1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));
    }

    private int getLevel(AVLNode<T> current, AVLNode<T> target, int level) {
        if (current == null) {
            return -1;
        }
        if (current == target) {
            return level;
        }
        int leftLevel = getLevel(current.getLeft(), target, level + 1);
        if (leftLevel != -1) {
            return leftLevel;
        }
        return getLevel(current.getRight(), target, level + 1);
    }

    public void inserir(T value) {
        raiz = inserir(raiz, value);
    }

    private AVLNode<T> inserir(AVLNode<T> node, T value) {
        if (node == null) {
            return new AVLNode<>(value);
        }

        if (value.compareTo(node.getInfo()) < 0) {
            node.setLeft(inserir(node.getLeft(), value));
        } else if (value.compareTo(node.getInfo()) > 0) {
            node.setRight(inserir(node.getRight(), value));
        } else {
            return node;
        }

        updateBalanceFactor(node);
        return balance(node);
    }

    private void updateBalanceFactor(AVLNode<T> node) {
        int leftHeight = getHeight(node.getLeft());
        int rightHeight = getHeight(node.getRight());
        node.setFatBal(rightHeight - leftHeight);
    }

    private AVLNode<T> balance(AVLNode<T> node) {
        if (node.getFatBal() < -1) {
            if (node.getLeft().getFatBal() > 0) {
                node.setLeft(rotateLeft(node.getLeft()));
            }
            return rotateRight(node);
        }
        if (node.getFatBal() > 1) {
            if (node.getRight().getFatBal() < 0) {
                node.setRight(rotateRight(node.getRight()));
            }
            return rotateLeft(node);
        }
        return node;
    }

    private AVLNode<T> rotateRight(AVLNode<T> node) {
        AVLNode<T> novaRaiz = node.getLeft();
        node.setLeft(novaRaiz.getRight());
        novaRaiz.setRight(node);
        updateBalanceFactor(node);
        updateBalanceFactor(novaRaiz);
        return novaRaiz;
    }

    private AVLNode<T> rotateLeft(AVLNode<T> node) {
        AVLNode<T> novaRaiz = node.getRight();
        node.setRight(novaRaiz.getLeft());
        novaRaiz.setLeft(node);
        updateBalanceFactor(node);
        updateBalanceFactor(novaRaiz);
        return novaRaiz;
    }

    public void passeioEmOrdem() {
        passeioEmOrdem(raiz);
        System.out.println(); // Pula uma linha após o passeio em ordem
    }

    private void passeioEmOrdem(AVLNode<T> node) {
        if (node != null) {
            passeioEmOrdem(node.getLeft());
            System.out.print(node.getInfo() + " ");
            passeioEmOrdem(node.getRight());
        }
    }

}



package Hashing;

public class ListaCarros {

    private Carro[] carros;
    private int qtd;

    public ListaCarros() {
        this.carros = new Carro[10]; 
        this.qtd = 0;
    }

    public boolean isEmpty() {
        return this.qtd == 0;
    }

    public void inserir(Carro c) {
        if (this.qtd == this.carros.length) {
            Carro[] novoArray = new Carro[this.carros.length * 2];
            System.arraycopy(this.carros, 0, novoArray, 0, this.carros.length);
            this.carros = novoArray;
        }

        this.carros[this.qtd] = c;
        this.qtd++;
    }

    public void listar() {
        if (this.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            for (int i = 0; i < this.qtd; i++) {
                System.out.println(this.carros[i]);
            }
        }
    }

    public void gravarLista() {
        if (this.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            ArquivoBinario arq = new ArquivoBinario();
            arq.openToWrite("lista.txt");
            for (int i = 0; i < this.qtd; i++) {
                arq.gravarDados(this.carros[i]);
            }
            arq.closeWriteFile();
        }
    }

    public void carregarLista() {
        ArquivoBinario arq = new ArquivoBinario();
        boolean exists = arq.openToRead("lista.txt");
        if (exists) {
            Carro car = arq.lerDados();
            while (car != null) {
                this.inserir(car);
                car = arq.lerDados();
            }
            arq.closeReadFile();
        }
    }
}
